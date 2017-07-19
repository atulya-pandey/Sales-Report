<%-- 
    Document   : register
    Created on : Jul 6, 2017, 9:53:05 AM
    Author     : WEBTECH
--%>

<%@page import="java.util.Calendar"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@include file="menu.html" %>

<!DOCTYPE html>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="formstyle.css">
       <script type="text/javascript" src="country.js"></script>
        <style>
            body{
                background-color: grey;
            }
            </style>
    </head>
    <body>
        <div id="container">
        <form method="post" action="">
            <fieldset>
                <legend>Registration form</legend>
            <table align="center">
                
                <tr><td>Enter Adhaar</td><td><input type="text" required name="t1" placeholder="Enter Adhaar"></td><td></td></tr>
                <tr><td>Enter User Name</td><td><input type="text" required name="t2" placeholder="Enter User Name"></td><td></td></tr>
                <tr><td>Password</td><td><input type="password" required name="p1" placeholder="Enter Password"></td><td></td></tr>
                <tr><td>Re-enter Password</td><td><input type="password" required name="p2" placeholder="Re-Enter Password"></td><td></td></tr>
                <tr><td>Address</td><td><input type="text" required name="t9" placeholder="Enter Address"></td><td></td></tr>
                <tr><td>Country</td><td><select name="country" id="country"></select></td><td></td></tr>
                <tr><td>State</td><td><select name="state" id="state"></select></td><td></td></tr>
                <tr><td>Pin Code</td><td><input type="text" required name="t5" placeholder="Enter Pin Code"></td><td></td></tr>
                <tr><td>Contact number </td><td><input type="text" required name="t6" placeholder="Enter Pin Code"></td><td></td></tr>
                <tr><td>Land line </td><td><input type="text" name="t7" placeholder="Enter Landline no."></td><td></td></tr>
                 <tr><td>Profession </td><td><input type="text" required name="t8" placeholder="Enter Profession"></td><td></td></tr>
                <tr><td>Gender</td><td><input type="radio" name="r1" value="Male">Male
                        <input type="radio" name="r1" value="Female">Female</td><td></td></tr>
                <tr><td>Email id</td><td><input type="email" required name="e1" placeholder="Enter Email"></td><td></td></tr>
                <tr><td>Date of Birth</td><td><input type="date" required name="d1"></td><td></td></tr>  
                <tr><td>Date of Creation</td><td><input type="date" name="d2" ></td><td></td></tr> 
                
                <tr><td></td><td><input type="submit" value="Register"></td><td></td></tr>
            </table>
            </fieldset>
        </form>
        </div><script language="javascript">
            populateCountries("country", "state");
            populateCountries("country2");
        </script>
        <%
            try
            {
               
             
             
            String ui="",un="",cn="",gen="",em="",dob="",pass="",rpass="",sta="",cnt="",lnd="",pr="",dt="",pin="",add;
            ui=request.getParameter("t1");
            un=request.getParameter("t2");
            pass=request.getParameter("p1");
            sta=request.getParameter("t3");
            cnt=request.getParameter("t4");
            pin=request.getParameter("t5");
            cn=request.getParameter("t6");
            gen=request.getParameter("r1");
            em=request.getParameter("e1");                      
                rpass=request.getParameter("p2");
            lnd=request.getParameter("t7");
            pr=request.getParameter("t8");
            dob=request.getParameter("d1");
            dt=request.getParameter("d2");
            add=request.getParameter("t9");
           
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","0000");
            Statement st=con.createStatement();
            if(pass.equals(rpass)==true)
            {
                out.print(dt);
                 String sql="insert into user values('"+ui+"','"+un+"','"+pass+"','"+add+"','"+sta+"','"+cnt+"','"+pin+"','"+cn+"','"+lnd+"', '"+pr+"','"+gen+"','"+em+"','"+dob+"','"+dt+"')";
              
               int aa=st.executeUpdate(sql);
               
               if(aa==1)
               {
                   out.println("Data added Successfully");
                   out.println("<br>");
                   out.println("<a href='userdesc.jsp'>Click to view record</a>");
                   out.println("<a href='register.jsp'>Click to insert another record</a>");
               }
               else
                   out.println("---Unsuccess-----");
            }
            else
                out.println("Record not added due to password mismatch");
            }
            catch(Exception e)
            {
             if(e.getMessage()!=null)
               out.println(""+e.getMessage());
            }
        %>
    </body>
</html>
