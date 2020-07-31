package com.service;
import com.dao.AdminDao;


public class AdminService {
	AdminDao ad = new AdminDao();
	public boolean  slogin(String id,String pass){
		return ad.slogin(id,pass);
	}
	
	
	public boolean tlogin(String id, String pass) {
		return ad.tlogin(id,pass);
	}


	public boolean alogin(String id, String pass) {
		return ad.alogin(id,pass);
	}
	
	
}