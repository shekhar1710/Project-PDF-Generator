package com.project2.pdfgenerator.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project2.pdfgenerator.pojo.Employee;

public interface EmployeeService {

	
	public Employee getEmpById(Integer empId);
	public List<Employee> getAllEmp();
	public List<Employee> getByName(String empName);
	public List<Employee> getEmpGreaterThan50K();
	public List<Employee> getEmpBySalary(Double empSal);
	
	public void saveEmp(Employee emp);
	
	public void saveAllEmp(List<Employee> empList);
	
	public void updateEmpById(Integer empId,String name);
	
	public void deleteEmpById(Integer empId);
	public void deleteAllEmp();
	
   
	
}