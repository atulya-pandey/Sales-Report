<%-- 
    Document   : zonereport
    Created on : 12 Jul, 2017, 2:35:54 PM
    Author     : ASHISH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@include file="menu.html" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="tablestyle.css">
        <style>
            body{
                background-color: grey;
            }
            </style>
    </head>
    <body>
        <%
            try{
                
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","0000");
            
                String query="select zone,sum(qty_sold),sum(total_amt) from salesreport group by zone";
                
                Statement st=con.createStatement();
                
                ResultSet rs= st.executeQuery(query);
        %>
        <%
        String user=(String)session.getAttribute("uname");
        
        //redirect user to login page if not logged in
        if(user==null){
           response.sendRedirect("login.jsp");
        }
        %>
        
       <form method="post" action="">
          <table align="center" class="rwd-table">
              <tr><td>Zone</td><td>Total quantity sold</td><td>Total amount earned</td>
                </tr>
              <%
                    while(rs.next())
                    {
                  %>
                  <tr><td><%=rs.getString(1)%></td>
                      <td><%=rs.getString(2)%></td>
                      <td><%=rs.getString(3)%></td>
                      
                      </tr>
                      <% } %>
                      <% }
                       catch(Exception e)
                                  {
                                        out.print(e.getMessage());
                                }
                          %>
                          
          </table>
                      
      </form>
                          <a style="float: right" href="logout.jsp">Logout</a>
    </body>
</html>
