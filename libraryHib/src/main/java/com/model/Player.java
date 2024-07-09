package com.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Player 
{
	@SequenceGenerator(name = "playerseq",initialValue = 502)
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "playerseq")
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

	
	@ManyToMany
	List<MatchDetails> matches = new ArrayList<>();
	
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

	public List<MatchDetails> getMatches() {
		return matches;
	}

	public void setMatches(List<MatchDetails> matches) {
		this.matches = matches;
	}
	
	
}
