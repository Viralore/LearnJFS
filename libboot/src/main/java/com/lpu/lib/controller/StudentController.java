package com.lpu.lib.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lpu.lib.model.Student;
import com.lpu.lib.repo.StudentRepository;
import com.lpu.lib.service.StudentService;

@RestController
public class StudentController 
{
	@Autowired
	StudentService studentService;
	
	@GetMapping(value = "/students", produces = "application/json")
	List<Student> getStudents()
	{
		return studentService.findAll();
	}
}
