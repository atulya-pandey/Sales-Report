<%-- 
    Document   : logout
    Created on : Jul 15, 2017, 11:06:29 PM
    Author     : Atul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <%
            session.invalidate();
            response.sendRedirect("login.jsp");
        %>
    </body>
</html>
