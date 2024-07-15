package com.lpu.lib.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lpu.lib.model.Student;
import com.lpu.lib.repo.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService 
{
	@Autowired
	StudentRepository studentRepository;

	@Override
	public Student find(int roll)
	{
		Optional<Student> opt = studentRepository.findById(roll);
		if(opt.isPresent()) return opt.get();
		else return null;
	}

	@Override
	public List<Student> findAll() 
	{
		return studentRepository.findAll();
	}
	
	

}
