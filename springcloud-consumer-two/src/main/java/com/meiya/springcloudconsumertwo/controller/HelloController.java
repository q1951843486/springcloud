package com.meiya.springcloudconsumertwo.controller;

import com.meiya.springcloudconsumertwo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @ClassName HelloController
 * @Author yw
 * @date 2019.12.03 11:30
 */
@RestController
public class HelloController {
    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/get")
    public String get(){
       return helloService.helle();
    }


}
