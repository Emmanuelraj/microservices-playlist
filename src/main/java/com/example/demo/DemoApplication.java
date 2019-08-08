package com.example.demo;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws Exception {


         //created context
		CamelContext context = new DefaultCamelContext();
         //add Router
		context.addRoutes(new HelloRoute());
		//start context
		context.start();


		SpringApplication.run(DemoApplication.class, args);
	}





}
class HelloRoute extends RouteBuilder
{


	@Override
	public void configure() throws Exception

	{


		System.out.println("Hello World Route");
	}
}