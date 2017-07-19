<%-- 
    Document   : adminLoginhandler
    Created on : Jul 18, 2017, 9:06:45 PM
    Author     : Atul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head></head>
    <body>
<%
    try{
    String user = request.getParameter("t1");
    String pass = request.getParameter("t2");
    
    if(user.equals("admin") && pass.equals("admin")){
        session.setAttribute("uname",user);
        response.sendRedirect("index.jsp");
    }
    else{
         out.print(user);
          out.print(pass);
        //response.sendRedirect("login.jsp");
    }
    }catch(Exception e){
        out.print(""+e.getMessage());
    }
%>
    </body>
</html>