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

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeCrudRepository repository;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeCrudRepository repository) {
//		System.out.println("Service Implementation called...");
		this.repository = repository;
	}

	@Override
	public List<Employee> getAllEmp() {
		Iterable<Employee> empItr = repository.findAll();
		List<Employee> emplist = new ArrayList<Employee>();
		empItr.forEach(x -> emplist.add(x));
		return emplist;
	}

	@Override
	public void saveEmp(Employee emp) {
		repository.save(emp);
	}

	@Override
	public void saveAllEmp(List<Employee> empList) {
		repository.saveAll(empList);

	}

	@Override
	public void deleteEmpById(Integer empId) {
		repository.deleteById(empId);
	}

	@Override
	public void deleteAllEmp() {
		repository.deleteAll();
	}

	@Override
	public void updateEmpById(Integer empId, String name) {
		Employee employee = repository.findById(empId).orElse(null);
		employee.setEmpName(name);
		repository.save(employee);
	}

	@Override
	public Employee getEmpById(Integer empId) {
		Employee employee = repository.findById(empId).orElse(null);
		return employee;
	}

	

}