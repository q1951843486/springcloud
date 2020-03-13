package com.example.springcloudmongodbconsumer.controller;

import com.example.springcloudmongodbconsumer.remote.StudentRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @ClassName StudentController
 * @Author Administrator
 * @date 2019.12.12 15:04
 */
@RestController
public class StudentController {
    @Autowired
    private StudentRemote studentRemote;


    @RequestMapping(value = "/test1")
    public void insert(){


        studentRemote.insert();
    }
}
