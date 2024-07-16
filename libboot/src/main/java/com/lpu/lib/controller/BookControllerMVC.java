package com.lpu.lib.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lpu.lib.model.Book;
import com.lpu.lib.service.BookNotFoundException;
import com.lpu.lib.service.BookService;

//@RestController //this will send data only in the response
@Controller //it will accept request, generate model and send to view
public class BookControllerMVC 
{
	@Autowired
	BookService bookService;
	
	
	@GetMapping(value="/mvc-books")
	public String getBook(@RequestParam("bid") int bid, ModelMap model) throws BookNotFoundException
	{
		//get a model from service and pass it to the view (jsp)
		Book book = bookService.find(bid);
		
		//how to give it to jsp
		//request.setAttribute("book",book);
		//request.getRequestDispatcher("/book-show.jsp").forward(request,response);
		
		model.put("book", book);
		
		return "book-show.jsp";	//name of view to be returned
	}
	
	@ExceptionHandler
	public ResponseEntity sendErrorMessage(BookNotFoundException e)
	{
		String message = e.getMessage();
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Handler says No Book : "+message);
	}
	
}
