package servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Student;
import service.StudentService;
import service.StudentServiceImpl;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	private StudentService studentService = new StudentServiceImpl();
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String roll = request.getParameter("roll");
		String password = request.getParameter("password");
		int rollNumber = 0;
		try
		{
			rollNumber = Integer.parseInt(roll);
		}
		catch(Exception e)
		{
//			response.sendRedirect("index.jsp");
		}
		
		
		System.out.println("Roll : "+ roll + " Password : "+ password);
		
		Student student = studentService.login(rollNumber,password);
		
		if(student == null) 
		{
			response.sendRedirect("index.jsp");
			return;
		}
		
		HttpSession session = request.getSession();
		session.setAttribute("roll", student.getRoll());
		session.setAttribute("loginTime", new Date());
		session.setAttribute("ipAddress", request.getRemoteAddr());
		session.setAttribute("password", password);
		request.getRequestDispatcher("dataServlet").forward(request, response);
		return;
	}

}
