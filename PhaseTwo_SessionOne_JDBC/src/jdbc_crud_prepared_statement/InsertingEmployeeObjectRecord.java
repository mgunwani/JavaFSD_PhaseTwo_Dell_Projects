package jdbc_crud_prepared_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import models.Employee;

public class InsertingEmployeeObjectRecord {

	public static void insertEmployee(Employee emp) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/simplilearndb", "root","password@123456");
			PreparedStatement statement = connection.prepareStatement
					("INSERT INTO employees(Name, Salary) VALUES(?,?);");
			statement.setString(1, emp.getName());
			statement.setFloat(2, emp.getSalary());
			int result = statement.executeUpdate();
			if(result > 0)
				System.out.println(result + " record(s) inserted successfully.");
			else
				System.out.println("Insertion Failed...");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Employee emp = new Employee();
		System.out.print("Enter Name : ");
		emp.setName(scanner.nextLine());
		System.out.print("Enter Salary : ");
		emp.setSalary(scanner.nextFloat());
		
		insertEmployee(emp);

	}

}
