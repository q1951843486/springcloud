package com.meiya.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @ClassName UserController
 * @Author yw
 * @date 2019.12.03 13:42
 */
@RestController
public class UserController {

    @RequestMapping(value = "/hello")
    public String hello(){
        return "hello spring cloud";
    }
}
