package com.bhawnagunwani.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.bhawnagunwani.models.Employee;

public class EmployeeDAOJDBCTemplate implements EmployeeDAO {
	
	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public List<Employee> getAllEmployees() {
		return null;
	}

	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void saveEmployee(Employee employee) {
		String query = "INSERT INTO EMPLOYEE(id,name,role) VALUES(?,?,?)";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		Object[] args = new Object[] { employee.getId(), employee.getName(), employee.getRole() };
		int result = jdbcTemplate.update(query, args);
		if(result > 0)
			System.out.println("Employee Inserted with Id : " + employee.getId());
		else
			System.out.println("Employee couldn't added. Check again..!!");
	}

	public void updateEmployeeById(Employee employee, int id) {
		// TODO Auto-generated method stub
		
	}

	public void deleteEmployeeById(int id) {
		// TODO Auto-generated method stub
		
	}

}
