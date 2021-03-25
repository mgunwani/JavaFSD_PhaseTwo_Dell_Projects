package jdbc_crud_prepared_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertingEmployeeRecord {

	public static void insertEmployee(String name, float salary) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/simplilearndb", "root","password@123456");
			PreparedStatement statement = connection.prepareStatement
					("INSERT INTO employees(Name, Salary) VALUES(?,?);");
			statement.setString(1, name);
			statement.setFloat(2, salary);
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
		System.out.print("Enter Name : ");
		String name = scanner.nextLine();
		System.out.print("Enter Salary : ");
		float salary = scanner.nextFloat();
		insertEmployee(name, salary);

	}

}
