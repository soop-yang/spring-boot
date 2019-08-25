package com.hd.demo;

import com.hd.demo.dao.UserMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {
    @Autowired
    SqlSessionFactory sqlSessionFactory=null;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
    @Bean
    public MapperFactoryBean<UserMapper> initMybatisDao(){
        MapperFactoryBean<UserMapper> bean=new MapperFactoryBean<>();
         bean.setMapperInterface(UserMapper.class);
        bean.setSqlSessionFactory(sqlSessionFactory);
        return bean;
    }

}
