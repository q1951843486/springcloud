package com.example.mongodb.service;

import com.example.mongodb.entity.Teacher;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description
 * @ClassName TeacherService
 * @Author Administrator
 * @date 2019.12.13 11:14
 */
@Service
public class TeacherService {

    @Resource
    private MongoTemplate mongoTemplate;

    public void insert(Teacher teacher){


        mongoTemplate.insert(teacher);
    }

    public void save(Teacher teacher){
        mongoTemplate.save(teacher);
    }

    public Teacher fillName(String name){
        Query query = new Query(Criteria.where("name").is("lisi"));
        Teacher teacher = mongoTemplate.findOne(query,Teacher.class);
        return teacher;
    }

    public void update(Teacher teacher){

        Query query = new Query(Criteria.where("name").is("lisi"));
        Update update = new Update().set("age",teacher.getAge());
        mongoTemplate.updateFirst(query,update,Teacher.class);


    }

    public void del(Teacher teacher){
        Query query= new Query(Criteria.where("id").is(teacher.getId()));
        mongoTemplate.remove(query,Teacher.class);
    }




}
