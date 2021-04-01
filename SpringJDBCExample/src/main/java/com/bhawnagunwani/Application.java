package com.bhawnagunwani;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bhawnagunwani.dao.EmployeeDAO;
import com.bhawnagunwani.models.Employee;

public class Application {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeDAO employeeDAO = context.getBean("empDAO", EmployeeDAO.class);

		int choice = 0;
		char ch = 'y';
		int id = 0;
		Scanner scanner = new Scanner(System.in);
		context.close();
		do {
			System.out.println();
			System.out.println("1 - Get All Employees");
			System.out.println("2 - Get Employee By Id");
			System.out.println("3 - Add New Employees");
			System.out.println("4 - Update Employee");
			System.out.println("5 - Delete Employee");
			System.out.print("Enter Choice : ");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				List<Employee> employees = employeeDAO.getAllEmployees();
				for (Employee employee : employees)
					System.out.println(employee);
				break;

			case 2:
				System.out.print("Enter Employee Id to Fetch Record : ");
				id = scanner.nextInt();
				Employee employee = employeeDAO.getEmployeeById(id);
				if(employee != null)
					System.out.println(employee);
				else
					System.out.println("Employee Not Found with Id : " + id);
				break;

			case 3:
				Employee emp = new Employee();
				int random = new Random().nextInt(1000);
				emp.setId(random);
				scanner.nextLine();
				System.out.print("Enter Employee Name : ");
				emp.setName(scanner.nextLine());
				System.out.print("Enter Employee Role : ");
				emp.setRole(scanner.nextLine());
				employeeDAO.saveEmployee(emp);
				break;

			case 4:
				System.out.print("Enter Employee Id to Update Record : ");
				id = scanner.nextInt();
				Employee empl = employeeDAO.getEmployeeById(id);
				if(empl != null) {
					scanner.nextLine();
					System.out.print("Enter Employee Name : ");
					empl.setName(scanner.nextLine());
					System.out.print("Enter Employee Role : ");
					empl.setRole(scanner.nextLine());
					employeeDAO.updateEmployeeById(empl, id);	
				} else {
					System.out.println("Employee doesn't exist with Id : " + id);
				}
				
				break;

			case 5:
				System.out.print("Enter Employee Id to Delete Record : ");
				id = scanner.nextInt();
				employeeDAO.deleteEmployeeById(id);
				break;

			default:
				break;

			}
			System.out.print("\n Do you wish to continue ? : ");
			ch = scanner.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');

	}

}
