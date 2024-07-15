package com.lpu.lib.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lpu.lib.model.Issue;
import com.lpu.lib.model.Student;
import com.lpu.lib.service.IssueReturnService;
import com.lpu.lib.service.StudentService;

@Controller
public class StudentControllerMVC 
{
	@Autowired
	StudentService studentService;
	
	@Autowired
	IssueReturnService issueReturnService;
	
	
	@GetMapping(value="/mvc-students")
	public String getStudent(@RequestParam("sid") int sid, ModelMap model)
	{
		Student student = studentService.find(sid);
		
		List<Issue> issues = issueReturnService.getActiveIssues(sid);
		
		model.put("activeIssues", issues);
		model.put("student", student);
		
		return "student-show.jsp";	//name of view to be returned
	}
}
