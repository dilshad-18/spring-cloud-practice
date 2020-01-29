package com.ac.countryservice.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Slf4j
@RestController
public class CountryResource {

    @GetMapping(value = "/visitedCountry")
    public String getVisitedCountryName() {

        log.info("country-service has got called");
        List<String> countries = Arrays.asList("India", "Germany", "Denmark","Finland", "Spain", "Norway", "Holland");

        Random random = new Random();

        int randomNumber = random.nextInt(countries.size());

        return countries.get(randomNumber);

    }
}
