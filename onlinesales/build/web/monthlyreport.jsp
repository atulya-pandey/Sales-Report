<%-- 
    Document   : monthlyreport
    Created on : 12 Jul, 2017, 2:48:25 PM
    Author     : ASHISH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
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
        <div>
           <a style="float: right" href="logout.jsp">Logout</a>  
        <form method="post" action="">
            <table>
                <tr><td>Choose month</td>
                    <td>
                        <select name="month">
                            <option value="1">January</option>
                            <option value="2">February</option>
                            <option value="3">March</option>
                            <option value="4">April</option>
                            <option value="5">May</option>
                            <option value="6">June</option>
                            <option value="7">July</option>
                            <option value="8">August</option>
                            <option value="9">September</option>
                            <option value="10">October</option>
                            <option value="11">November</option>
                            <option value="12">December</option>
                            
                        </select>
                    </td>
                </tr>
                <tr><td><input type="submit" value="Generate result"></td></tr>
            </table>
        </form>
       
    <%try{
        Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","0000");
            Statement st=con.createStatement();
            String month=request.getParameter("month");
           String sql="select * from salesreport where Month(date_sold)='"+month+"'"; 
       ResultSet rs=st.executeQuery(sql);
       %>
       <%
        String user=(String)session.getAttribute("uname");
        
        //redirect user to login page if not logged in
        if(user==null){
           response.sendRedirect("login.jsp");
        }
        %>
        
           <form method="post" action="">
          <table class="rwd-table" align=center style="float:right">
              <tr><td>Transaction Id</td><td>UID</td><td>Zone</td><td>Product Sold</td><td>Quantity Sold</td><td>Date of Sale</td><td>Price</td><td>Amount</td><td>Customer name</td>
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
      
    </div>
                          
   </body>
   
</html>
