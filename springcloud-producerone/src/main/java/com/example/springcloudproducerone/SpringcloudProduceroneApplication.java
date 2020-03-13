package com.example.springcloudproducerone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudProduceroneApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudProduceroneApplication.class, args);
    }

}
