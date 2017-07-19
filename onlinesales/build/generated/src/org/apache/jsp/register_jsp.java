package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.sql.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"formstyle.css\">\n");
      out.write("       <script type=\"text/javascript\" src=\"country.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background-color: grey;\n");
      out.write("            }\n");
      out.write("            </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"container\">\n");
      out.write("        <form method=\"post\" action=\"\">\n");
      out.write("            <fieldset>\n");
      out.write("                <legend>Registration form</legend>\n");
      out.write("            <table align=\"center\">\n");
      out.write("                \n");
      out.write("                <tr><td>Enter Adhaar</td><td><input type=\"text\" required name=\"t1\" placeholder=\"Enter Adhaar\"></td><td></td></tr>\n");
      out.write("                <tr><td>Enter User Name</td><td><input type=\"text\" required name=\"t2\" placeholder=\"Enter User Name\"></td><td></td></tr>\n");
      out.write("                <tr><td>Password</td><td><input type=\"password\" required name=\"p1\" placeholder=\"Enter Password\"></td><td></td></tr>\n");
      out.write("                <tr><td>Re-enter Password</td><td><input type=\"password\" required name=\"p2\" placeholder=\"Re-Enter Password\"></td><td></td></tr>\n");
      out.write("                <tr><td>Address</td><td><input type=\"text\" required name=\"t9\" placeholder=\"Enter Address\"></td><td></td></tr>\n");
      out.write("                <tr><td>Country</td><td><select name=\"country\" id=\"country\"></select></td><td></td></tr>\n");
      out.write("                <tr><td>State</td><td><select name=\"state\" id=\"state\"></select></td><td></td></tr>\n");
      out.write("                <tr><td>Pin Code</td><td><input type=\"text\" required name=\"t5\" placeholder=\"Enter Pin Code\"></td><td></td></tr>\n");
      out.write("                <tr><td>Contact number </td><td><input type=\"text\" required name=\"t6\" placeholder=\"Enter Pin Code\"></td><td></td></tr>\n");
      out.write("                <tr><td>Land line </td><td><input type=\"text\" name=\"t7\" placeholder=\"Enter Landline no.\"></td><td></td></tr>\n");
      out.write("                 <tr><td>Profession </td><td><input type=\"text\" required name=\"t8\" placeholder=\"Enter Profession\"></td><td></td></tr>\n");
      out.write("                <tr><td>Gender</td><td><input type=\"radio\" name=\"r1\" value=\"Male\">Male\n");
      out.write("                        <input type=\"radio\" name=\"r1\" value=\"Female\">Female</td><td></td></tr>\n");
      out.write("                <tr><td>Email id</td><td><input type=\"email\" required name=\"e1\" placeholder=\"Enter Email\"></td><td></td></tr>\n");
      out.write("                <tr><td>Date of Birth</td><td><input type=\"date\" required name=\"d1\"></td><td></td></tr>  \n");
      out.write("                <tr><td>Date of Creation</td><td><input type=\"date\" name=\"d2\" ></td><td></td></tr> \n");
      out.write("                \n");
      out.write("                <tr><td></td><td><input type=\"submit\" value=\"Register\"></td><td></td></tr>\n");
      out.write("            </table>\n");
      out.write("            </fieldset>\n");
      out.write("        </form>\n");
      out.write("        </div><script language=\"javascript\">\n");
      out.write("            populateCountries(\"country\", \"state\");\n");
      out.write("            populateCountries(\"country2\");\n");
      out.write("        </script>\n");
      out.write("        ");

            try
            {
               
             
             
            String ui="",un="",cn="",gen="",em="",dob="",pass="",rpass="",sta="",cnt="",lnd="",pr="",dt="",pin="",add;
            ui=request.getParameter("t1");
            un=request.getParameter("t2");
            pass=request.getParameter("p1");
            sta=request.getParameter("t3");
            cnt=request.getParameter("t4");
            pin=request.getParameter("t5");
            cn=request.getParameter("t6");
            gen=request.getParameter("r1");
            em=request.getParameter("e1");                      
                rpass=request.getParameter("p2");
            lnd=request.getParameter("t7");
            pr=request.getParameter("t8");
            dob=request.getParameter("d1");
            dt=request.getParameter("d2");
            add=request.getParameter("t9");
           
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","0000");
            Statement st=con.createStatement();
            if(pass.equals(rpass)==true)
            {
                out.print(dt);
                 String sql="insert into user values('"+ui+"','"+un+"','"+pass+"','"+add+"','"+sta+"','"+cnt+"','"+pin+"','"+cn+"','"+lnd+"', '"+pr+"','"+gen+"','"+em+"','"+dob+"','"+dt+"')";
              
               int aa=st.executeUpdate(sql);
               
               if(aa==1)
               {
                   out.println("Data added Successfully");
                   out.println("<br>");
                   out.println("<a href='userdesc.jsp'>Click to view record</a>");
                   out.println("<a href='register.jsp'>Click to insert another record</a>");
               }
               else
                   out.println("---Unsuccess-----");
            }
            else
                out.println("Record not added due to password mismatch");
            }
            catch(Exception e)
            {
             if(e.getMessage()!=null)
               out.println(""+e.getMessage());
            }
        
      out.write("\n");
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
