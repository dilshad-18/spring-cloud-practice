package com.ac.customerservice2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CustomerService2Application {

	public static void main(String[] args) {
		SpringApplication.run(CustomerService2Application.class, args);
	}

}
