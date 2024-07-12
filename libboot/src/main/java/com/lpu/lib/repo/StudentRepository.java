package com.lpu.lib.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lpu.lib.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> 
{

}
