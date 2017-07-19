/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ab;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author MIES
 */
public class EditServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
         response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
          
         HttpSession session=request.getSession(); 
            String user=(String)session.getAttribute("uname");
        
        //redirect user to login page if not logged in
        if(user==null){
           response.sendRedirect("login.jsp");
        }
        
        out.print("<a style='float: right' href='logout.jsp'>Logout</a>");
        String sid=request.getParameter("id");  
        
          
        Emp e=EmpDao.getEmployeeById(sid);  
        out.print("<html><head><link rel='stylesheet' href='formstyle.css'></head><body id='container'>");
        out.print("<form action='EditServlet2' method='post'><fieldset><legend>Update Item details</legend>");  
        out.print("<table>");  
        out.print("<tr><td>Item code</td><td><input type='text' name='code' value='"+e.getIc()+"'/></td></tr>");  
        out.print("<tr><td>Item name:</td><td><input type='text' name='name' value='"+e.getIn()+"'/></td></tr>");  
        out.print("<tr><td>Item price:</td><td><input type='text' name='price' value='"+e.getIp()+"'/></td></tr>");  
        out.print("<tr><td>Quantity:</td><td><input type='text' name='quantity' value='"+e.getQty()+"'/></td></tr>"); 
        out.print("<tr><td colspan='2'><input type='submit' value='Edit & Save '/></td></tr>");  
        out.print("</table></fieldset>");  
        out.print("</form></body></html>");  
          
        out.close();  
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
