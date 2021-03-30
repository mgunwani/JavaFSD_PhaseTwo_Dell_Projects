package com.bhawnagunwani.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bhawnagunwani.ioc.HelloWorld;

@Configuration
public class AppConfig {

	@Bean
	public HelloWorld helloWorld() {
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.setMessage("Hello Everyone!!");
		return helloWorld;
	}
	
}
