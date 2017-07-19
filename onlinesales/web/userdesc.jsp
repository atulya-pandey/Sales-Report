<%-- 
    Document   : show_all
    Created on : Jul 5, 2017, 4:07:44 PM
    Author     : WEBTECH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@include file="menu.html" %>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="form1.css">
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
            
                String query="select * from user";
                
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
          <table class="rwd-table">
              <th><h4>Employee Details</h4></th>
              <tr><td>Aadhar</td><td>User Name</td><td>Password</td><td>State</td><td>Country</td><td>Address</td><td>Pin Code</td><td>Contact number</td>
                  <td>Land line</td><td>Profession</td><td>Gender</td><td>Email id</td><td>Date of Birth</td><td>Date of Creation</td>
              <%
                    while(rs.next())
                    {
                  %>
                  <tr><td><%=rs.getString(1)%></td>
                      <td><%=rs.getString(2)%></td>
                      <td><%=rs.getString(3)%></td>
                      <td><%=rs.getString(4)%></td>
                      <td><%=rs.getString(5)%></td>
                      <td><%=rs.getString(6)%></td>
                      <td><%=rs.getString(7)%></td>
                      <td><%=rs.getString(8)%></td>
                      <td><%=rs.getString(9)%></td>
                      <td><%=rs.getString(10)%></td>
                      <td><%=rs.getString(11)%></td>
                      <td><%=rs.getString(12)%></td>
                      <td><%=rs.getString(13)%></td>
                      <td><%=rs.getString(14)%></td>
                      </tr>
                      <% } %>
                      <% }
                       catch(Exception e)
                                  {}
                          %>
                          
          </table>
                      
      </form>
        <a style="float: right" href="logout.jsp">Logout</a> 
      </body>
    
</html>
