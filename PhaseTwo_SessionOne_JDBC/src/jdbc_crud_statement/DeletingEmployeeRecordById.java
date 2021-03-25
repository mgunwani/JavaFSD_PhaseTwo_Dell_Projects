package jdbc_crud_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeletingEmployeeRecordById {
	
	public static void main(String[] args) {
		
		int id = 2;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/simplilearndb", "root","password@123456");
			Statement statement = connection.createStatement();
			int result = statement.executeUpdate("DELETE FROM employees WHERE id = " + id);
			if(result > 0)
				System.out.println(result + " record(s) deleted successfully.");
			else 
				System.out.println("There is no such record exists.");
			connection.close();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}

}
