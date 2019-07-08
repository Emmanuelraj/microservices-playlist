/**
 * 
 */
package com.example.sleuthserver.controller;

import org.jboss.logging.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Emmanuel Raj
 * controls the web flow
 * This is spring-cloud-sleuth-server
 */
@RestController
@RequestMapping("/rest/hello")
public class HelloController 
{
	
	private static final Logger logger = Logger.getLogger(HelloController.class);
	
	@GetMapping(value="/server")
	public String hello()
	{
		logger.info("reached ");
		return "hello";
	}

}
