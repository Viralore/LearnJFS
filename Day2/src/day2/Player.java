package day2;

public class Player 
{
	int playerID;
	String name,email;
	
	static int topPlayerID=1;
	static String topPlayerName;
	
	public Player(int playerID) 
	{
		super();
		this.playerID = playerID;
	}
	
	public Player(int playerID, String email) 
	{
		super();
		this.playerID = playerID;
		this.email = email;
	}

	public Player(int playerID, String name, String email) 
	{
		super();
		this.playerID = playerID;
		this.name = name;
		this.email = email;
	}
	
	public static String getTopPlayerName()
	{
		return topPlayerName;
	}
	
	public static void setTopPlayer(String name,int ID)
	{
		topPlayerName = name;
		topPlayerID = ID;
	}
	
	@Override
	public String toString()
	{
		return "Player [ Name : "+name+" ,ID : "+ playerID +" & email : "+ email +" ]";
	}
	
	public static void main(String[] args) 
	{
		Player p1 = new Player(12, "Aryan", "aryan@gmail.com");
		Player p2 = new Player(16, "Aman", "aman@gmail.com");
		Player p3 = new Player(19, "Abhishek", "abhishek@gmail.com");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		Player.setTopPlayer("Abhishek", 19);
		
		System.out.println("Top Player Name : " + Player.getTopPlayerName());
		
	}
	
}
