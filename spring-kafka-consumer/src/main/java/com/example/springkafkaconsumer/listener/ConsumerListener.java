package com.example.springkafkaconsumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @ClassName ConsumerListener
 * @Author Administrator
 * @date 2019.12.19 16:45
 */
@Component
public class ConsumerListener {



    @KafkaListener(topics = "test1")
    public void message(String name){


        System.out.println(name);
    }
}
