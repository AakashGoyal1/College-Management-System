package com.entity;

public class Department {
	private String dno;
	private String dname;
	private String hodid;
	private String hodname;
	public String getDno() {
		return dno;
	}
	public void setDno(String dno) {
		this.dno = dno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getHodid() {
		return hodid;
	}
	public void setHodid(String hodid) {
		this.hodid = hodid;
	}
	public String getHodname() {
		return hodname;
	}
	public void setHodname(String hodname) {
		this.hodname = hodname;
	}
	public Department(String dno, String dname, String hodid, String hodname) {
		super();
		this.dno = dno;
		this.dname = dname;
		this.hodid = hodid;
		this.hodname = hodname;
	}
	public Department() {
		super();
	}
	
	
	
	public Department(String dno, String hodid) {
		super();
		this.dno = dno;
		this.hodid = hodid;
	}
	@Override
	public String toString() {
		return "Department [dno=" + dno + ", dname=" + dname + ", hodid=" + hodid + ", hodname=" + hodname + "]";
	}
	
}