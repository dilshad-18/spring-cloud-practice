package com.ac.ribbonloadbalancer.api;

import com.ac.ribbonloadbalancer.config.CountryServiceConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
@RibbonClient(name = "country-service", configuration = CountryServiceConfiguration.class)
public class RibbonLoadBalancerResource {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/getMostVisitedCountry")
    public String getMostVisitedCountry() {
        log.info("Started ribbon demo service");

        String visitedCountry = restTemplate.getForObject("http://country-service/visitedCountry", String.class);
        return visitedCountry;
    }
}
