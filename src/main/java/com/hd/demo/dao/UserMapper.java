package com.hd.demo.dao;

import com.hd.demo.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface UserMapper {
    List<User> findAll();
    List<Map> findUser();
    List<Map> findByCode(Map params);
}
