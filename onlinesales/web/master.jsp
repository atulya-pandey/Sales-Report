<%-- 
    Document   : master
    Created on : Jul 12, 2017, 8:01:41 PM
    Author     : Atul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"  %>
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
            
                String query="select * from master";
                
                Statement st=con.createStatement();
                
                ResultSet rs= st.executeQuery(query);
        %>
      <form method="post" action="">
          <table class="rwd-table">
              <tr><td>Item code</td><td>Item name</td><td>Item price</td><td>Quantity</td>
                </tr>
              <%
                    while(rs.next())
                    {
                  %>
                  <tr><td><%=rs.getString(1)%></td>
                      <td><%=rs.getString(2)%></td>
                      <td><%=rs.getString(3)%></td>
                      <td><%=rs.getString(4)%></td>
                      
                      </tr>
                      <% } %>
                      <% }
                       catch(Exception e)
                                  {}
                          %>
                          <%
        String email=(String)session.getAttribute("email");
        
        //redirect user to login page if not logged in
        if(email==null){
            response.sendRedirect("login.jsp");
        }
        %>
    
           
          </table>
          
          <a href='salesreport.jsp'>Click here to enter sales report</a> 
          <a href='profile.jsp'>Profile</a>
      </form>
                          
        <p style="float: right">Welcome <%=email%> &nbsp;   
        <a style="float: right" href="logout.jsp">Logout</a></p>   
        
    </body>
</html>
