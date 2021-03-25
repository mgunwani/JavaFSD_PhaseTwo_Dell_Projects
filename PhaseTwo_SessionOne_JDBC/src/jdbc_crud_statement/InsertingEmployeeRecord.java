package jdbc_crud_statement;

import java.sql.*;

public class InsertingEmployeeRecord {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/simplilearndb", "root","password@123456");
			Statement statement = connection.createStatement();
			int result = statement.executeUpdate
					("INSERT INTO employees(Name, Salary) VALUES('Bhawna Gunwani', 30000)");
			if(result > 0)
				System.out.println(result + " record inserted successfully.");
			connection.close();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

}
