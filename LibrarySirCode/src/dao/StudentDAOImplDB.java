package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Student;

public class StudentDAOImplDB implements StudentDAO
{
	
	@Override
	public Student add(int roll, String name, String branch, Date dob,String password) 
	{
		Connection connection = null;
		try
		{
			connection = DBConnection.getConnection();
			String sql = "insert into student values (?,?,?,?,?,?)";

			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setInt(1, roll);
			pst.setString(2, name);
			pst.setString(3, branch);
			pst.setInt(4, 0);
			pst.setDate(5, dob);
			pst.setString(6, password);
			int rowsUpdated = pst.executeUpdate();
			
			if(rowsUpdated == 0) return null;
			pst.close();
			Student s = new Student(roll,name,branch,dob,password);
			return s;
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			connection = null;
			DBConnection.closeConnection();
		}
		return null;
	}

	@Override
	public Student update(int roll, Student student) 
	{
//		Connection connection = null;
//		try
//		{
//			connection = DBConnection.getConnection();
//			String sql = "insert into student values (?,?,?,?,?,?)";
//
//			PreparedStatement pst = connection.prepareStatement(sql);
//			pst.setInt(1, roll);
//			pst.setString(2, name);
//			pst.setString(3, branch);
//			pst.setInt(4, 0);
//			Date dob = Date.valueOf(dobStr);
//			pst.setDate(5, dob);
//			pst.setString(6, password);
//			int rowsUpdated = pst.executeUpdate();
//			
//			if(rowsUpdated == 0) return null;
//			pst.close();
//			return student;
//		
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//		finally
//		{
//			connection = null;
//			DBConnection.closeConnection();
//		}
		return null;
	}

	@Override
	public Student find(int roll, String password) 
	{
		
		return null;
	}

	@Override
	public Student find(int roll) 
	{
		return null;
	}

	@Override
	public boolean remove(int roll) 
	{
		return false;
	}

	@Override
	public List<Student> findAll() 
	{
		try
		{
			Connection connection = DBConnection.getConnection();
			String sql  = "select * from student";
			PreparedStatement pst = connection.prepareStatement(sql);
			List<Student> list = new ArrayList<>();
			pst.executeQuery();
			ResultSet resultSet = pst.getResultSet();
			while(resultSet.next())
			{
				int rollInt = resultSet.getInt(1);
				String name = resultSet.getString("name");
				String branch = resultSet.getString("branch");
				String passwordDb = resultSet.getString("password");
				Date dob = resultSet.getDate("dob");
				Student s = new Student(rollInt, name, branch,dob ,passwordDb);
				list.add(s);
			}
			return list;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}

}
