package com.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Team 
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "teamid")
	private int teamId;
		
	@Column(name = "name")
	private String teamName;
	
	@OneToMany (mappedBy = "team")
	List<Player> players = new ArrayList<>();

	public int getTeamId() 
	{
		return teamId;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
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
