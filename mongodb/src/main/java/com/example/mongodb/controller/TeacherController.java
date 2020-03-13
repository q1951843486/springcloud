package com.example.mongodb.controller;

import com.example.mongodb.entity.Teacher;
import com.example.mongodb.service.TeacherService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description
 * @ClassName TeacherController
 * @Author Administrator
 * @date 2019.12.13 11:25
 */
@RestController
public class TeacherController {

    @Resource
    private TeacherService teacherService;


    @RequestMapping(value = "test1")
    public void insert(){
        Teacher teacher = new Teacher();
        teacher.setId(1);
        teacher.setAge(11);
        teacher.setName("lisi");

        teacherService.insert(teacher);

    }


    @RequestMapping(value = "test2")
    public void save(){

        Teacher teacher = new Teacher();
        teacher.setId(2);
        teacher.setAge(22);
        teacher.setName("zhangsan");

        teacherService.insert(teacher);

    }


    @RequestMapping(value = "test3")
    public Teacher fillOne(){

        return teacherService.fillName("lisi");

    }
    @RequestMapping(value = "test4")
    public void update(){

        Teacher teacher = new Teacher();
        teacher.setId(1);
        teacher.setName("wangwu");
        teacher.setAge(33);

        teacherService.update(teacher);

    }


    @RequestMapping(value = "test5")
    public void del(){
        Teacher teacher = new Teacher();
        teacher.setId(1);
        teacher.setName("wangwu");
        teacher.setAge(33);

        teacherService.del(teacher);



    }


}
