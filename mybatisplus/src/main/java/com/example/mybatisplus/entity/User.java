package com.example.mybatisplus.entity;

import lombok.Data;

/**
 * @Description
 * @ClassName User
 * @Author Administrator
 * @date 2020.01.17 14:29
 */
@Data
public class User {

    private Long id;
    private String name;
    private Integer age;
    private String email;

}
