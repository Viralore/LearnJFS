package dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import model.Book;
import model.Student;

@SuppressWarnings("unused")
public class BookDAOImpl implements BookDAO 
{
	private static Map<Integer,Book> map = new HashMap<>();
	
	static
	{
		map.put(2101,new Book(2101,"C","Ritchie","Pearson"));
		map.put(2102,new Book(2102,"Java","Herbert S","Mcgraw Hill"));
		map.put(2103,new Book(2103,"Javascript","Deitel","UniversityPress"));
		map.put(2104,new Book(2104,"DBMS","Korth","Tata McGr"));
		map.put(2105,new Book(2105,"Java","Herbert S","Mcgraw Hill"));
	}

	@Override
	public Book add(int bookID, String title, String author, String publisher) 
	{
		Set<Integer> keySet = map.keySet();
		int maxBookID = Collections.max(keySet);
		Book b = new Book(maxBookID+1,title,author,publisher);
		map.put(maxBookID+1, b);
		return b;
	}

	@Override
	public Book update(int bookID, Book book) 
	{
		if(!map.containsKey(bookID)) throw new RuntimeException("Book does not exist");
		map.put(bookID,book);
		return book;
	}

	@Override
	public List<Book> findByAuthor(String author) 
	{
		Collection<Book> values = map.values();
		List<Book> value = new ArrayList<>(values);
		List<Book> bookByAuthor = new ArrayList<>();
		
		for(Book b : value)
		{
			if(b.getAuthor().contains(author)) bookByAuthor.add(b);
		}
		
		return bookByAuthor;
		
//		Collection<Book> values = map.values();
//		values.removeIf(bk -> !bk.getAuthor().equals(author));
//		return new ArrayList<Book>(values);
		//return map.values().stream.filter(bk -> !bk.getAuthor().equals(author)).collect(Collector.toList());
		
	}

	@Override
	public List<Book> findAll() 
	{
		return new ArrayList<Book>(map.values());
	}

	@Override
	public Book find(int bookID) 
	{
		return map.get(bookID);
	}

	@Override
	public Book find(int bookID, String password,StudentDAOImpl s) 
	{
		Map<Integer,Student> temp = s.getMap();
		
		return null;
	}
	

	

}
