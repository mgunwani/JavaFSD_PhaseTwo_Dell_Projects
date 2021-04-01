package com.bhawnagunwani.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.bhawnagunwani.models.Employee;

public class EmployeeDAOImplementation implements EmployeeDAO {

	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public List<Employee> getAllEmployees() {
		List<Employee> empList = new ArrayList<Employee>();
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet result = null;
		try {
			connection = dataSource.getConnection();
			statement = connection.prepareStatement("SELECT * FROM employee");
			result = statement.executeQuery();
			while (result.next()) {
				Employee emp = new Employee();
				emp.setId(result.getInt("id"));
				emp.setName(result.getString("name"));
				emp.setRole(result.getString("role"));
				empList.add(emp);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				result.close();
				statement.close();
				connection.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		return empList;
	}

	public Employee getEmployeeById(int id) {
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet result = null;
		try {
			connection = dataSource.getConnection();
			statement = connection.prepareStatement("SELECT * FROM employee WHERE id = ?");
			statement.setInt(1, id);
			result = statement.executeQuery();
			if(result.next()) {
				Employee emp = new Employee();
				emp.setId(result.getInt("id"));
				emp.setName(result.getString("name"));
				emp.setRole(result.getString("role"));
				return emp;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				result.close();
				statement.close();
				connection.close();
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
			}
		}
		return null;
	}

	public void saveEmployee(Employee employee) {
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			connection = dataSource.getConnection();
			statement = connection.prepareStatement("INSERT INTO EMPLOYEE(id,name,role) VALUES(?,?,?)");
			statement.setInt(1, employee.getId());
			statement.setString(2, employee.getName());
			statement.setString(3, employee.getRole());
			int rows = statement.executeUpdate();
			if (rows > 0)
				System.out.println(rows + " Employee Added Successfully with Id " + employee.getId());
			else
				System.out.println("Employee counldn't be Added. Please Try Again..!!");
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		} finally {
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}

	}

	public void updateEmployeeById(Employee employee, int id) {
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			connection = dataSource.getConnection();
			statement = connection.prepareStatement("UPDATE employee SET name = ? , role = ? WHERE id = ?");
			statement.setString(1, employee.getName());
			statement.setString(2, employee.getRole());
			statement.setInt(3, id);
			int rows = statement.executeUpdate();
			if (rows > 0)
				System.out.println(rows + " Employee Updated Successfully with Id " + employee.getId());
			else
				System.out.println("Employee counldn't be Added. Please Try Again..!!");
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		} finally {
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}

	}

	public void deleteEmployeeById(int id) {
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			connection = dataSource.getConnection();
			statement = connection.prepareStatement("DELETE FROM employee WHERE id = ?");
			statement.setInt(1, id);
			int rows = statement.executeUpdate();
			if (rows > 0)
				System.out.println(rows + " Employee Deleted Successfully with Id " + id);
			else
				System.out.println("Employee counldn't be Deleted. Please Try Again..!!");
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		} finally {
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
