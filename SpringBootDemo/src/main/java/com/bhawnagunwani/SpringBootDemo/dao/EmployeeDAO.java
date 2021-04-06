package com.bhawnagunwani.SpringBootDemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.bhawnagunwani.SpringBootDemo.models.Employee;

@Repository
public class EmployeeDAO {
	
	private List<Employee> empList;
	
	public EmployeeDAO() {
		empList = new ArrayList<Employee>();
		empList.add(new Employee(101, "King", "Kochhar", "king@gmail.com"));
		empList.add(new Employee(102, "Sarah", "Bowling", "sarah@gmail.com"));
		empList.add(new Employee(103, "John", "Smith", "john@gmail.com"));
		empList.add(new Employee(104, "James", "Bond", "james@gmail.com"));
		empList.add(new Employee(105, "Ruskin", "Bond", "ruskin@gmail.com"));
	}
	
	public List<Employee> getAllEmployees(){
		return empList;
	}
	
	public Employee getEmployeeById(int id) {
		for (Employee employee : empList) {
			if(employee.getId() == id)
				return employee;
		}
		return null;
	}

}
