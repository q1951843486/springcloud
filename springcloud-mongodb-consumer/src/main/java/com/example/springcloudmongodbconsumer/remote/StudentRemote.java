package com.example.springcloudmongodbconsumer.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description
 * @ClassName StudentRemote
 * @Author Administrator
 * @date 2019.12.12 15:06
 */
@FeignClient(name = "springcloud-mongodb-provider")
public interface StudentRemote {

    @RequestMapping(value = "/test")
    public void insert();

}
