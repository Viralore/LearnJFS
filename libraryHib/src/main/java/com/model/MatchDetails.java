package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class MatchDetails 
{
	@SequenceGenerator(name="matchidseq",initialValue = 1101)
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "matchidseq")
	private int matchid;
	
	private String place;

	public int getMatchid() {
		return matchid;
	}

	public void setMatchid(int matchid) {
		this.matchid = matchid;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	@Override
	public String toString() 
	{
		return "MatchDetails [matchid=" + matchid + ", place=" + place + "]";
	}

	
}
