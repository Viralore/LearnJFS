package com.lpu.lib.service;

import java.util.List;

import com.lpu.lib.model.Student;

public interface StudentService 
{
	Student find(int roll);
	List<Student> findAll();
}
