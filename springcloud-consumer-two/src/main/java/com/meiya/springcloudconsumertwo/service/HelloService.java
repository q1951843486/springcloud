package com.meiya.springcloudconsumertwo.service;

import com.meiya.springcloudconsumertwo.hystrix.HelloHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description
 * @ClassName HelloService
 * @Author yw
 * @date 2019.12.03 11:31
 */
@FeignClient(name = "provider",fallback = HelloHystrix.class)
public interface HelloService {

    @RequestMapping(value = "/hello")
    public String helle();
}
