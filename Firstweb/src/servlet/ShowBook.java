package servlet;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Book;
import service.BookService;
import service.BookServiceImpl;

/**
 * Servlet implementation class ShowBook
 */
@WebServlet("/showBooks")
public class ShowBook extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	
	private BookService bookService = new BookServiceImpl();
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Cookie[] cookies = request.getCookies();
		int start = 0;
		for(Cookie ck : cookies)
		{
			if(ck.getName().equals("bookStartNumber"))
			{
				String value = ck.getValue();
				start = Integer.parseInt(value);
			}
		}
		
		List<Book> list = bookService.find(start,2);
		Cookie ck = new Cookie("bookStartNumber",""+(start+2)); //to convert into string ""+(number)
		
		request.setAttribute("allBooks", list);
		response.addCookie(ck);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("show-books.jsp");
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
