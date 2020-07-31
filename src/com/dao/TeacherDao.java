package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.entity.Teacher;
import com.util.DbUtil;

public class TeacherDao {
	
	Connection con;
	public boolean  modify(String id,String headid) {
		try{
		 	con=DbUtil.getConnection();
			String  cmd ="update c_dept  set headid=? where  did = ?";
		 	PreparedStatement pst = con.prepareStatement(cmd);
		 	pst.setString(1, headid);
		 	pst.setString(2, id);
		
		 	int rs =  pst.executeUpdate();
		 	if(rs>0) {					 
		 		return true;}
		 	else
		 		return false;	 
		
		}catch(Exception e){
			e.printStackTrace();
		 	System.out.println("error in modification of Teacher  :"+e);
		 	return false;
		 } 
		 
	}
	public ArrayList<Teacher> viewAll() {
		 try{
			con = DbUtil.getConnection();
			String cmd="Select * from C_Teacher";
			PreparedStatement pst = con.prepareStatement(cmd);
			ResultSet rs= pst.executeQuery();
			ArrayList<Teacher> al = new ArrayList<Teacher>();
			while(rs.next()){
				String id = rs.getString("id");
				String name = rs.getString("tname");
				String father_name = rs.getString("father_name");
				String email_id = rs.getString("emailid");
				String gender = rs.getString("gender");
				String dept_id = rs.getString("dept_id");
				String b_g = rs.getString("blood_group");
				String mob = rs.getString("mobile");
				
				Teacher Teacher = new Teacher(id, name, father_name, email_id, gender, dept_id, b_g, mob);
				al.add(Teacher);
				}
				return al;
			 }
			 catch(Exception e){
				 e.printStackTrace();
				 System.out.println("error occured in Teacher view");
				 return null;
			 }
	}
	public boolean add(String id, String name, String father, String email_id, String gender, String dept_id, String b_g, String mob) {
		try{
			con = DbUtil.getConnection();
			String cmd="insert into C_TEACHER values (?,?,?,?,?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(cmd);
			pst.setString(1, id);
		 	pst.setString(2, father);
		 	pst.setString(3, b_g);
		 	pst.setString(4, dept_id);
		 	pst.setString(5, mob);
		 	pst.setString(6, name);
		 	pst.setString(7, email_id);
		 	pst.setString(8, gender);
			
			int n=pst.executeUpdate();
			if(n>0) {
				System.out.println("add");
				return true;
			}else {
				System.out.println("not add");
				return false;
			}
		}catch(Exception e){
				 e.printStackTrace();
				 System.out.println("error occured in Teacher adding");
				 return false;
			 }
	}
	
	
	
	public boolean delete(String id) {
		try{
			con = DbUtil.getConnection();
			String cmd="delete from C_TEACHER_SUB where id=?";
			PreparedStatement pst = con.prepareStatement(cmd);
			pst.setString(1, id);
			int n= pst.executeUpdate();
			if(n>0) {
				cmd="update c_dept  set headid=? where  did = ?";
				pst = con.prepareStatement(cmd);
				pst.setString(1, "null");
				pst.setString(2, id);
				n=0;
				n= pst.executeUpdate();
				if(n>0) {
					cmd="delete from C_DEPT where id=?";
					pst = con.prepareStatement(cmd);
					pst.setString(1, id);
					n=0;
					n= pst.executeUpdate();
					if(n>0) {
						System.out.println("delete");	
						return true;
					}else {
						System.out.println("not delete");
						return false;
					}
				}else
					return false;
			}else
				return false;
		}catch(Exception e){
			 e.printStackTrace();
			 System.out.println("error occured in Teacher deleting");
			 return false;
		 }
		
	}
	
	
	public ArrayList<Teacher> view(String id) {
		 try{
				con = DbUtil.getConnection();
				String cmd="Select * from C_Teacher where id=?";
				PreparedStatement pst = con.prepareStatement(cmd);
				pst.setString(1, id);
				ResultSet rs= pst.executeQuery();
				ArrayList<Teacher> al = new ArrayList<Teacher>();
				while(rs.next()){
					
					String name = rs.getString("tname");
					String father_name = rs.getString("father_name");
					String email_id = rs.getString("emailid");
					String gender = rs.getString("gender");
					String dept_id = rs.getString("dept_id");
					String b_g = rs.getString("blood_group");
					String mob = rs.getString("mobile");
					
					Teacher Teacher = new Teacher(id, name, father_name, email_id, gender, dept_id, b_g, mob);
					al.add(Teacher);
					}
					return al;
				 }
				 catch(Exception e){
					 e.printStackTrace();
					 System.out.println("error occured in Teacher view");
					 return null;
				 }
	}
	
	public boolean assign(String tid, String sid) {
		try{
			con = DbUtil.getConnection();
			String cmd="insert into C_TEACHER_SUB values (?,?)";
			PreparedStatement pst = con.prepareStatement(cmd);
			pst.setString(1, tid);
		 	pst.setString(2, sid);
		 	System.out.println(tid+"    "+sid);
			int n=pst.executeUpdate();
			if(n>0) {
				System.out.println("add");
				return true;
			}else {
				System.out.println("not add");
				return false;
			}
		}catch(Exception e){
				 e.printStackTrace();
				 System.out.println("error occured in sub assigning");
				 return false;
			 }
		
	}

	
	
	
	

}
