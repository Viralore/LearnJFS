package com.lpu.lib.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lpu.lib.model.Book;
import com.lpu.lib.repo.BookRepository;

@RestController
public class BookController 
{
	@Autowired
	BookRepository bookRepostiory;
	
	@GetMapping(value = "/books", produces = "application/json")
	List<Book> getBooks()
	{
		return bookRepostiory.findAll();
	}
	
}
