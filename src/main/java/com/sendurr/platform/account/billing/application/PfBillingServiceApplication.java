package com.sendurr.platform.account.billing.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan(basePackages = {"com.sendurr.platform.*"})
public class PfBillingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PfBillingServiceApplication.class, args);
    }

}
