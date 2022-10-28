package com.project2.pdfgenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.project2.pdfgenerator.pojo.Employee;
import com.project2.pdfgenerator.service.EmployeeService;
import com.project2.pdfgenerator.service.EmployeeServiceImpl;

@SpringBootApplication
public class SprinBootPDFReportGeneratorApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SprinBootPDFReportGeneratorApplication.class, args);
		EmployeeServiceImpl employeeServiceImpl = context.getBean(EmployeeServiceImpl.class);
		
//		List<Employee> list = new ArrayList<Employee>();
//		Employee employee = new Employee(1001, "Namasya", 10000.00, "Demolition");
//		employeeServiceImpl.saveEmp(employee);
//		list.add(new Employee(1002, "Shekhar", 80000.00, "Mechanical"));
//		list.add(new Employee(1003, "Sneha", 80500.00, "IT"));
//		list.add(new Employee(1004, "Pankaja", 180000.00, "Bio-Medical"));
//		list.add(new Employee(1005, "Vishal", 210000.00, "Civil"));
//		employeeServiceImpl.saveAllEmp(list);

	}

}
