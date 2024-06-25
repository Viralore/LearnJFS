package model;


@SuppressWarnings("unused")
public class Book 
{
	private int bookID;
	private String title;
	private String author;
	private int bookTypeID = 1;
	private String publisher;
	
	public Book(int bookID, String title, String author, String publisher) 
	{
		super();
		this.bookID = bookID;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}
	
	public String getTitle() 
	{
		return title;
	}
	
	public void setTitle(String title) 
	{
		this.title = title;
	}
	
	public String getAuthor() 
	{
		return author;
	}
	
	public void setAuthor(String author) 
	{
		this.author = author;
	}
	
	public int getBookID() 
	{
		return bookID;
	}
	
	public void setBookID(int bookID) 
	{
		this.bookID = bookID;
	}
	
	public String getPublisher() 
	{
		return publisher;
	}
	
	public void setPublisher(String publisher) 
	{
		this.publisher = publisher;
	}
	
	@Override
	public String toString() 
	{
		return "Book [title = " + title + ", author = " + author + ", bookID = " + bookID + ", publisher = " + publisher + "]";
	}
	

}
