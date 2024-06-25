package day2;

import java.util.*;

public class FruitGame 
{
	String name;
	static String[] fruitNames = new String[100];
	static int index=0;
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void promptAndGetWord(String fruitName)
	{
		if(index < fruitNames.length) fruitNames[index++] = fruitName;
		else 
		{
			System.out.println("Memory Full");
			System.exit(0);
		}
		
	}
	
	public static boolean searchFruit(String fruitName)
	{
		for(int i=0; i<index; i++)
		{
			if(fruitName.equalsIgnoreCase(fruitNames[i])) return true;
		}
		return false;
	}
	
	
	public static void playGame(FruitGame player1, FruitGame player2, String name,Scanner in)
	{
		boolean check = true;
		int turn = 0;
		
		Game:
		while(check)
		{
			if(turn%2==0)
			{
				//Player 1 Turn
				System.out.print("Player : " + player1.name + " : Please Enter the fruit name :: ");
				name = in.nextLine();
				if(FruitGame.searchFruit(name))
				{
					System.out.println("Player : " + player2.name + " won the GAME!!!");
					System.out.println("Thanks for Playing the FruitGame!!!");
					break Game;
				}
				player1.promptAndGetWord(name);
					
				//Player 2 Turn
				System.out.print("Player : " + player2.name + " : Please Enter the fruit name :: ");
				name = in.nextLine();
				if(FruitGame.searchFruit(name))
				{
					System.out.println("Player : " + player1.name + " won the GAME!!!");
					System.out.println("Thanks for Playing the FruitGame!!!");
					break Game;
				}
				player2.promptAndGetWord(name);
			}
			else
			{
				//Player 2 Turn
				System.out.print("Player : " + player2.name + " : Please Enter the fruit name :: ");
				name = in.nextLine();
				if(FruitGame.searchFruit(name))
				{
					System.out.println("Player : " + player1.name + " won the GAME!!!");
					System.out.println("Thanks for Playing the FruitGame!!!");
					break Game;
				}
				player2.promptAndGetWord(name);
					
				//Player 1 Turn
				System.out.print("Player : " + player1.name + " : Please Enter the fruit name :: ");
				name = in.nextLine();
				if(FruitGame.searchFruit(name))
				{
					System.out.println("Player : " + player2.name + " won the GAME!!!");
					System.out.println("Thanks for Playing the FruitGame!!!");
					break Game;
				}
				player1.promptAndGetWord(name);
			}
			turn++;
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		FruitGame player1 = new FruitGame();
		FruitGame player2 = new FruitGame();
		String name;
		
		System.out.print("Player 1 : Enter the name :: ");
		name = in.nextLine();
		player1.setName(name);

		System.out.print("Player 2 : Enter the name :: ");
		name = in.nextLine();
		player2.setName(name);
		
		FruitGame.playGame(player1, player2, name, in);
		
		in.close();
	}
	
}
