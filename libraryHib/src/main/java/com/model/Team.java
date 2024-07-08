package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Team 
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "teamid")
	private int teamId;
		
	@Column(name = "name")
	private String teamName;

	public int getTeamId() 
	{
		return teamId;
	}

	public void setTeamId(int teamId) 
	{
		this.teamId = teamId;
	}

	public String getTeamName() 
	{
		return teamName;
	}

	public void setTeamName(String teamName) 
	{
		this.teamName = teamName;
	}

	@Override
	public String toString() 
	{
		return "Team [teamId=" + teamId + ", teamName=" + teamName + "]";
	}
}
