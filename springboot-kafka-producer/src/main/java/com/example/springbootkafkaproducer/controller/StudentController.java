package com.example.springbootkafkaproducer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description
 * @ClassName StudentController
 * @Author Administrator
 * @date 2019.12.19 16:39
 */
@RestController
public class StudentController {

    @Resource
    private KafkaTemplate<String,Object> kafkaTemplate;

    @RequestMapping(value = "/test")
    public void  test(){

        String name = "lisi";
        kafkaTemplate.send("test1",name);



    }


}
