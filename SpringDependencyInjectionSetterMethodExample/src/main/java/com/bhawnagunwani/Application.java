package com.bhawnagunwani;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bhawnagunwani.ioc.Employee;

public class Application {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee emp = (Employee) context.getBean("employee");
		Employee emp1 = (Employee) context.getBean("employee1");
		System.out.println(emp);
		System.out.println(emp1);
		context.close();
	}

}
