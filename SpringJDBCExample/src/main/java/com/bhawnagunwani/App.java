package com.bhawnagunwani;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bhawnagunwani.dao.EmployeeDAO;
import com.bhawnagunwani.models.Employee;

public class App {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeDAO employeeDAO = context.getBean("employeeDAO", EmployeeDAO.class);
		
		Employee emp = new Employee();
		emp.setId(1001);
		emp.setName("King");
		emp.setRole("Manager");
		
		employeeDAO.saveEmployee(emp);
		
		context.close();
	}

}
