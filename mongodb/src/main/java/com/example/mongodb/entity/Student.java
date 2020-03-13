package com.example.mongodb.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * @Description
 * @ClassName Student
 * @Author Administrator
 * @date 2019.12.12 14:34
 */
@Data
@Document(collation = "student")
public class Student {

    @Id
    private String id;

    private String studentId;
    private String name;
    private int age;
    private String address;
    private String classId;

    private Date createTime;
    private Date updateTime;



}
