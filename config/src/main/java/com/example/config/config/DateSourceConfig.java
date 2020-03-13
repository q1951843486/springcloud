package com.example.config.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @Description
 * @ClassName DateSourceConfig
 * @Author Administrator
 * @date 2019.12.25 17:52
 */
@Configuration
public class DateSourceConfig {
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.one")
    public DataSource dataSourceOne(){

        return DruidDataSourceBuilder.create().build();


    }
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.two")
    public DataSource dataSourceTwo(){

        return DruidDataSourceBuilder.create().build();


    }






}
