package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class product_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\tfloat: left;\r\n");
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
      out.write("\tbackground-color: #4caf50;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<ul>\r\n");
      out.write("  <li><a class=\"active\" href=\"#home\">Home</a></li>\r\n");
      out.write("  <li><a href=\"first.html\" >news</a></li>\r\n");
      out.write("  <li><a href=\"form1.html\">contact</a></li>\r\n");
      out.write("  <li><a href=\"about\">About</a></li>\r\n");
      out.write("  <li><a href=\"profile.jsp\">Profile</a></li>\r\n");
      out.write("</ul>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form method=\"post\" action=\"product.jsp\">\n");
      out.write("        <table border=\"2\">\n");
      out.write("            <tr><th></th><th>Data Entry Screen for Master</th><th></th></tr>\n");
      out.write("            <tr><td>Enter Item Code:</td><td><input type=\"text\" name=\"t1\" required=\"\"></td>\n");
      out.write("                <td></td></tr>\n");
      out.write("            <tr><td>Enter Item Name:</td><td><input type=\"text\" name=\"t2\" required=\"\"></td>\n");
      out.write("                <td></td></tr>\n");
      out.write("            <tr><td>Enter Price:</td><td><input type=\"text\" name=\"t3\" required=\"\"></td>\n");
      out.write("                <td></td></tr>\n");
      out.write("            <tr><td>Quantity on Hand:</td><td><input type=\"text\" name=\"t4\" required=\"\"></td>\n");
      out.write("                <td></td></tr>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <tr><td>Submit</td><td><input type=\"submit\" value=\"Click Here\"></td>\n");
      out.write("                <td></td></tr>\n");
      out.write("            \n");
      out.write("               \n");
      out.write("        </table>\n");
      out.write("        </form>\n");
      out.write("      ");
 
          try
          {
            String ic="",in="",pr="";
            int qty=0;
            
            ic=request.getParameter("t1");
            in=request.getParameter("t2");
            pr=request.getParameter("t3");
            qty=Integer.parseInt(request.getParameter("t4"));
            
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","0000");
            
      out.write("\n");
      out.write("            <table align=\"center\" border=\"2\">\n");
      out.write("                <tr><td>");
out.println("<b><font color=blue size=10>You have Enetred</font>");
      out.write("</td></tr>\n");
      out.write("                <tr><td>");
out.println("<font color=blue size=10>Item Number "+ic+"</font>");
      out.write("</td></tr>   \n");
      out.write("                <tr><td>");
out.println("<font color=blue size=10>Item Name "+in+"</font>");
      out.write("</td></tr>   \n");
      out.write("                <tr><td>");
out.println("<font color=blue size=10>Price "+pr+"</font>");
      out.write("</td></tr>   \n");
      out.write("                <tr><td>");
out.println("<font color=blue size=10>Quantiy "+qty+"</font>");
      out.write("</td></tr>   \n");
      out.write("                   \n");
      out.write("                <tr><td></td></tr>\n");
      out.write("            </table>\n");
      out.write("            ");
            
                        
                     
           out.println("<b><font color=blue size=10>You have Enetred</font>");
            out.println("<font color=blue size=10>Item Number "+in+"</font>");
            out.println("<br>");
            out.println("<font color=blue size=10>Item Code "+ic+"</font>");
            out.println("<br>");
            out.println("<font color=blue size=10>Price "+pr+"</font>");
            out.println("<br>");
            out.println("<font color=blue size=10>Quantiy "+qty+"</font>");
            out.println("<br>");
           
            
            
            Statement st=con.createStatement();
            String sql="insert into master values('"+ic+"','"+in+"','"+pr+"','"+qty+"')";
            int a=st.executeUpdate(sql);
            if(a==1)                         
            {
                out.println("Data Added Successfully");
                out.println("<br>");
                   out.println("<a href='product.html'>Click to Insert Another Record</a>");
            }
            else
            {
                out.println("--------Un-Success----");
            st.executeUpdate(sql);
            }  
          }
          catch(Exception e)
          {
              out.println(""+e.getMessage());
          }
         
      out.write(" \n");
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
