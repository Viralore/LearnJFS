package com.lpu.lib.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lpu.lib.model.Book;
import com.lpu.lib.model.Issue;
import com.lpu.lib.model.Student;
import com.lpu.lib.repo.BookRepository;
import com.lpu.lib.repo.IssueRepository;
import com.lpu.lib.repo.StudentRepository;

@Service
public class IssueReturnServiceImpl implements IssueReturnService 
{
	@Autowired
	IssueRepository issueRepository;
	
	@Autowired
	BookRepository bookRepository;
	
	@Autowired
	StudentRepository studentRepository;

	@Override
	public Issue issueBook(Book book, Student student) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Issue returnBook(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Issue> getActiveIssues(int roll) 
	{
		return issueRepository.getActiveIssues(roll);
	}

}
