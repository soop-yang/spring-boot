package com.hd.demo.service;

import com.hd.demo.entity.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    public List<User> findAll();
    public List<Map> findUser();
    public List<Map> findByCode(Map params);
}
