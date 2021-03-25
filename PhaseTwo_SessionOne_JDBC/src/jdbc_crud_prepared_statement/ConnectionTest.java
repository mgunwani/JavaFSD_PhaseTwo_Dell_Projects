package jdbc_crud_prepared_statement;

import java.io.*;
import java.sql.*;
import java.util.Properties;

public class ConnectionTest {
	
	public static Properties loadProperties() throws IOException {
	
		Properties prop = new Properties();
		InputStream in = new FileInputStream("jdbc.properties");
		prop.load(in);
		in.close();
		return prop;
		
	}
	
	public static void main(String[] args) throws IOException {
		
		Properties prop = loadProperties();
		
		String driverClass = prop.getProperty("MYSQLJDBC.driver");
		String url = prop.getProperty("MYSQLJDBC.url");
		String username = prop.getProperty("MYSQLJDBC.username");
		String password = prop.getProperty("MYSQLJDBC.password");
		
		try {	
			Class.forName(driverClass);
			Connection connection = DriverManager.getConnection(url, username, password);
			if(connection != null)
				System.out.println("Connection Created Successfully..!!");
			else
				System.out.println("Unable to create connection..!!");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
