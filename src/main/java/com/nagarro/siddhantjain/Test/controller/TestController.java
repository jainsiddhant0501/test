package com.nagarro.siddhantjain.Test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/test")
	public String test() {
		
		return "This is a test API";
	}
	
	@GetMapping("/test2")
	public String test2() {
		
		return "This is a test2 API";
	}

	@GetMapping("/user")
	public String user() {
		
		return "This is a dummy user with id 101";
	}
}
