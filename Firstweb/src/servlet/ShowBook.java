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
import javax.servlet.http.HttpSession;

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
		int start = 0;
		HttpSession session = request.getSession();
		
		if(session.getAttribute("bookStartNumberSession") == null)
		{
			session.setAttribute("bookStartNumberSession", start+2);
		}
		else
		{
			Object value = session.getAttribute("bookStartNumberSession");
			try
			{
				start = (int) value;
			}
			catch(Exception e)
			{
				//
			}
		}
		
		List<Book> list = bookService.find(start,2);
		request.setAttribute("allBooks", list);
		session.setAttribute("bookStartNumberSession", start+2);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("show-book-session.jsp");
		requestDispatcher.forward(request, response);
	}

}
