package com.lpu.lib.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lpu.lib.model.Book;
import com.lpu.lib.service.BookService;

@RestController
public class BookController 
{
//	BookController class us dependent on BookRepository
//	I want spring to create an object of BookRepository and inject it here
//	How will it search the bookRepo
//	1. byName
//	2. byType
//	3. Constructor
//	Object created by spring is called bean
	
	@Autowired
	BookService bookService;
	
	@GetMapping(value = "/books", produces = "application/json")
	public List<Book> getBooks()
	{
		return bookService.findAll();
	}
	
	@GetMapping(value = "/book/{bid}", produces = "application/json")
	public Book getBook(@PathVariable("bid") int bid)
	{
		return bookService.find(bid);
	}
	
	@PostMapping(value = "/books",consumes = "application/json", produces = "application/json")
	public Book savebook(@RequestBody Book book)
	{
		Book bk = bookService.saveBook(book);
		System.out.println("Book saved : " + bk);
		return bk;
	}
	
	@Transactional
	@DeleteMapping(value = "/book/{bid}", produces = "application/json")
	public Book deleteBook(@PathVariable("bid") int bid)
	{
		Book bk = bookService.find(bid);
		if(bk==null)
		{
			throw new RuntimeException("No book with book id : "+bid+" is present");
		}
		else
		{
			bookService.remove(bid);
			return bk;
		}
	}
	
}
