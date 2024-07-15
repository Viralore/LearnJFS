package com.lpu.lib.service;

import java.util.List;

import com.lpu.lib.model.Book;
import com.lpu.lib.model.Issue;
import com.lpu.lib.model.Student;

public interface IssueReturnService 
{
	public Issue issueBook(Book book,Student student);
	public Issue returnBook(Book book);
	public List<Issue> getActiveIssues(int roll);
}
