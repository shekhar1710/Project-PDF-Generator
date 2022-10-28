package com.project2.pdfgenerator.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project2.pdfgenerator.pojo.Employee;
@Repository
public interface EmployeeCrudRepository extends CrudRepository<Employee, Integer> {

}
