package com.bhawnagunwani.SpringBootDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author BhawnaGunwani
 *
 * Controller is a request handler.
 *
 */

@RestController
public class HelloWorldController {

	// Access URL: http://localhost:8081/
	@GetMapping("/")
	public String welcome() {
		return "Hello Everyone";
	}
	
	// Access URL: http://localhost:8081/home
	@GetMapping("/home")
	public String home() {
		return "Home Page";
	}
	
	// Access URL: http://localhost:8081/hello (Output: Hello King!!)
	// Access URL: http://localhost:8081/hello?name=Amy (Output: Hello Amy!!)
	@GetMapping("/hello")
	public String sayHello(@RequestParam(value="name", defaultValue = "King") String name) {
		return String.format("Hello %s!!", name);
	}
	
}
