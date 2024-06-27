package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main 
{
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lpu2024", "root", "Frosty4#1");  //url = protocol name
			
			System.out.println(connection);
			connection.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
