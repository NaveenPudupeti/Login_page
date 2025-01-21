package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Jobseeker {

	@Id
	@GeneratedValue
	private int userId;
	private String uname;
	private String mobile;
	private String qualification;
	private String 	college;
	private String 	email;
	private String password;
	
	public Jobseeker(){
		
	}

	public Jobseeker(String uname, String mobile, String qualification, String college, String email, String password) {
		super();
		this.uname = uname;
		this.mobile = mobile;
		this.qualification = qualification;
		this.college = college;
		this.email = email;
		this.password = password;
	}

	public Jobseeker(int userId, String uname, String mobile, String qualification, String college, String email,
			String password) {
		super();
		this.userId = userId;
		this.uname = uname;
		this.mobile = mobile;
		this.qualification = qualification;
		this.college = college;
		this.email = email;
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}	
