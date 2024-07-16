package com.lpu.lib.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;


import com.lpu.lib.model.Book;
import com.lpu.lib.repo.BookRepository;

//3 methods of creating bean : 1. component/service/repository 2. Configuration 3. XML 
@Service
public class BookServiceImpl implements BookService 
{
	@Autowired
	BookRepository bookRepository;
	
	@Override
	@Transactional
	public Book add(String title, String author, String publisher) 
	{
		//spring will start transaction
		
		Book b = new Book(0,title,author,publisher);
		bookRepository.save(b);
		
		//spring will commit transaction
		return b;
	}

	@Override
	@Transactional	//automatically save all the data 
	public Book update(int bid, Book book) 
	{
		Optional<Book> obj = bookRepository.findById(bid);
		if(obj.isPresent())
		{
			Book ex = obj.get();
			ex.setAuthor(book.getAuthor());
			ex.setTitle(book.getTitle());
			ex.setBookTypeid(book.getBookTypeid());
			ex.setIssue(book.getIssue());
			ex.setPublisher(book.getPublisher());
			return ex;
		}
		throw new RuntimeException("NO Book found with id : "+bid);
	}

	@Override
	public List<Book> findByAuthor(String author) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book find(int bid) 
	{
		Optional<Book> opt = bookRepository.findById(bid);
		if(opt.isPresent()) return opt.get();
		else return null;
	}

	@Override
	public boolean remove(int bid) 
	{
		Optional<Book> book = bookRepository.findById(bid);
		if(book.isPresent())
		{
			bookRepository.delete(book.get());
			return true;
		}
		return false;
	}

	@Override
	public List<Book> findAll() 
	{
		return bookRepository.findAll();
	}

	@Override
	public List<Book> find(int start, int number) 
	{
		return null;
	}

	@Override
	public Book saveBook(Book book) 
	{
		return this.add(book.getTitle(), book.getAuthor(), book.getPublisher());
	}
	
	

}
