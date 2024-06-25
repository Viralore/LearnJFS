package model;

import generator.Generator;

public class Player 
{
	private String name;
	private int chance;
	private int playerID;
	private int score;
	
	private int gameSessionID;
	
	public Player(String name)
	{
		super();
		this.name = name;
		this.chance = 5;
		this.playerID = Generator.generateUniquePlayerID();
		this.score = 0;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getChance() 
	{
		return chance;
	}

	public void setChance(int chance) 
	{
		this.chance = chance;
	}

	public int getPlayerID() 
	{
		return playerID;
	}

	public void setPlayerID(int playerID) 
	{
		this.playerID = playerID;
	}

	public int getScore() 
	{
		return score;
	}

	public void setScore(int score) 
	{
		this.score = score;
	}

	public int getGameSessionID() 
	{
		return gameSessionID;
	}

	public void setGameSessionID(int gameSessionID) 
	{
		this.gameSessionID = gameSessionID;
	}
	
	
	
	
}
