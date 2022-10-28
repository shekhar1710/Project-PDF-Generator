package com.project2.pdfgenerator.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project2.pdfgenerator.pojo.Employee;
import com.project2.pdfgenerator.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

@Autowired
	private EmployeeService service;
	
	@GetMapping("/{id}")
	public Employee getEmpById( @PathVariable Integer id) {	
	return service.getEmpById(id);
	}
	
	@GetMapping("/getAll")
	public List<Employee> getAllEmp(){
		return service.getAllEmp();
	}

	@GetMapping("/name")
	public List<Employee> getByName(@RequestParam String name){
		return service.getByName(name);
	}
	
	@GetMapping("/50k")
	public List<Employee> getEmpGreaterThan50K(){
		return service.getEmpGreaterThan50K();
	}
	
	@GetMapping("/salary/{empsalary}")
	public List<Employee> getEmpBySalary(@PathVariable(name = "empsalary") Double empSal){
		return service.getEmpBySalary(empSal);
	}
	
	@PostMapping("/save")
	
	public String saveEmp(Employee emp) {
		service.saveEmp(emp);
		return "record is saved";
	}
}