package com.project2.pdfgenerator.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.project2.pdfgenerator.pojo.Employee;

public interface EmployeeJPARepository extends JpaRepository<Employee, Integer>{

	public List<Employee> findByEmpId(Integer empId);
	
	public List<Employee> findByEmpName(String empName);
	
	public List<Employee> findByEmpDept(String empDept);
	
	@Query(value =  "select * from employee where emp_sal >= 50000", nativeQuery = true)
	public List<Employee> findByEmpSal();
	
	@Query(value =  "select * from employee where emp_sal >= :emp_sal", nativeQuery = true)
	public List<Employee> findByEmpSal(@Param("emp_sal")Double empSal);
	
}
