package com.example.mongodb.controller;

import com.example.mongodb.entity.Student;
import com.example.mongodb.entity.User;
import com.example.mongodb.service.StudentService;
import com.example.mongodb.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @Description
 * @ClassName UserController
 * @Author Administrator
 * @date 2019.12.12 14:02
 */

public class UserController {

    @Autowired
    private UserService userService;


    @Autowired
    private MongoTemplate mongoTemplate;

    @Resource
    private StudentService studentService;

    @RequestMapping(value = "/test")
    public void test(){

        User user = new User();
        user.setName("lisi");
        user.setAge(11);
        user.setPassword("1111");
        user.setAddress("beijing");
        user.setSex("men");
        userService.insert(user);

    }



    @RequestMapping(value = "/test2")
    public Student insert(){
        Student student = new Student();
        student.setId("2");
        student.setName("lisi");
        student.setCreateTime(new Date());
        student =studentService.insert(student);
        return student;

    }



    @RequestMapping(value = "/test3")
    public void save(){
        Student student = new Student();
        student.setId("2");
        student.setName("zhangsan");
        studentService.save(student);
        System.out.println(student);

    }
    @RequestMapping(value = "/test4")
    public void update(){
        Student student = new Student();
        student.setId("2");
        student.setName("zhangsan1");
        studentService.update(student);


    }
    @RequestMapping(value = "/test5")
    public void del(){
        Student student = new Student();
        student.setId("2");
        student.setName("zhangsan");
        studentService.del(student);
        System.out.println(student);

    }


    @RequestMapping(value = "/test6")
    public List<Student> fillAll(){
        return studentService.fillall();
    }









}
