package model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Student 
{
	private int roll;
	private String name; 
	private String branch;
	private String password;
	private Date dob;
	public int numBooks = 0;
	private List<Issue> issues = new ArrayList<>(); //Control+shift+ O
	public Student(int roll, String name, String branch, Date dob,String password) 
	{
		super();
		this.roll = roll;
		this.name = name;
		this.branch = branch;
		this.password = password;
		this.dob = dob;
	}
	

	@Override
	public String toString() 
	{
		return "Student [roll=" + roll + ", name=" + name + ", branch=" + branch + ", password=" + password + ", dob="
				+ dob + ", numBooks=" + numBooks + ", issues=" + issues + "]";
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
