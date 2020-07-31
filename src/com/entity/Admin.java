package com.entity;
public class Admin {
  private String aname,fname,adno, address;

public String getAname() {
	return aname;
}

public void setAname(String aname) {
	this.aname = aname;
}

public String getFname() {
	return fname;
}

public void setFname(String fname) {
	this.fname = fname;
}

public String getAdno() {
	return adno;
}

public void setAdno(String adno) {
	this.adno = adno;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public Admin(String aname, String fname, String adno, String address) {
	super();
	this.aname = aname;
	this.fname = fname;
	this.adno = adno;
	this.address = address;
}

public Admin() {
	super();
	// TODO Auto-generated constructor stub
}

}