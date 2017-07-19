package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("         <style type =\"text/css\" >\n");
      out.write("   .footer{ \n");
      out.write("       position: fixed;     \n");
      out.write("       text-align: center;    \n");
      out.write("       bottom: 0px; \n");
      out.write("       width: 100%;\n");
      out.write("   }  \n");
      out.write("</style>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body id=\"container\">\n");
      out.write("        <h1 align=\"center\"><font color=\"white\"><u><b>Online Sales Report</b></u></font></h1>\n");
      out.write("      ");
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
      out.write("        ");

        String email=(String)session.getAttribute("email");
        
        String user = (String)session.getAttribute("uname");
        //redirect user to home page if already logged in
        if(user!=null){
            response.sendRedirect("index.jsp");
        }
        if(email!=null){
            response.sendRedirect("master.jsp");
        }
 
        String status=request.getParameter("status");
        
        if(status!=null){
            if(status.equals("false")){
                   out.print("Incorrect login details!");                       
            }
            else{
                out.print("Some error occurred!");
            }
        }
        
      out.write("\n");
      out.write("        <div >\n");
      out.write("        <form  method=\"post\" action=\"loginRequestHandler.jsp\">\n");
      out.write("            <table  align=\"center\">\n");
      out.write("                <tr><th><font color=blue>User login</font></th><th></th></tr>\n");
      out.write("                <tr><td><font color=white>Enter Adhaar</font></td><td><input type=\"text\" name=\"email\" placeholder=\"Enter Adhaar\"></td></tr>\n");
      out.write("                <tr><td><font color=white>Enter Password</font></td><td><input type=\"password\" name=\"password\" placeholder=\"Enter Password\"></td></tr>\n");
      out.write("                <tr><td></td><td><input type=\"submit\" value=\"Login\"></td></tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <form method=\"post\" action=\"adminLoginhandler.jsp\">\n");
      out.write("            <table  align=\"center\">\n");
      out.write("                <tr><th><font color=blue>Admin login</font></th><th></th></tr>\n");
      out.write("                <tr><td><font color=white>Enter Username</font></td><td><input type=\"text\" name=\"t1\" placeholder=\"Enter Username\"></td></tr>\n");
      out.write("                <tr><td><font color=white>Enter Password</font></td><td><input type=\"password\" name=\"t2\" placeholder=\"Enter Password\"></td></tr>\n");
      out.write("                <tr><td></td><td><input type=\"submit\" value=\"Login\"></td></tr>\n");
      out.write("            </table>\n");
      out.write("             \n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("        <a class=\"aaa\" href=\"register.jsp\">Register</a>\n");
      out.write("        \n");
      out.write("        <div class=\"footer\"><b>This project work contains codes which may cause copyright issue if used without permission. \n");
      out.write("            It has been registered under the copyright of the best group of coders of Asansol Engineering college.All Rights Reserved @ 2017.</b></div>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("    \n");
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
