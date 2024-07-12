package com.lpu.lib.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lpu.lib.model.Student;
import com.lpu.lib.repo.StudentRepository;

@RestController
public class StudentController 
{
	@Autowired
	StudentRepository studentRepository;
	
	@GetMapping(value = "/students", produces = "application/json")
	List<Student> getStudents()
	{
		return studentRepository.findAll();
	}
}
