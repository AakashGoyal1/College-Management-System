package com.service;

import java.util.ArrayList;
import com.dao.TeacherDao;
import com.entity.Teacher;

public class TeacherService {

	TeacherDao td = new TeacherDao();
		
		public boolean  smodify(String id,String headid){
			return td.modify(id,headid);
		}
		
		public ArrayList<Teacher> sViewAll() {
			ArrayList<Teacher> t_all = td.viewAll();
			System.out.println(t_all);
			return t_all;
		}
	
		public boolean sadd(String id, String name, String father, String email_id, String gender, String dept_id, String b_g, String mob) {
		
			return td.add(id, name, father, email_id, gender, dept_id, b_g, mob);
		}

		public boolean sdelete(String id) {
			return td.delete(id);
		}

		public ArrayList<Teacher> sView(String id) {
			ArrayList<Teacher> t_all = td.view(id);
			System.out.println(t_all);
			return t_all;
		}

		public boolean assign(String tid, String sid) {
			return td.assign(tid,sid);
		}

		
		
}
