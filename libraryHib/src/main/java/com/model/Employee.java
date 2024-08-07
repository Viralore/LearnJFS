package com.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Employee 
{
	@Id
	private int empid;
	private String name;
	
	
	@OneToOne
//	@JoinColumn(name="parkingid")	//If you want to change the name of the created column
	Parking parking;	//Automatically add foreign key in employee table with name parking_parkingid
	
	@ManyToOne
	@JoinColumn(name ="depid")
	Department department;
	
	
	//Assumption by hibernate there is a table Employee_project with employee_empid and projects_projid as foreign keys
	@ManyToMany
	List<Project> projects = new ArrayList<>();
	
	public int getEmpid() 
	{
		return empid;
	}
	
	public void setEmpid(int empid) 
	{
		this.empid = empid;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}

	public Parking getParking() 
	{
		return parking;
	}

	public void setParking(Parking parking) 
	{
		this.parking = parking;
	}

	public Department getDepartment() 
	{
		return department;
	}

	public void setDepartment(Department department) 
	{
		this.department = department;
	}

	@Override
	public String toString() 
	{
		return "Employee [empid=" + empid + ", name=" + name + ", parking=" + parking + ", department=" + department
				+ "]";
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	
	
	
	
}
