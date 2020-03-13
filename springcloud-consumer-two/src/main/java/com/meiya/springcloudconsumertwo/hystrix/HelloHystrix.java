package com.meiya.springcloudconsumertwo.hystrix;

import com.meiya.springcloudconsumertwo.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @ClassName HelloHystrix
 * @Author yw
 * @date 2019.12.03 14:15
 */
@Component
public class HelloHystrix implements HelloService {
    @Override
    public String helle() {
        return "hello spring cloud hystrix";
    }
}
