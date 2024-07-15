package com.lpu.lib.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lpu.lib.model.Issue;

@Repository
public interface IssueRepository extends JpaRepository<Issue, Integer> 
{
	//in HQL => like object oriented sql
	//native query => direct sql ==> it will only run on mysql
//	@Query(value ="from Issue iss where iss.roll = :roll and iss.actretdate is null")
	@Query(value ="select * from issue where roll = :roll and actretdate is null",nativeQuery = true)
	List<Issue> getActiveIssues(int roll); //not automatically added
	
}
