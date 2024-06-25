package dao;

import java.util.List;

import model.Book;

public interface BookDAO 
{
	Book add(int bookID,String title,String author, String publisher);
	Book update(int bookID,Book book);
	List<Book> findByAuthor(String author);
	List<Book> findAll();
	Book find(int bookID);
	Book find(int bookID,String password,StudentDAOImpl s);
	
//	boolean remove(int Bo)
}
