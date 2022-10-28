package com.project2.pdfgenerator.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project2.pdfgenerator.pojo.Employee;

public interface EmployeeJPARepository extends JpaRepository<Employee, Integer>{

	
	
}
