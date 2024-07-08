package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Player 
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "playerid")
	private int playerId;
	
	@Column(name = "name")
	private String playerName;
	
	@ManyToOne
	@JoinColumn(name = "teamid")
	Team team;
	
	@OneToOne
	@JoinColumn(name = "playingkitid")
	PlayingKit playingKit;

	public int getPlayerId() 
	{
		return playerId;
	}

	public void setPlayerId(int playerId) 
	{
		this.playerId = playerId;
	}

	public String getPlayerName() 
	{
		return playerName;
	}

	public void setPlayerName(String playerName) 
	{
		this.playerName = playerName;
	}

	public Team getTeam() 
	{
		return team;
	}

	public void setTeam(Team team) 
	{
		this.team = team;
	}

	public PlayingKit getPlayingKit() 
	{
		return playingKit;
	}

	public void setPlayingKit(PlayingKit playingKit) 
	{
		this.playingKit = playingKit;
	}

	@Override
	public String toString() 
	{
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", team=" + team + ", playingKit="
				+ playingKit + "]";
	}
}
