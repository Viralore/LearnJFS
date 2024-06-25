package service;

import java.util.List;

import dao.IssueDAO;
import dao.IssueDAOImpl;
import model.Issue;

public class IssueServiceImpl implements IssueService 
{
	IssueDAO issueDAO = new IssueDAOImpl();

	@Override
	public List<Issue> allIssues(int sid, String password) 
	{
		return issueDAO.allIssues(sid, password);
	}

	@Override
	public Issue add(int bid, int sid) 
	{
		return issueDAO.add(bid, sid);
	}

	@Override
	public Issue update(int isid, Issue issue) 
	{
		return issueDAO.update(isid, issue);
	}

	@Override
	public Issue find(int isid) 
	{
		return issueDAO.find(isid);
	}

	@Override
	public List<Issue> findAll() 
	{
		return issueDAO.findAll();
	}
	

}
