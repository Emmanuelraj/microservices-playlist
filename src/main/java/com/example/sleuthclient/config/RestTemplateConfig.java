/**
 * 
 */
package com.example.sleuthclient.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Emmanuel raj
 *  xml bean config  == @Configuration
 */
@Configuration
public class RestTemplateConfig 
{
	/**
	 * 
	 * @return RestTemplate
	 *  Rest Template is used to create applications that consume RESTful Web Services.
	 *  You can use the exchange() method to consume the web services for all HTTP methods.
	 */
   @Bean
   public RestTemplate restTemplate()
   {
	   return new RestTemplate();
   }
   
}
