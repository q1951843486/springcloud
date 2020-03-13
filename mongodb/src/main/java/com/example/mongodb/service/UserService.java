package com.example.mongodb.service;

import com.example.mongodb.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @ClassName UserService
 * @Author Administrator
 * @date 2019.12.12 14:13
 */
@Service
public class UserService {
    @Autowired
    public MongoTemplate mongoTemplate;


    public void save(User user){
        mongoTemplate.save(user);

    }
    public void insert(User user){
        mongoTemplate.insert(user);
    }


    public void update(User user){




    }

}
