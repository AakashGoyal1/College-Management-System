package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.entity.Student;
import com.util.DbUtil;

public class StudentDao {
	
	Connection con;
	

	public boolean add(String id, String name, String father, String email_id, String course, String dept_id, String b_g, String mob) {
		try{
			con = DbUtil.getConnection();
			String cmd="insert into C_Student values (?,?,?,?,?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(cmd);
			pst.setString(1, id);
			pst.setString(2, name);
		 	pst.setString(3, father);
		 	pst.setString(4, mob);
		 	pst.setString(5, b_g);
		 	pst.setString(6, course);
		 	pst.setString(7, dept_id);
		 	pst.setString(8, email_id);
		 	
			
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
				 System.out.println("error occured in Student adding");
				 return false;
			 }
	}
	
	
	public boolean delete(String id) {
		try{
			con = DbUtil.getConnection();
			String cmd="delete from C_Student where id=?";
			PreparedStatement pst = con.prepareStatement(cmd);
			pst.setString(1, id);
			int n= pst.executeUpdate();
			if(n>0) {
				System.out.println("delete");	
				return true;
			}else {
				System.out.println("not delete");
				return false;
			}
		}catch(Exception e){
			 e.printStackTrace();
			 System.out.println("error occured in Student deleting");
			 return false;
		 }
	
}
	
	
	
	public ArrayList<Student> view(String id) {
		 try{
				con = DbUtil.getConnection();
				String cmd="Select * from C_Student where id=?";
				PreparedStatement pst = con.prepareStatement(cmd);
				pst.setString(1, id);
				ResultSet rs= pst.executeQuery();
				ArrayList<Student> al = new ArrayList<Student>();
				while(rs.next()){
					String name = rs.getString("name");
					String father_name = rs.getString("father_name");
					String email_id = rs.getString("emailid");
					String course = rs.getString("course");
					String dept_id = rs.getString("dept_id");
					String b_g = rs.getString("blood_group");
					String mob = rs.getString("mobile_no");
					
					Student student = new Student(id, name, father_name, email_id, course, dept_id, b_g, mob);
					System.out.println(student);
					al.add(student);
					}
					return al;
				 }
				 catch(Exception e){
					 e.printStackTrace();
					 System.out.println("error occured in Student view");
					 return null;
				 }
	}
	

	public ArrayList<Student> viewAll() {
		 try{
			con = DbUtil.getConnection();
			String cmd="Select * from C_Student";
			PreparedStatement pst = con.prepareStatement(cmd);
			ResultSet rs= pst.executeQuery();
			ArrayList<Student> al = new ArrayList<Student>();
			while(rs.next()){
				String id = rs.getString("id");
				String name = rs.getString("name");
				String father_name = rs.getString("father_name");
				String email_id = rs.getString("emailid");
				String course = rs.getString("course");
				String dept_id = rs.getString("dept_id");
				String b_g = rs.getString("blood_group");
				String mob = rs.getString("mobile_no");
				
				Student student = new Student(id, name, father_name, email_id, course, dept_id, b_g, mob);
				System.out.println(student);
				al.add(student);
				}
				return al;
			 }
			 catch(Exception e){
				 e.printStackTrace();
				 System.out.println("error occured in Student view");
				 return null;
			 }
	}
	

	
	
	
	
	
	
	public boolean  modifyName(String id,String headid) {
		try{
		 	con=DbUtil.getConnection();
			String  cmd ="update c_student  set name=? where  did = ?";
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
		 	System.out.println("error in modification of Student  :"+e);
		 	return false;
		 } 
		 
	}
	
	
	
		
	
}
