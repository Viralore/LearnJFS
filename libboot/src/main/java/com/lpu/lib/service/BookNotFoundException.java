package com.lpu.lib.service;

public class BookNotFoundException extends Exception 
{
	private int bid;

	public BookNotFoundException(int bid) 
	{
		super("Book not found with id : " + bid);
		this.bid = bid;
	}
	
}
