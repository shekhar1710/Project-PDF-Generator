package com.project2.pdfgenerator.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.project2.pdfgenerator.pojo.Employee;
import com.project2.pdfgenerator.repo.EmployeeCrudRepository;
import com.project2.pdfgenerator.repo.EmployeeJPARepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

//	private EmployeeCrudRepository repository;
	private EmployeeJPARepository jpaRepository;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeJPARepository jpaRepository) {
//		System.out.println("Service Implementation called...");
		this.jpaRepository = jpaRepository;
	}

	@Override
	public List<Employee> getAllEmp() {
		Iterable<Employee> empItr = jpaRepository.findAll();
		List<Employee> emplist = new ArrayList<Employee>();
		empItr.forEach(x -> emplist.add(x));
		return emplist;
	}

	@Override
	public void saveEmp(Employee emp) {
		jpaRepository.save(emp);
	}

	@Override
	public void saveAllEmp(List<Employee> empList) {
		jpaRepository.saveAll(empList);

	}

	@Override
	public void deleteEmpById(Integer empId) {
		jpaRepository.deleteById(empId);
	}

	@Override
	public void deleteAllEmp() {
		jpaRepository.deleteAll();
	}

	@Override
	public void updateEmpById(Integer empId, String name) {
		Employee employee = jpaRepository.findById(empId).orElse(null);
		employee.setEmpName(name);
		jpaRepository.save(employee);
	}

	@Override
	public Employee getEmpById(Integer empId) {
		Employee employee = jpaRepository.findById(empId).orElse(null);
		return employee;
	}

	@Override
	public List<Employee> getByName(String empName) {
		return jpaRepository.findByEmpName(empName);
	}

	@Override
	public List<Employee> getEmpGreaterThan50K() {

		return jpaRepository.findByEmpSal();
	}

	@Override
	public List<Employee> getEmpBySalary(Double empSal) {
		return jpaRepository.findByEmpSal(empSal);
	}

	
	

}