package com.hccs.BurchMidterm;

public class Member {
	private String fname, lname, username, password;
	public Member() {
		super();
	}
	public Member(String fname, String lname, String username, String password) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.username = username;
		this.password = password;
	}
	
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

	

	

}
