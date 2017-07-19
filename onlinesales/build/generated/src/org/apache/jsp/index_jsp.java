package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Admin login</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"formstyle.css\">\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background-color: grey;\n");
      out.write("            }\n");
      out.write("            </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

         try{
        String user=(String)session.getAttribute("uname");
        
         
        //redirect user to login page if not logged in
         if(user==null){
           response.sendRedirect("login.jsp");
        }
         else{
             response.sendRedirect("index.jsp");
         }}catch(Exception e){}
        
      out.write("\n");
      out.write("       \n");
      out.write("        <div id=\"container\">\n");
      out.write("    <form action=\"SaveServlet\" method=\"post\">  \n");
      out.write("    <fieldset>\n");
      out.write("        <legend>Add Items</legend>\n");
      out.write("        <table>  \n");
      out.write("        <tr><td>Item code:</td><td><input type=\"text\" name=\"code\"/></td></tr>  \n");
      out.write("        <tr><td>Item name:</td><td><input type=\"text\" name=\"name\"/></td></tr>  \n");
      out.write("        <tr><td>Price</td><td><input type=\"text\" name=\"price\"/></td></tr>  \n");
      out.write("        <tr><td>Quantity</td><td><input type=\"text\" name=\"quantity\"/></td></tr>  \n");
      out.write("        <tr><td colspan=\"2\"><input type=\"submit\" value=\"Add product\"/></td></tr>  \n");
      out.write("        </table>  \n");
      out.write("    </fieldset>\n");
      out.write("    </form>  \n");
      out.write("</div>\n");
      out.write("<br/>  \n");
      out.write("<a href=\"ViewServlet\">View Products</a>\n");
      out.write("&nbsp;\n");
      out.write("<a href=\"monthlyreport.jsp\">Month Wise Report</a>\n");
      out.write("&nbsp;\n");
      out.write("<a href=\"zonereport.jsp\">Zone Wise Report</a>\n");
      out.write("&nbsp;\n");
      out.write("<a href=\"userdesc.jsp\"> Sales Man Details</a>\n");
      out.write(" <a style=\"float: right\" href=\"logout.jsp\">Logout</a>\n");
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
