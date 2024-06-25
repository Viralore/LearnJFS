package service;

import java.util.List;

import model.Issue;

public interface IssueService 
{
	Issue add(int bid, int sid);
	Issue update(int isid, Issue issue);
	Issue find(int isid);
	List<Issue> findAll();
	
	List<Issue> allIssues(int sid,String password);
	
}
