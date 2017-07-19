<%-- 
    Document   : validate
    Created on : Jul 6, 2017, 10:54:54 AM
    Author     : WEBTECH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>



<!DOCTYPE html>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <link rel="stylesheet" href="style.css">
         <style type ="text/css" >
   .footer{ 
       position: fixed;     
       text-align: center;    
       bottom: 0px; 
       width: 100%;
   }  
</style>
        
        
        
    </head>
    
    <body id="container">
        <h1 align="center"><font color="white"><u><b>Online Sales Report</b></u></font></h1>
      <%@include file="menu.html" %>
        <%
        String email=(String)session.getAttribute("email");
        
        String user = (String)session.getAttribute("uname");
        //redirect user to home page if already logged in
        if(user!=null){
            response.sendRedirect("index.jsp");
        }
        if(email!=null){
            response.sendRedirect("master.jsp");
        }
 
        String status=request.getParameter("status");
        
        if(status!=null){
            if(status.equals("false")){
                   out.print("Incorrect login details!");                       
            }
            else{
                out.print("Some error occurred!");
            }
        }
        %>
        <div >
        <form  method="post" action="loginRequestHandler.jsp">
            <table  align="center">
                <tr><th><font color=blue>User login</font></th><th></th></tr>
                <tr><td><font color=white>Enter Adhaar</font></td><td><input type="text" name="email" placeholder="Enter Adhaar"></td></tr>
                <tr><td><font color=white>Enter Password</font></td><td><input type="password" name="password" placeholder="Enter Password"></td></tr>
                <tr><td></td><td><input type="submit" value="Login"></td></tr>
            </table>
        </form>
        
        
        <form method="post" action="adminLoginhandler.jsp">
            <table  align="center">
                <tr><th><font color=blue>Admin login</font></th><th></th></tr>
                <tr><td><font color=white>Enter Username</font></td><td><input type="text" name="t1" placeholder="Enter Username"></td></tr>
                <tr><td><font color=white>Enter Password</font></td><td><input type="password" name="t2" placeholder="Enter Password"></td></tr>
                <tr><td></td><td><input type="submit" value="Login"></td></tr>
            </table>
             
        </form>
        
        </div>
        <a class="aaa" href="register.jsp">Register</a>
        
        <div class="footer"><b>This project work contains codes which may cause copyright issue if used without permission. 
            It has been registered under the copyright of the best group of coders of Asansol Engineering college. All Rights Reserved @ 2017.</b></div>
        
    </body>
    
</html>
