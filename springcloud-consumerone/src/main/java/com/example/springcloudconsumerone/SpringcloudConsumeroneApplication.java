package com.example.springcloudconsumerone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudConsumeroneApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConsumeroneApplication.class, args);
    }

}
