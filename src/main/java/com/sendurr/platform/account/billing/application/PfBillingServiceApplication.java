package com.sendurr.platform.account.billing.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@Configuration
@ComponentScan(basePackages = {"com.sendurr.platform.*"})
public class PfBillingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PfBillingServiceApplication.class, args);
    }

    @Bean
    public RestTemplate setUpDefaultRestTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate;
    }
}
