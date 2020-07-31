package com.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.util.DbUtil;
public class AdminDao {
	Connection con;
	
	 public boolean alogin(String id,String pass){
		 try
		 {
			 con=DbUtil.getConnection();
			 System.out.println(con);
			 String  cmd ="select * from c_admin where  id=? and pass=?";
			 PreparedStatement pst = con.prepareStatement(cmd);
			 pst.setString(1, id);
			 pst.setString(2, pass);
			 ResultSet rs =  pst.executeQuery();
				 if(rs.next())
					return true;
				else
					return false;
			  }
		 catch(Exception e)
		 {
			 e.printStackTrace();
			 System.out.println("error occoured while login as admin :"+e);
			 return false;
		 }
	 }

	public boolean tlogin(String id, String pass) {
		 try
		 {
			 con=DbUtil.getConnection();
			 System.out.println(con);
			 String  cmd ="select * from c_teacher where  id=? and mobile=?";
			 PreparedStatement pst = con.prepareStatement(cmd);
			 pst.setString(1, id);
			 pst.setString(2, pass);
			 ResultSet rs =  pst.executeQuery();
				 if(rs.next())
					return true;
				else
					return false;
			  }
		 catch(Exception e)
		 {
			 e.printStackTrace();
			 System.out.println("error occoured while login as Teacher :"+e);
			 return false;
		 }
	}

	public boolean slogin(String id, String pass) {
		 try
		 {
			 con=DbUtil.getConnection();
			 System.out.println(con);
			 String  cmd ="select * from c_student where  id=? and mobile_no=?";
			 PreparedStatement pst = con.prepareStatement(cmd);
			 pst.setString(1, id);
			 pst.setString(2, pass);
			 ResultSet rs =  pst.executeQuery();
				 if(rs.next())
					return true;
				else
					return false;
			  }
		 catch(Exception e)
		 {
			 e.printStackTrace();
			 System.out.println("error occoured while login as Teacher :"+e);
			 return false;
		 }
	}
	

 	}
 