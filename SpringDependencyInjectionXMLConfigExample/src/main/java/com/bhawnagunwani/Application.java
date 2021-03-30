package com.bhawnagunwani;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.bhawnagunwani.ioc.HelloWorld;

public class Application {
	
	public static void main(String[] args) {
		
		/*
		 * // Creating Spring Container ClassPathXmlApplicationContext context = new
		 * ClassPathXmlApplicationContext("applicationContext.xml"); // Retrieve Beans
		 * from Spring Container HelloWorld obj =
		 * (HelloWorld)context.getBean("helloWorld");
		 * System.out.println(obj.getMessage()); context.close();
		 */
		
		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		HelloWorld obj = (HelloWorld)factory.getBean("helloWorld");
		System.out.println(obj.getMessage());
	}

}
