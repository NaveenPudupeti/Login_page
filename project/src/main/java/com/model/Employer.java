package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employer {

	@Id
	@GeneratedValue
	private int empId;
	private String cName;
	private String empName;
	private String email;
	private String 	mobile;
	private String password;
	
	public Employer(){
		
	}
	
	public Employer(String cName, String empName, String email, String mobile, String password) {
		super();
		this.cName = cName;
		this.empName = empName;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
	}


	public int getEmpId() {
		return empId;
	}

	public String getcName() {
		return cName;
	}


	public void setcName(String cName) {
		this.cName = cName;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Employer(int empId, String cName, String empName, String email, String mobile, String password) {
		super();
		this.empId = empId;
		this.cName = cName;
		this.empName = empName;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
	}
}