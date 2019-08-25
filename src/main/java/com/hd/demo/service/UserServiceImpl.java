package com.hd.demo.service;

import com.hd.demo.dao.UserMapper;
import com.hd.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public List<Map> findUser() {
        return userMapper.findUser();
    } 

    @Override
    public List<Map> findByCode(Map params) {
       /* Map paramsMap=new HashMap();
        paramsMap.put("secondCode",111);
        paramsMap.put("codeDesc",2);*/
        return userMapper.findByCode(params);
    }
}
