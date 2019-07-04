package com.example.springbooteureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 *
 * @author Emmanuel Raj
 *  Eureka normally used for 
 *  eureka-service - The Eureka service which is the Service Registry
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringBootEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEurekaApplication.class, args);
	}

}
