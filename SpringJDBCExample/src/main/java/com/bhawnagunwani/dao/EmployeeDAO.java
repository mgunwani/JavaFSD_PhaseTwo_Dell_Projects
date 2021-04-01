package com.bhawnagunwani.dao;

import java.util.List;

import com.bhawnagunwani.models.Employee;

public interface EmployeeDAO {
	
	// Get All Employees
	public List<Employee> getAllEmployees();
	
	// Get Employee By Id
	public Employee getEmployeeById(int id);

	// Add New Employee
	public void saveEmployee(Employee employee);
	
	// Update Existing Employee By Id
	public void updateEmployeeById(Employee employee, int id);
	
	// Delete Existing Employee By Id
	public void deleteEmployeeById(int id);
	
}
