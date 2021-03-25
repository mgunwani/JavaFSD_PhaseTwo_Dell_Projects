package jdbc_crud_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetrievingEmployeeRecords {
	
	public static void main(String[] args) {
		
		try {
			
			// Driver Class for MySQL
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Creating Connection
			Connection connection = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/simplilearndb", "root", "password@123456");
			// Create Statement
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("SELECT * FROM employees");
			while(rs.next())
				System.out.println(rs.getInt(1) + " : " + rs.getString(2) + " : " + rs.getFloat(3));
			connection.close();
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}

}
