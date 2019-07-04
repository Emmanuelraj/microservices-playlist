/**
 * 
 */
package com.springbooteurekaclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Emmanuel Raj
 * 
 * you have to run @EnableEurekaServer then run this else you will get error
 *
 */
@RestController
public class EurekaClientController {

	
	 @GetMapping(value = "/eurekaclient/1")
	   public String home() {
	      return "Eureka Client application";
	   }
	 
	 
	 @GetMapping(value = "/eurekaclient/2")
	   public String home2() {
	      return "Eureka Client application 2";
	   }
}
