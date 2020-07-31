package com.service;

import java.util.ArrayList;

import com.dao.DeptDao;
import com.entity.Department;

public class DeptService {
	
	DeptDao dd = new DeptDao();
	
	public boolean  smodify(String id,String headid){
		return dd.modify(id,headid);
	}
	
	public ArrayList<Department> sViewAll() {
		return dd.viewAll();
	}
	
	public ArrayList<Department> sView(String id) {
		return dd.view(id);
	}

	public boolean sadd(String id, String name, String head) {
	
		return dd.add(id,name,head);
	}

}
