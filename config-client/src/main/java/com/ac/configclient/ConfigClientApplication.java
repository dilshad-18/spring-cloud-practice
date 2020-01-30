package com.ac.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}

}

@RefreshScope
@RestController
class MessageController{

	@Value("${welcome.message}")
	private String welcomeMessage;

	@Value("${customer.name}")
	private String customerName;

	@Value("${car.name}")
	private String carName;

	@GetMapping(value = "/")
	public String getMessage(){
		return welcomeMessage ;
	}

	@GetMapping(value = "/customer")
	public String getCustomerName(){
		return customerName ;
	}

	@GetMapping(value = "/car")
	public String getCarName(){
		return carName ;
	}

}
