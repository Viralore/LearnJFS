package service;

import java.util.List;

import model.Book;

public interface BookService 
{
	Book add(int bookID,String title,String author, String publisher);
	Book update(int bookID,Book book);
	List<Book> findByAuthor(String author);
	List<Book> findAll();
	Book find(int bookID);
	Book find(int bookID,String password);
}
