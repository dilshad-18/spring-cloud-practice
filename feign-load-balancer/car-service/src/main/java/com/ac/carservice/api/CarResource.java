package com.ac.carservice.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Slf4j
@RestController
public class CarResource {

    @Autowired
    private
    CustomerClient customerClient;

    @GetMapping(value = "/carDetail")
    public String getCarDetail() {

        List<String> carModels = Arrays.asList("Volvo S60","Volvo S90","Volvo X60","Volvo CrossCountry","Volvo XC90");

        Random random = new Random();

        int randomNumber = random.nextInt(carModels.size());

        String cardModel = carModels.get(randomNumber);

        log.info("{} car model is from car service", cardModel);

        return cardModel + " car is for customer - " + customerClient.getCustomer();
    }

    @FeignClient("customer-service")
    interface CustomerClient {
        @GetMapping(value = "/customer")
        String getCustomer();
    }
}
