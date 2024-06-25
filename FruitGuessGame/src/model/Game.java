package model;

import generator.Generator;

public class Game 
{
	private int gameSessionID;
	private Player player1;
	private Player player2;
	
	private int winnerID;

	public Game(Player player1, Player player2) 
	{
		super();
		this.player1 = player1;
		this.player2 = player2;
		this.gameSessionID = Generator.generateUniqueGameSessionID();
		this.winnerID = -1;
	}

	public int getGameSessionID() 
	{
		return gameSessionID;
	}

	public void setGameSessionID(int gameSessionID) 
	{
		this.gameSessionID = gameSessionID;
	}

	public Player getPlayer1() 
	{
		return player1;
	}

	public void setPlayer1(Player player1) 
	{
		this.player1 = player1;
	}

	public Player getPlayer2() 
	{
		return player2;
	}

	public void setPlayer2(Player player2) 
	{
		this.player2 = player2;
	}

	public int getWinnerID() 
	{
		return winnerID;
	}

	public void setWinnerID(int winnerID) 
	{
		this.winnerID = winnerID;
	}
	
	
	
}
