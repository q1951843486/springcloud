package com.example.springcloudmongodbprovider.service.impl;

import com.example.springcloudmongodbprovider.entity.Student;
import com.example.springcloudmongodbprovider.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @ClassName StudentService
 * @Author Administrator
 * @date 2019.12.12 14:46
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private MongoTemplate mongoTemplate;


    @Override
    public void insert(Student student) {
        mongoTemplate.insert(student);
    }
}
