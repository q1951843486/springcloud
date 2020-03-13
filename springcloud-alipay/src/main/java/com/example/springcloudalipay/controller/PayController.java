package com.example.springcloudalipay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description
 * @ClassName PayController
 * @Author Administrator
 * @date 2019.12.30 16:45
 */
@Controller
public class PayController {


    @RequestMapping(value = "/doAlipay")
    public String doAlipay() {


        return "/alipay";


    }

}
