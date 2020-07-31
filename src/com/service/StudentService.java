package com.service;

import java.util.ArrayList;

import com.dao.StudentDao;
import com.entity.Student;


public class StudentService {
	
	StudentDao sd = new StudentDao();
	
	public boolean  smodifyName(String id,String head){
		return sd.modifyName(id,head);
	}
	
	public ArrayList<Student> sView(String id) {
		ArrayList<Student> t_all = sd.view(id);
		System.out.println(t_all);
		return t_all;
	}

	
	public ArrayList<Student> sViewAll() {
		ArrayList<Student> t_all = sd.viewAll();
		System.out.println(t_all);
		return t_all;
		
	}

	public boolean sadd(String id, String name, String father, String email_id, String course, String dept_id, String b_g, String mob) {
	
		return sd.add(id, name, father, email_id, course, dept_id, b_g, mob);
	}

	public boolean sdelete(String id) {
		return sd.delete(id);
	}


}
