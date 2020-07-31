package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.entity.Department;
import com.util.DbUtil;

public class DeptDao {
	
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
		 	System.out.println("error in modification of department  :"+e);
		 	return false;
		 } 
		 
	}
	public ArrayList<Department> viewAll() {
		 try{
			con = DbUtil.getConnection();
			String cmd="Select * from C_DEPT cd join c_Teacher ct on cd.headid=ct.id";
			PreparedStatement pst = con.prepareStatement(cmd);
			ResultSet rs= pst.executeQuery();
			ArrayList<Department> al = new ArrayList<Department>();
			while(rs.next()){
				String id = rs.getString("did");
				String name = rs.getString("dname");
				String headid = rs.getString("headid");
				String headname = rs.getString("tname");
				
				System.out.println(id+"  "+name+"  "+headid +"  "+headname+"  "+"zzzz");
				Department Department = new Department(id,name,headid,headname);
				al.add(Department);
				}
				return al;
			 }
			 catch(Exception e){
				 e.printStackTrace();
				 System.out.println("error occured in department view");
				 return null;
			 }
	}
	
	public ArrayList<Department> view(String tid) {
		 try{
			con = DbUtil.getConnection();
			String cmd="Select * from C_DEPT cd join c_Teacher ct on cd.headid=ct.id where id=?";
			PreparedStatement pst = con.prepareStatement(cmd);
			pst.setString(1, tid);
			ResultSet rs= pst.executeQuery();
			ArrayList<Department> al = new ArrayList<Department>();
			while(rs.next()){
				String id = rs.getString("did");
				String name = rs.getString("dname");
				String headid = rs.getString("headid");
				String headname = rs.getString("tname");
				
				System.out.println(id+"  "+name+"  "+headid +"  "+headname+"  "+"zzzz");
				Department Department = new Department(id,name,headid,headname);
				al.add(Department);
				}
				return al;
			 }
			 catch(Exception e){
				 e.printStackTrace();
				 System.out.println("error occured in department view");
				 return null;
			 }
	}
	
	public boolean add(String id, String name, String head) {
		try{
			con = DbUtil.getConnection();
			String cmd="insert into C_DEPT values (?,?,?)";
			PreparedStatement pst = con.prepareStatement(cmd);
			pst.setString(1, id);
		 	pst.setString(2, name);
		 	pst.setString(3, head);
			
			int n= pst.executeUpdate();
			if(n>0) {
				System.out.println("add");
				return true;
			}else {
				System.out.println("not add");
				return false;
			}
		}catch(Exception e){
				 e.printStackTrace();
				 System.out.println("error occured in department adding");
				 return false;
			 }
	}
	
	
	
	
}
