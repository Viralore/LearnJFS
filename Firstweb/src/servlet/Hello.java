package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello
 */
@WebServlet({ "/Hello", "/hi" })
public class Hello extends HttpServlet 
{
	int count = 101;
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hello() 
    {
        super();
        System.out.println("Hello Object Created");
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException 
	{
		System.out.println("init called");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() 
	{
		System.out.println("destroy called");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("doGet called sending response");
		PrintWriter writer = response.getWriter();
		writer.append("this is a message from servlet\n");
		writer.append("current time : " + new Date()+"\n");
		writer.append("Visitor number : " + count++);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("doPost called sending response");
		doGet(request, response);
	}

}
