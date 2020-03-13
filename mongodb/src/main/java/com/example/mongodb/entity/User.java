package com.example.mongodb.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @Description
 * @ClassName User
 * @Author Administrator
 * @date 2019.12.12 14:00
 */
@Data
@Document(collation = "user")
public class User {

    @Id
    private String id;
    private String name;
    private String sex;
    private int age;
    private String address;
    private String password;
}
