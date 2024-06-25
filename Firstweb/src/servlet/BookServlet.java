package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Book;
import service.BookService;
import service.BookServiceImpl;

/**
 * Servlet implementation class BookServlet
 */
@WebServlet("/Books")
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private BookService bookService = new BookServiceImpl();
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int bid = Integer.parseInt(request.getParameter("bid"));
		
		PrintWriter writer = response.getWriter();
		
		
		
		Book bk = bookService.find(bid);
		if(bk != null)
		{
			String book = bk.toString();
			writer.append("Book Found \n");
			writer.append("Details of the Book : " + book);
		}
		else
		{
			writer.append("Book not found");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
