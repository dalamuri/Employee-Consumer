package com.loadribbon;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClientException;

import com.loadribbon.controllers.ConsumerClient;

@SpringBootApplication
public class SpringbootHelloWorldApplication {


		public static void main(String[] args) throws RestClientException, IOException {
			ApplicationContext ctx = SpringApplication.run(
					SpringbootHelloWorldApplication.class, args);
			
			ConsumerClient consumerControllerClient=ctx.getBean(ConsumerClient.class);
			
			System.out.println(consumerControllerClient);
			consumerControllerClient.getEmployee();
			
		}
		
		@Bean
		public  ConsumerClient  consumerControllerClient()
		{
			return  new ConsumerClient();
		}

	}


