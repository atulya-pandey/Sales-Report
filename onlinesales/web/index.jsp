<%-- 
    Document   : index
    Created on : Jul 15, 2017, 9:51:54 PM
    Author     : Atul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="menu.html" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin login</title>
        <link rel="stylesheet" href="formstyle.css">
        <style>
            body{
                background-color: grey;
            }
            </style>
    </head>
    <body>
        <%
         
        String user=(String)session.getAttribute("uname");
        
         
        //redirect user to login page if not logged in
         if(user==null){
           response.sendRedirect("login.jsp");
        }
        %>
       
        <div id="container">
    <form action="SaveServlet" method="post">  
    <fieldset>
        <legend>Add Items</legend>
        <table>  
        <tr><td>Item code:</td><td><input type="text" name="code"/></td></tr>  
        <tr><td>Item name:</td><td><input type="text" name="name"/></td></tr>  
        <tr><td>Price</td><td><input type="text" name="price"/></td></tr>  
        <tr><td>Quantity</td><td><input type="text" name="quantity"/></td></tr>  
        <tr><td colspan="2"><input type="submit" value="Add product"/></td></tr>  
        </table>  
    </fieldset>
    </form>  
</div>
<br/>  
<a href="ViewServlet">View Products</a>
&nbsp;
<a href="monthlyreport.jsp">Month Wise Report</a>
&nbsp;
<a href="zonereport.jsp">Zone Wise Report</a>
&nbsp;
<a href="userdesc.jsp"> Sales Man Details</a>
 <a style="float: right" href="logout.jsp">Logout</a>
    </body>
</html>
