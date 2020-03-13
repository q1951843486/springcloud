package com.example.springcloudalipay;

import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@Hystrix
public class SpringcloudAlipayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudAlipayApplication.class, args);
    }

}
