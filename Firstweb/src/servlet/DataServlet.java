package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Issue;
import service.IssueService;
import service.IssueServiceImpl;

/**
 * Servlet implementation class DataServlet
 */
@SuppressWarnings("unused")
@WebServlet("/dataServlet")
public class DataServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	private IssueService issueService = new IssueServiceImpl();
    

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session = request.getSession();
		
		Object roll = session.getAttribute("roll");
		Object loginTime = session.getAttribute("loginTime");
		Object password = session.getAttribute("password");
		
		List<Issue> allIssues = issueService.allIssues((Integer)roll, (String)password);
		request.setAttribute("allIssues", allIssues);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("show-detail-student.jsp");
		requestDispatcher.forward(request, response);
		
		
	}

}
