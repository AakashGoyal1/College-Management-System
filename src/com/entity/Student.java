package com.entity;

public class Student {
	
	private String id;
	private String name;
	private String father_name;
	private String email_id;
	private String course;
	private String dept_id;
	private String b_g;
	private String mob;
	
	public Student() {
		super();
	}
	
	public Student(String id, String name, String father_name, String email_id, String course, String dept_id,
			String b_g, String mob) {
		super();
		this.id = id;
		this.name = name;
		this.father_name = father_name;
		this.email_id = email_id;
		this.course = course;
		this.dept_id = dept_id;
		this.b_g = b_g;
		this.mob = mob;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFather_name() {
		return father_name;
	}

	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getCourse() {
		return course;
	}

	public void setcourse(String course) {
		this.course = course;
	}

	public String getDept_id() {
		return dept_id;
	}

	public void setDept_id(String dept_id) {
		this.dept_id = dept_id;
	}

	public String getB_g() {
		return b_g;
	}

	public void setB_g(String b_g) {
		this.b_g = b_g;
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", father_name=" + father_name + ", email_id=" + email_id
				+ ", course=" + course + ", dept_id=" + dept_id + ", b_g=" + b_g + ", mob=" + mob + "]";
	}
	

}
