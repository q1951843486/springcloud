package com.example.springkafkaconsumer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description
 * @ClassName KafkaConfig
 * @Author Administrator
 * @date 2019.12.19 16:58
 */

public class KafkaConfig {



    public NewTopic newTopic(){

        return new NewTopic("test",8, (short) 1);

    }

}
