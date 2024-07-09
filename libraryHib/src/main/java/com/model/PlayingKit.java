package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PlayingKit 
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name ="playingkitid")
	private int playingKitId;
	
	//Integer numBats; // it can be null in DB
	//int numBats; //it cannot be null in DB primitive datatypes cannot be null

	public int getPlayingKitId() 
	{
		return playingKitId;
	}

	public void setPlayingKitId(int playingKitId) 
	{
		this.playingKitId = playingKitId;
	}

	@Override
	public String toString() 
	{
		return "PlayingKit [playingKitId=" + playingKitId + "]";
	}
	
	
	
}
