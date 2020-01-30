package com.ac.customerservice1.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Slf4j
@RestController
public class CustomerResource {

    @GetMapping(value = "/customer")
    public String getCustomer() {

        List<String> customers = Arrays.asList("Dilshad","Shahzad","Shaqlain","Ashish","Abhishek","Siva","Neyaz");

        Random random = new Random();

        int randomNumber = random.nextInt(customers.size());

        String customer = customers.get(randomNumber);
        log.info("customer-service has returned customer as- {}", customer);

        return customer;
    }
}
