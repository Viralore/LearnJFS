package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Book;

public class BookDAOImplDB implements BookDAO
{

	@Override
	public Book add(String title, String author, String publisher) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book update(int bid, Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> findByAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book find(int bid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(int bid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Book> findAll() 
	{
		try
		{
			Connection connection = DBConnection.getConnection();
			String sql  = "select * from book";
			PreparedStatement pst = connection.prepareStatement(sql);
			List<Book> list = new ArrayList<>();
			pst.executeQuery();
			ResultSet resultSet = pst.getResultSet();
			while(resultSet.next())
			{
				int bid = resultSet.getInt("bid");
				String title = resultSet.getString("title");
				String author = resultSet.getString("author");
				String publisher = resultSet.getString("publisher");
				int bookTypeId = resultSet.getInt("bookTypeid");
				int isid = resultSet.getInt("isid");
				Book b = new Book(bid,title,author,publisher);
				b.setIsid(isid);
				b.setBookTypeid(bookTypeId);
				list.add(b);
			}
			return list;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Book> find(int start, int number) 
	{
		List<Book> list = this.findAll();
		
		if(start < list.size() && start+number < list.size())
		{
			return list.subList(start, start+number);
		}
		else return list.subList(list.size()-number, list.size());
	}

}
