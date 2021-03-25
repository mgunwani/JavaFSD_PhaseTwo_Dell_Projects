package jdbc_crud_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdatingEmployeeRecordById {

	public static void main(String[] args) {
		
		int id = 1;
		String name ="Kartik";
		float salary = 50000;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/simplilearndb", "root","password@123456");
			Statement statement = connection.createStatement();
			int result = statement.executeUpdate
					("UPDATE employees SET name = '" + name + "', salary = '" + salary + "' WHERE id = " + id);
			if(result > 0)
				System.out.println(result + " record(s) updated successfully.");
			else 
				System.out.println("There is no such record exists.");
			connection.close();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}
	
}
