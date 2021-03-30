package com.bhawnagunwani;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bhawnagunwani.ioc.Employee;

public class Application {
	
	public static void main(String[] args) {
		
		/*
		 * ClassPathXmlApplicationContext context = new
		 * ClassPathXmlApplicationContext("applicationContext.xml"); Employee emp =
		 * (Employee) context.getBean("employee"); System.out.println(emp);
		 * context.close();
		 */
		
		/*
		 * ClassPathXmlApplicationContext context = new
		 * ClassPathXmlApplicationContext("applicationContext.xml"); Employee emp =
		 * (Employee) context.getBean("employee1"); System.out.println(emp);
		 * context.close();
		 */
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee emp = (Employee) context.getBean("employee2");
		System.out.println(emp);
		context.close();
	}

}
