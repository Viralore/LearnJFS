package com.lpu.lib.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	List<Book> getBooks()
	{
		return bookService.findAll();
	}
	
	@GetMapping(value = "/book/{bid}", produces = "application/json")
	Book getBook(@PathVariable("bid") int bid)
	{
		return bookService.find(bid);
	}
	
}
