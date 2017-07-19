/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ab;

/**
 *
 * @author MIES
 */
import java.util.*;  
import java.sql.*;  
  
public class EmpDao {  
  
    public static Connection getConnection(){  
        Connection con=null;  
        try{  
            Class.forName("com.mysql.jdbc.Driver").newInstance();  
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abc", "root", "0000"); 
        }catch(Exception e){System.out.println(e);}  
        return con;  
    }  
    public static int save(Emp e){  
        int status=0;  
        try{  
            Connection con=EmpDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("insert into master values (?,?,?,?)");  
            ps.setString(1,e.getIc());
            ps.setString(2,e.getIn());  
            ps.setString(3,e.getIp());  
            ps.setInt(4,e.getQty());  
             
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    public static int update(Emp e){  
        int status=0;  
        try{  
            Connection con=EmpDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("update master set it_code=?,it_name=?,it_price=?,quantity=? where it_code=?");  
            ps.setString(1,e.getIc());  
            ps.setString(2,e.getIn());  
            ps.setString(3,e.getIp());
            ps.setInt(4,e.getQty());  
              
            ps.setString(5,e.getIc());  
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    public static int delete(String id){  
        int status=0;  
        try{  
            Connection con=EmpDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("delete from master where it_code=?");  
            ps.setString(1,id);  
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return status;  
    }  
    public static Emp getEmployeeById(String id){  
        Emp e=new Emp();  
          
        try{  
            Connection con=EmpDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from master where it_code=?");  
            ps.setString(1,id);  
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){  
                e.setIc(rs.getString(1));  
                e.setIn(rs.getString(2));  
                e.setIp(rs.getString(3));  
                e.setQty(rs.getInt(4));  
                  
            }  
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return e;  
    }  
    public static List<Emp> getAllEmployees(){  
        List<Emp> list=new ArrayList<Emp>();  
          
        try{  
            Connection con=EmpDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from master");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                Emp e=new Emp();  
                e.setIc(rs.getString(1));  
                e.setIn(rs.getString(2));  
                e.setIp(rs.getString(3));  
                e.setQty(rs.getInt(4));  
                
                list.add(e);  
            }  
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return list;  
    }  
}  