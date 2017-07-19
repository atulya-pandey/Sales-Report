<%-- 
    Document   : loginRequestHandler
    Created on : Jul 15, 2017, 11:01:02 PM
    Author     : Atul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="com.LoginDAO"%>
<jsp:useBean id="loginBean" class="com.LoginBean" scope="session"/>
<jsp:setProperty name="loginBean" property="*"/>
<!DOCTYPE html>
<%
String result=LoginDAO.loginCheck(loginBean);
 
if(result.equals("true")){
    session.setAttribute("email",loginBean.getEmail());
    response.sendRedirect("master.jsp");
}
 
if(result.equals("false")){
    response.sendRedirect("login.jsp?status=false");
}
 
if(result.equals("error")){
    response.sendRedirect("login.jsp?status=error");
}
 
%>