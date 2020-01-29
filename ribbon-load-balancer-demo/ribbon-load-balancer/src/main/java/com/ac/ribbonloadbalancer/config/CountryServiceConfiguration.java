package com.ac.ribbonloadbalancer.config;

import com.netflix.loadbalancer.BestAvailableRule;
import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.PingUrl;
import org.springframework.context.annotation.Bean;

public class CountryServiceConfiguration {

    @Bean
    public IPing ribbonPing() {
        return new PingUrl();
    }

    public IRule ribbonRule() {
        return new BestAvailableRule();
    }
}
