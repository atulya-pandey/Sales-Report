<%-- 
    Document   : profile
    Created on : Jul 13, 2017, 12:17:25 PM
    Author     : Atul
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
    </head>
    <body>
         <table align="left" class="rwd-table">
              <tr><td>SalesMan Name</td><td>UID</td><td>Total Quantity Sold</td><td>Net Amount</td><td>Commision</td><td>Basic Salary</td><td>Gross Salary</td>
                </tr>
              <%try{
                  Class.forName("com.mysql.jdbc.Driver").newInstance();
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","0000");
                    Statement st=con.createStatement();
                    String query="Select user.uname,salesreport.adhaar,sum(qty_sold),sum(total_amt),(sum(total_amt)*.1),((sum(total_amt)*.1)+10000) from salesreport inner join user on user.adhaar=salesreport.adhaar group by adhaar" ;
                    ResultSet rs= st.executeQuery(query);
                    
                    while(rs.next())
                    {
                  %>
                  <tr><td><%=rs.getString(1)%></td>
                      <td><%=rs.getString(2)%></td>
                      <td><%=rs.getString(3)%></td>
                      <td><%=rs.getString(4)%></td>
                      <td><%=rs.getString(5)%></td>
                       <td>10000</td>
                      <td><%=rs.getString(6)%></td>
                    
                      </tr>
       <% }
        }   catch(Exception e){
        }
            
         %>
        
         </table>
    </body>
</html>
