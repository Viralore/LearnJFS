package com.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department 
{
	@Id
	private int depid;
	
	@Column(name = "name")
	private String depName;
	
	private Date establishdate;

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
	
	
	
	
}
