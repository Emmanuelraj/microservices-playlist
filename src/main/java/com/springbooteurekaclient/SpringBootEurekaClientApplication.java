package com.springbooteurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
/**
 * 
 * @author Emmanuel Raj
 * @EnableEurekaClient usage in spring boot act as eureka client
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class SpringBootEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEurekaClientApplication.class, args);
	}
	
	
	
	

}
