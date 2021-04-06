package com.bhawnagunwani.SpringBootDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bhawnagunwani.SpringBootDemo.dao.EmployeeDAO;
import com.bhawnagunwani.SpringBootDemo.models.Employee;

//
@RestController
@RequestMapping(value="/employees")
public class EmployeeController {

	@Autowired
	EmployeeDAO employeeDAO;
	
	// Access URL: http://localhost:8081/employees/
	@GetMapping(path="/", produces = "application/json")
	public List<Employee> getEmployees() {
		return employeeDAO.getAllEmployees();
	}
	
	// Access URL http://localhost:8081/employees/emp/?id=102
	@GetMapping(path = "/emp/", produces = "application/json")
	public Employee getEmployee(@RequestParam(name="id") int id) {
		return employeeDAO.getEmployeeById(id);
	}
	
	// Access URL: http://localhost:8081/employees/101
	@RequestMapping(value = "/{id}",method = RequestMethod.GET)
	public Employee getEmployee1(@PathVariable int id) {
		return employeeDAO.getEmployeeById(id);
	}
	
}
