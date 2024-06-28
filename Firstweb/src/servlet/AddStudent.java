package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.StudentService;
import service.StudentServiceImpl;

/**
 * Servlet implementation class AddStudent
 */
@WebServlet("/addStudent")
public class AddStudent extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	
	private StudentService studentService = new StudentServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddStudent() 
    {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String name = request.getParameter("name");
		String roll = request.getParameter("roll");
		String branch = request.getParameter("branch");
		String password = request.getParameter("password");
		String dobStr = request.getParameter("dob");
		Date dob = Date.valueOf(dobStr);
		studentService.add(Integer.parseInt(roll), name, branch,dob ,password);
		PrintWriter writer = response.getWriter();
		writer.append("Student added");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
