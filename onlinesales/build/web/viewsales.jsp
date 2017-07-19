<%-- 
    Document   : viewsales
    Created on : 12 Jul, 2017, 2:23:14 PM
    Author     : ASHISH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@include file="menu.html" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Sales</title>
        <link rel="stylesheet" href="tablestyle.css">
    </head>
    <body>
          <%
            try{
                
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","0000");
            
                String query="select * from salesreport";
                
                Statement st=con.createStatement();
                
                ResultSet rs= st.executeQuery(query);
        %>
        <%
        String email=(String)session.getAttribute("email");
        
        //redirect user to login page if not logged in
        if(email==null){
            response.sendRedirect("login.jsp");
        }
        %>
      <form method="post" action="" >
          <table class="rwd-table" >
              <tr ><th>Transaction Id</th><th>UID</th><th>Zone</th><th>Product Sold</th><th>Quantity Sold</th><th>Date of Sale</th><th>Price</th><th>Amount</th><th>Customer name</th>
                </tr>
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
                      </tr>
                      <% } %>
                      <% }
                       catch(Exception e)
                                  {}
                          %>
                          

                          
          </table>
                      
      </form>
      <a href='salesreport.jsp'>Click to insert another record</a>
      <a href='profile.jsp'>Profile</a>
        
        <a style="float: right" href="logout.jsp">Logout</a>   
    </body>
</html>
