package com.example.mongodb.service;

import com.example.mongodb.entity.Student;
import com.mongodb.client.result.UpdateResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @ClassName StudentService
 * @Author Administrator
 * @date 2019.12.12 15:24
 */
@Service
public class StudentService {


    @Autowired
    private MongoTemplate mongoTemplate;

    public Student insert(Student student) {

        return mongoTemplate.insert(student);

    }


    public Student save(Student student){
        return mongoTemplate.save(student);
    }


    public Student update(Student student) {

        Query query = new Query(Criteria.where("-id").is(student.getId()));
        Update update = new Update().set("name",student.getName());
        mongoTemplate.updateFirst(query, update, Student.class);


        return student;

    }

    public void del(Student student) {

        mongoTemplate.remove(student);


    }

    public List<Student> fillall(){
        return mongoTemplate.findAll(Student.class);
    }
}
