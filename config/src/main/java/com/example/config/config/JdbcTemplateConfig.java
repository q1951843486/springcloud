package com.example.config.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * @Description
 * @ClassName JdbcTemplateConfig
 * @Author Administrator
 * @date 2019.12.26 14:05
 */
@Configuration
public class JdbcTemplateConfig {


    @Bean
    public JdbcTemplate jdbcTemplateOne(@Qualifier("dataSourceOne")DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }

    @Bean
    public JdbcTemplate jdbcTemplateTwo(@Qualifier("dataSourceTwo") DataSource dataSource){

        return new JdbcTemplate(dataSource);

    }



}
