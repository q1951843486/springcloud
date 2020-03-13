package com.example.springcloudmongodbprovider.controller;

import com.example.springcloudmongodbprovider.entity.Student;
import com.example.springcloudmongodbprovider.service.StudentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description
 * @ClassName StudnetController
 * @Author Administrator
 * @date 2019.12.12 14:37
 */
@RestController
public class StudnetController {

    @Resource
    private StudentService studentService;

    @RequestMapping(value = "/test")
    public void insert(){


        Student student = new Student();
        student.setName("lisi");
        student.setAge(11);
        student.setAddress("beijing");
        student.setClassId("1");
        student.setStudentId("1");
        student.setId("1");



        studentService.insert(student);



    }

}
