package com.example.springcloudconsumerone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description
 * @ClassName DisController
 * @Author Administrator
 * @date 2019.12.25 14:14
 */
@Controller
public class DisController {


    @Autowired
    private DiscoveryClient discoveryClient;


    @RequestMapping(value = "/test")
    @ResponseBody
    public Map test(){

        Map<String, List<ServiceInstance>> map = new HashMap<>(16);
        List<String> list = discoveryClient.getServices();
        for (String s : list){


            List<ServiceInstance> serviceInstances = discoveryClient.getInstances(s);
            map.put(s,serviceInstances);
        }
        return map;



    }


}
