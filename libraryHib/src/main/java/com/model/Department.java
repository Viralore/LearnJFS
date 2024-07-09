package com.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department 
{
	@Id
	private int depid;
	
	@Column(name = "name")
	private String depName;
	
	private Date establishdate;
	
	@OneToMany (mappedBy = "department")	//in class employee, atribute name of current class
	List<Employee> employees = new ArrayList<>(); //here hibernate assumes that in table employee there is a foreign key named department_depid

	public int getDepid() 
	{
		return depid;
	}

	public void setDepid(int depid) 
	{
		this.depid = depid;
	}

	public String getDepName() 
	{
		return depName;
	}

	public void setDepName(String depName) 
	{
		this.depName = depName;
	}

	public Date getEstablishdate() 
	{
		return establishdate;
	}

	public void setEstablishdate(Date establishdate) 
	{
		this.establishdate = establishdate;
	}

	@Override
	public String toString() 
	{
		return "Department [depid=" + depid + ", depName=" + depName + ", establishdate=" + establishdate + "]";
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	
	
	
}
