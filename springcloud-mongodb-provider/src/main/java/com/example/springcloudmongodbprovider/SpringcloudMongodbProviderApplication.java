package com.example.springcloudmongodbprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudMongodbProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudMongodbProviderApplication.class, args);
    }

}
