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
import java.util.List;  
import javax.servlet.http.HttpSession;
/**
 *
 * @author MIES
 */
public class ViewServlet extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<html><head><link rel='stylesheet' href='tablestyle.css'></head>");
            HttpSession session=request.getSession(); 
            String user=(String)session.getAttribute("uname");
        
        //redirect user to login page if not logged in
        if(user==null){
           response.sendRedirect("login.jsp");
        }
        
        out.print("<a style='float: right' href='logout.jsp'>Logout</a>");
             out.println("<a href='index.jsp'>Add New Product</a>"); 
        out.println("<h1>Product Details</h1>");  
          
        List<Emp> list=EmpDao.getAllEmployees();  
        out.print("<div>");
        out.print("<table class='rwd-table' align='left'>");  
        out.print("<tr><th>Code</th><th>name</th><th>price</th><th>quantity</th><th>Edit</th><th>Delete</th></tr>");  
        for(Emp e:list)
        {
            out.print("<tr><td>"+e.getIc()+"</td><td>"+e.getIn()+"</td><td>"+e.getIp()+"</td><td>"+e.getQty()+"</td><td><a href='EditServlet?id="+e.getIc()+"'>edit</a></td><td><a href='DeleteServlet?id="+e.getIc()+"'>delete</a></td></tr>");  
        }  
        out.print("</table></div></html>");  
          
        out.close();  
        }
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
