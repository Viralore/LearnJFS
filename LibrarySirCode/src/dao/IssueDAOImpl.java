package dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Issue;
import model.Student;

public class IssueDAOImpl implements IssueDAO
{
	private StudentDAO studentDAO = new StudentDAOImpl();
	private static Map<Integer,Issue> map = new HashMap<>();//control + shift + O
	
	static 
	{
		Issue[] issues = new Issue[5];
		for(int i=0;i<3;i++)
		{
			issues[i] = new Issue(i,2101+i,101);
		}
		for(int i=3;i<5;i++) issues[i] = new Issue(i,2101+i,102);
		
		for(int i=0;i<5;i++)
		{
			issues[i].setActRetDate(LocalDate.now().plusDays(5));
		}
		
		for(int i=0;i<5;i++)
		{
			map.put(issues[i].getIsid(), issues[i]);
		}
		
	}
	public Issue add(int bid, int sid) {
		Issue is = new Issue(bid, sid);
		int nextid;
		if(map.keySet().size() == 0) nextid = 1001;
		else nextid = Collections.max(map.keySet()) + 1;
		is.setIsid(nextid );
		map.put(nextid, is);
		return is;
	}
	
	public Issue update(int isid, Issue issue) 
	{
		if(map.containsKey(isid))
		{
			map.put(isid, issue);
			return issue;
		}
		return null;
	}
	
	public Issue find(int isid) 
	{
		return map.get(isid);
	}
	
	public List<Issue> findAll()
	{
		return new ArrayList<>(map.values());
	}

	@Override
	public List<Issue> allIssues(int sid, String password) 
	{
		Student student = studentDAO.find(sid,password);
		if(student == null) return null;
		
		List<Issue> list = new ArrayList<Issue>();
		
		for(Map.Entry<Integer, Issue> entry : map.entrySet())
		{
			Issue temp = entry.getValue();
			if(temp.getSid() == sid) list.add(temp);
		}
		
		return list;
	}
	

	// select and press control /
}
