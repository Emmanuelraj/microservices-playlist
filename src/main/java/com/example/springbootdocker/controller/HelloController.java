/**
 * 
 */
package com.example.springbootdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Trident MT581
 *
 */
@RestController
public class HelloController 
{
	
	
	@GetMapping("/greet")
    public String helloGet()
    {
    	return "Hello Docker Spring Boot";
    }
	
	
}
