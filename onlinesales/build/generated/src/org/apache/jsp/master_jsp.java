package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class master_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"tablestyle.css\">\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background-color: grey;\n");
      out.write("            }\n");
      out.write("            </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            try{
                
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","0000");
            
                String query="select * from master";
                
                Statement st=con.createStatement();
                
                ResultSet rs= st.executeQuery(query);
        
      out.write("\n");
      out.write("      <form method=\"post\" action=\"\">\n");
      out.write("          <table class=\"rwd-table\">\n");
      out.write("              <tr><td>Item code</td><td>Item name</td><td>Item price</td><td>Quantity</td>\n");
      out.write("                </tr>\n");
      out.write("              ");

                    while(rs.next())
                    {
                  
      out.write("\n");
      out.write("                  <tr><td>");
      out.print(rs.getString(1));
      out.write("</td>\n");
      out.write("                      <td>");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("                      <td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("                      <td>");
      out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("                      \n");
      out.write("                      </tr>\n");
      out.write("                      ");
 } 
      out.write("\n");
      out.write("                      ");
 }
                       catch(Exception e)
                                  {}
                          
      out.write("\n");
      out.write("                          ");

        String email=(String)session.getAttribute("email");
        
        //redirect user to login page if not logged in
        if(email==null){
            response.sendRedirect("login.jsp");
        }
        
      out.write("\n");
      out.write("    \n");
      out.write("           \n");
      out.write("          </table>\n");
      out.write("          \n");
      out.write("          <a href='salesreport.jsp'>Click here to enter sales report</a> \n");
      out.write("          <a href='profile.jsp'>Profile</a>\n");
      out.write("      </form>\n");
      out.write("                          \n");
      out.write("        <p style=\"float: right\">Welcome ");
      out.print(email);
      out.write(" &nbsp;   \n");
      out.write("        <a style=\"float: right\" href=\"logout.jsp\">Logout</a></p>   \n");
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
