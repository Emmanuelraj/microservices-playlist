package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringIntegrationController
{

	
	@GetMapping("/hi")
	public String hi()
	{
		return "hi";
		
	}
	
	
	
}
