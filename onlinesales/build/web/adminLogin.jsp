<%-- 
    Document   : adminLogin
    Created on : Jul 14, 2017, 9:16:42 PM
    Author     : Atul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        try
        {
            String ui="",pas="";
            ui=request.getParameter("t1");
            pas=request.getParameter("t2");
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","0000");
            String query="select * from user where adhaar='"+ui+"' and pass='"+pas+"'";
            Statement st=con.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            if(ui.equals("admin") && pas.equals("admin")){
                response.sendRedirect("index.jsp");
            }
            
            
            else
            {
                out.print("wrong credentials");
                response.sendRedirect("login.jsp");
                
                //response.sendRedirect("validate.jsp");
            }
        }
        catch(Exception e)
        {
            out.println("Something went wrong!!");
        }
        
        
    %>
    </body>
</html>
