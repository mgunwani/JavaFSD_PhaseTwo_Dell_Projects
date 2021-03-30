package com.bhawnagunwani;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bhawnagunwani.config.AppConfig;
import com.bhawnagunwani.ioc.HelloWorld;

public class Application {
	
	public static void main(String[] args) {
		
		// Creating Spring Container
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		// Retrieve Spring Container Object
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		System.out.println(obj.getMessage());
		context.close();
	}

}
