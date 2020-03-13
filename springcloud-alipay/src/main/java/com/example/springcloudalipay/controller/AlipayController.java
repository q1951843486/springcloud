package com.example.springcloudalipay.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @Description
 * @ClassName AlipayController
 * @Author Administrator
 * @date 2019.12.30 14:33
 */
@RestController
public class AlipayController {


    @RequestMapping(value = "/alipay")
    public String alipay(@RequestParam(value = "rechargeMoney") BigDecimal rechargeMoney, @RequestParam(value = "userId")String userId){







        return null;

    }





}
