package com.example.config.controller;

import com.example.config.modul.Modul;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description
 * @ClassName HelloController
 * @Author Administrator
 * @date 2019.12.26 14:12
 */
@RestController
public class HelloController {


    @Resource(name = "jdbcTemplateOne")
    public JdbcTemplate jdbcTemplateOne;

    @Resource(name = "jdbcTemplateTwo")
    public JdbcTemplate jdbcTemplateTwo;


    @RequestMapping(value = "/test1")
    public Modul add(){

        Modul modul = new Modul();
        modul.setName("lisi");
        String sql = new String("insert into name (name) values (?)");
        int i = jdbcTemplateOne.update(sql,new Object[]{modul.getName()});
        return modul;

    }
    @RequestMapping(value = "/test2")
    public Modul add2(){

        Modul modul = new Modul();
        modul.setName("zhangsan");
        String sql = new String("insert into name (name) values (?)");
        int i = jdbcTemplateTwo.update(sql,new Object[]{modul.getName()});
        return modul;

    }

    @RequestMapping(value = "/test3")
    public Modul query(){

        String sql = new String("select * from name where id = ?");
        RowMapper<Modul> rowMapper = new BeanPropertyRowMapper<Modul>(Modul.class);
        Modul modul =  jdbcTemplateOne.queryForObject(sql,rowMapper,1);
        return modul;


    }
    @RequestMapping(value = "test4")
    public List<Modul> queryList(){

        String sql = new String("select * from name");
        List<Modul> moduls = jdbcTemplateTwo.query(sql,new BeanPropertyRowMapper<>(Modul.class));
        return moduls;


    }

    @RequestMapping(value = "/test5")
    public Modul updata(){

        String sql = new String("update name set name = ? where id = ?");
        jdbcTemplateOne.update(sql,new Object[]{"zhangsan",1});
        return  null;

}


    @RequestMapping(value = "test6")
    public int del(){
        String sql = new String("delete from name where id = ?");
        return  jdbcTemplateOne.update(sql,1);

    }









}
