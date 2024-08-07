package com.lpu.lib.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student 
{
	@Id
	private int roll;
	
	private String name; 
	private String branch;
	private String password;
	private Date dob;
	@Column(name="numbooks")
	public int numBooks = 0;
	
	//private List<Issue> issues = new ArrayList<>(); //Control+shift+ O
	public Student(int roll, String name, String branch, Date dob,String password) 
	{
		super();
		this.roll = roll;
		this.name = name;
		this.branch = branch;
		this.password = password;
		this.dob = dob;
	}

	public Student() 
	{
		super();
	}


	@Override
	public String toString() 
	{
		return "Student [roll=" + roll + ", name=" + name + ", branch=" + branch + ", password=" + password + ", dob="
				+ dob + ", numBooks=" + numBooks + "]";
	}


	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
}
