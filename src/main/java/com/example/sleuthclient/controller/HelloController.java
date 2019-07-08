/**
 * 
 */
package com.example.sleuthclient.controller;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Emmanuel Raj
 * controls the web flow
 */
@RestController
@RequestMapping("/rest/hello")
public class HelloController 
{
	
	@Autowired
	private RestTemplate restTemplate;
	
	//logger
	private static final Logger logger = Logger.getLogger(HelloController.class);
	
	@GetMapping("/client")
	public String hello()
	{
		logger.info("Before Calling the server");
		
		String response =restTemplate.getForObject("http://localhost:8081/rest/hello/server", String.class);

		logger.info("After Calling the server");

		return response;
	}

}
