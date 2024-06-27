package jdbcdemo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

@SuppressWarnings("unused")
public class Main 
{
	public static void main(String[] args) 
	{
		Connection connection = null;
		Scanner in = null;
		
		//for selecting
//		try
//		{
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lpu2024", "root", "Frosty4#1");  //url = protocol name
//			
//			System.out.println(connection);
//			Statement statement = connection.createStatement();
//			in = new Scanner(System.in);
//			System.out.print("Enter the roll number : ");
//			int roll = in.nextInt();
//			ResultSet resultSet = statement.executeQuery("select * from student where roll = " + roll);
//			
//			while(resultSet.next())
//			{
//				int int1 = resultSet.getInt(1);
//				String name = resultSet.getString("name");
//				String branch = resultSet.getString("branch");
//				Date dob = resultSet.getDate("dob");
//				
//				System.out.println("Roll no. : " + int1 + " ,Name : " + name + " ,Branch : " + branch + " ,DOB : " + dob);
//			}
//			
//			
			//select *
//			Statement statement = connection.createStatement();
//			ResultSet resultSet = statement.executeQuery("select * from student");
//			
//			System.out.println("Student Table Data");
//			while(resultSet.next())
//			{
//				//get the data  from the row, then move to next row
//				//get the data in 2 ways : tell me the column number 1,2,.... of column names
//				int int1 = resultSet.getInt(1); // roll no. is 1st column
//				int int2 = resultSet.getInt("roll");
//				String rollStr = resultSet.getString(1);
//				String name = resultSet.getString("name");
//				String branch = resultSet.getString("branch");
//				Date dob = resultSet.getDate("dob");
//				
//				System.out.println("Roll no. : " + int1 + " ,Name : " + name + " ,Branch : " + branch + " ,DOB : " + dob);
//			}
//			
//			resultSet.close();
//			resultSet = statement.executeQuery("select * from book");
//			System.out.println("Book Table Data");
//			while(resultSet.next())
//			{
//				int bid = resultSet.getInt(1);
//				int bookTypeid = resultSet.getInt("bookTypeid");
//				String title = resultSet.getString("title");
//				String author = resultSet.getString("author");
//				String publisher = resultSet.getString("publisher");
//				int isid = resultSet.getInt("isid");
//				
//				System.out.println("Bid : " + bid + " ,BookTypeID : " + bookTypeid +" ,Title : " + title + " ,Author : " + author + " ,Publisher : " + publisher + " ,isid : " + isid);
//			}
//			resultSet.close();
//			statement.close();
//		}
		
		//for insertion
//		try
//		{
//			in = new Scanner(System.in);
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lpu2024", "root", "Frosty4#1");  //url = protocol name
//			//insert into student values (roll,name,branch,numBooks,dob,pwd);
//			
//			System.out.println("Enter the details of the student");
//			System.out.print("Enter roll   : ");
//			int roll = in.nextInt();
//			System.out.print("Enter name   : ");
//			String name = in.next();
//			System.out.print("Enter branch : ");
//			String branch = in.next();
//			System.out.print("Enter dob    : ");
//			//String -> date
//			String dobStr = in.next();
//			Date dob = Date.valueOf(dobStr);
//			System.out.print("Enter pwd : ");
//			String pwd = in.next();
//			
//			String sql = "insert into student values (?,?,?,?,?,?)";
//			PreparedStatement pst = connection.prepareStatement(sql);
//			pst.setInt(1, roll);
//			pst.setString(2, name);
//			pst.setString(3, branch);
//			pst.setInt(4, 0);
//			pst.setDate(5, dob);
//			pst.setString(6, pwd);
//			int rowsUpdated = pst.executeUpdate();
//			pst.close();
//			System.out.println("no of rows updated = " + rowsUpdated);
//			System.out.println("Student added");
//			connection.close();
//		}
		
		
		//for deletion
		try
		{
			in = new Scanner(System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lpu2024", "root", "Frosty4#1");
			
			System.out.print("Enter roll to delete : ");
			int roll = in.nextInt();
			String sql = "delete from student where roll = " + roll;
			PreparedStatement pst = connection.prepareStatement(sql);
			int executeUpdate = pst.executeUpdate();
			
			if(executeUpdate == 0) System.out.println("No student present with roll : " + roll);
			else
			{
				System.out.println("Student deleted");
				System.out.println("no of rows updated = " + executeUpdate);
			}
			connection.close();
			pst.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			in.close();
			try 
			{
				connection.close();
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}			
		}
	}
}
