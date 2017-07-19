<%-- 
    Document   : salesreport
    Created on : Jul 12, 2017, 8:01:41 PM
    Author     : Atul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@include file="menu.html" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sales Report</title>
        <link rel="stylesheet" href="formstyle.css">
        <script>
            function change(){
                document.getElementById("textbox").value = document.getElementById("dropdown").value;
            }
        </script>
            
        <style>
            body{
                background-color: grey;
            }
          </style>
            
    </head>
    <body>
        <div id="container">
        <%
            try
            {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","0000");
            Statement st=con.createStatement();
            
            String tid="",uid="",zone="",prsold="",dsold="",cn="",ic="";
            int qsold=0,amt=0,price=0,tamt=0;
            
            ResultSet res1=st.executeQuery("SELECT tran_id FROM salesreport"); 
            int id=0; 
            if(res1.last())
            { 
                    id=res1.getInt("tran_id"); 
            } 
            ++id;
            
            String query="select * from master";
            ResultSet res=st.executeQuery(query);
            
        %>
        <form method="post" action="">
            <fieldset>
                <legend>Sales Report</legend>
            <table align="center">
                
                <tr><td>Transaction id</td><td><input type="text" name="t1" value="<% out.println(id);%>" readonly></td></tr>
                <tr><td>Adhaar</td><td><input type="text" name="t2"></td></tr>
                <tr><td>Zone</td><td><input type="text" name="t3"></td></tr>
                <tr><td>Item code</td><td>
                    <select name="t9" id="dropdown" onChange="change();" style="width:100px" >
                        <option value="">Select item</option>
                        <%  while(res.next()){ %>
                        
                            <option value="<%= res.getString(2)%>"><%= res.getString(1)%></option>
                        <% 
                            }
                        %>
                    </select></td></tr>
                
         <%
             res.close();
            ic=request.getParameter("t9");
            tid=request.getParameter("t1");
            uid=request.getParameter("t2");
            zone=request.getParameter("t3");
            %>
            <tr><td>Product</td><td><input type="text" id="textbox" name="t4"></td></tr>
            
                <tr><td>Quantity</td><td><input type="text" name="t5"></td></tr>
                <tr><td>Date of Sale</td><td><input type="date" name="d1"></td></tr>  
                <tr><td>Price</td><td><input type="text" name="t6"></td></tr>              
                
                <tr><td>Customer name</td><td><input type="text" name="t8"></td></tr>
                <tr><td></td><td><input type="submit" value="Submit"></td></tr>
            </table>
                </fieldset>
        </form>
        </div>
           
                       
              <%
        String email=(String)session.getAttribute("email");
        
        //redirect user to login page if not logged in
        if(email==null){
            response.sendRedirect("login.jsp");
        }
        %>

        <a style="float: right" href="logout.jsp">Logout</a>   
            <%
            prsold=request.getParameter("t4");
            qsold=Integer.parseInt(request.getParameter("t5"));
            dsold=request.getParameter("d1");
            
            price=Integer.parseInt(request.getParameter("t6"));
            
            cn=request.getParameter("t8");    
            
            tamt=(int)qsold*(int)price;
            
            
           
            {
                 String sql=" insert into salesreport(adhaar,zone,pro_sold,qty_sold,date_sold,price,total_amt,cust_name) values('"+uid+"','"+zone+"','"+prsold+"','"+qsold+"','"+dsold+"','"+price+"','"+tamt+"','"+cn+"')";
                 String sql_master="update master set quantity = (quantity-'"+qsold+"') where it_name='"+ic+"'";
                 int aa=st.executeUpdate(sql);
                 int cc=st.executeUpdate(sql_master);
                 if(aa==1 && cc==1)
                 {
                   out.println("Data added Successfully");
                   out.println("<br>");
                   out.println("<a href='viewsales.jsp'>Click to view record</a>");
                   out.println("");
               }
               else
                   out.println("---Unsuccess-----");
            }
            con.close();
            }
            catch(Exception e)
            {
                out.println("");
            }
        %>
        
    </body>
</html>
