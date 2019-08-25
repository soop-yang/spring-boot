package com.hd.demo.Controller;

import com.hd.demo.entity.User;
import com.hd.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/")
public class UserComtroller {
    @Autowired
    private UserService userService;
    @RequestMapping("findAll")
    public List<User> findAll()
    {
        return userService.findAll();
    }
    @RequestMapping("findByCode")
    public ModelAndView findByCode()
    {
        return null;
    }
}
