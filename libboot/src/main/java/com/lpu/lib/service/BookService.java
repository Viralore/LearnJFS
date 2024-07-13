package com.lpu.lib.service;

import java.util.List;

import com.lpu.lib.model.Book;

public interface BookService 
{
	Book add(String title, String author, String publisher);
	Book update(int bid, Book book);
	List<Book> findByAuthor(String author);
	Book find(int bid);
	boolean remove(int bid);
	List<Book> findAll();
	List<Book> find(int start,int number);
}
