package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class salesreport_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/menu.html");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<style>\r\n");
      out.write("ul\r\n");
      out.write("{\r\n");
      out.write("\tlist-style-type:none;\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("\toverflow: hidden;\r\n");
      out.write("\tbackground-color: #333;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("li\r\n");
      out.write("{\r\n");
      out.write("\tfloat: right;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("li a\r\n");
      out.write("{\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tpadding: 14px 16px;\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("li a:hover:not(.active)\r\n");
      out.write("{\r\n");
      out.write("\tbackground-color: #111;\r\n");
      out.write("}\r\n");
      out.write(".active{\r\n");
      out.write("\tbackground-color: red;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<ul>\r\n");
      out.write("  <li><a class=\"active\" href=\"login.jsp\">Home</a></li>\r\n");
      out.write("  <li><a href=\"Contact.jsp\">Contact</a></li>\r\n");
      out.write("  <li><a href=\"About.jsp\">About</a></li>\r\n");
      out.write("</ul>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Sales Report</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"formstyle.css\">\n");
      out.write("        <script>\n");
      out.write("            function change(){\n");
      out.write("                document.getElementById(\"textbox\").value = document.getElementById(\"dropdown\").value;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("            \n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background-color: grey;\n");
      out.write("            }\n");
      out.write("          </style>\n");
      out.write("            \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"container\">\n");
      out.write("        ");

            try
            {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","0000");
            Statement st=con.createStatement();
            
            String tid="",uid="",zone="",prsold="",dsold="",cn="",ic="";
            int qsold=0,amt=0,price=0,tamt=0;
            
            ResultSet res1=st.executeQuery("SELECT tran_id FROM salesreport"); 
            int id=0; 
            if(res1.last())
            { 
                    id=res1.getInt("tran_id"); 
            } 
            ++id;
            
            String query="select * from master";
            ResultSet res=st.executeQuery(query);
            
        
      out.write("\n");
      out.write("        <form method=\"post\" action=\"\">\n");
      out.write("            <fieldset>\n");
      out.write("                <legend>Sales Report</legend>\n");
      out.write("            <table align=\"center\">\n");
      out.write("                \n");
      out.write("                <tr><td>Transaction id</td><td><input type=\"text\" name=\"t1\" value=\"");
 out.println(id);
      out.write("\" readonly></td></tr>\n");
      out.write("                <tr><td>Adhaar</td><td><input type=\"text\" name=\"t2\"></td></tr>\n");
      out.write("                <tr><td>Zone</td><td><input type=\"text\" name=\"t3\"></td></tr>\n");
      out.write("                <tr><td>Item code</td><td>\n");
      out.write("                    <select name=\"t9\" id=\"dropdown\" onChange=\"change();\" style=\"width:100px\" >\n");
      out.write("                        <option value=\"\">Select item</option>\n");
      out.write("                        ");
  while(res.next()){ 
      out.write("\n");
      out.write("                        \n");
      out.write("                            <option value=\"");
      out.print( res.getString(2));
      out.write('"');
      out.write('>');
      out.print( res.getString(1));
      out.write("</option>\n");
      out.write("                        ");
 
                            }
                        
      out.write("\n");
      out.write("                    </select></td></tr>\n");
      out.write("                \n");
      out.write("         ");

            // res.close();
            ic=request.getParameter("t9");
            tid=request.getParameter("t1");
            uid=request.getParameter("t2");
            zone=request.getParameter("t3");
            
      out.write("\n");
      out.write("            <tr><td>Product</td><td><input type=\"text\" id=\"textbox\" name=\"t4\"></td></tr>\n");
      out.write("            \n");
      out.write("                <tr><td>Quantity</td><td><input type=\"text\" name=\"t5\"></td></tr>\n");
      out.write("                <tr><td>Date of Sale</td><td><input type=\"date\" name=\"d1\"></td></tr>  \n");
      out.write("                <tr><td>Price</td><td><input type=\"text\" name=\"t6\"></td></tr>              \n");
      out.write("                \n");
      out.write("                <tr><td>Customer name</td><td><input type=\"text\" name=\"t8\"></td></tr>\n");
      out.write("                <tr><td></td><td><input type=\"submit\" value=\"Submit\"></td></tr>\n");
      out.write("            </table>\n");
      out.write("                </fieldset>\n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("           \n");
      out.write("                       \n");
      out.write("              ");

        String email=(String)session.getAttribute("email");
        
        //redirect user to login page if not logged in
        if(email==null){
            response.sendRedirect("login.jsp");
        }
        
      out.write("\n");
      out.write("\n");
      out.write("        <a style=\"float: right\" href=\"logout.jsp\">Logout</a>   \n");
      out.write("            ");

            prsold=request.getParameter("t4");
            qsold=Integer.parseInt(request.getParameter("t5"));
            dsold=request.getParameter("d1");
            
            price=Integer.parseInt(request.getParameter("t6"));
            
            cn=request.getParameter("t8");    
            
            tamt=(int)qsold*(int)price;
            
            
           
            {
                 String sql=" insert into salesreport(adhaar,zone,pro_sold,qty_sold,date_sold,price,total_amt,cust_name) values('"+uid+"','"+zone+"','"+prsold+"','"+qsold+"','"+dsold+"','"+price+"','"+tamt+"','"+cn+"')";
                 String sql_master="update master set quantity = (quantity-'"+qsold+"') where it_code='"+ic+"'";
                 int aa=st.executeUpdate(sql);
                 int cc=st.executeUpdate(sql_master);
                 if(aa==1 && cc==1)
                 {
                   out.println("Data added Successfully");
                   out.println("<br>");
                   out.println("<a href='viewsales.jsp'>Click to view record</a>");
                   out.println("");
               }
               else
                   out.println("---Unsuccess-----");
            }
            con.close();
            }
            catch(Exception e)
            {
                out.println("");
            }
        
      out.write("\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
