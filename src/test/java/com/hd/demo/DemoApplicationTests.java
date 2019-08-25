package com.hd.demo;

import com.hd.demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    private UserService userService;

    @Test
    public void contextLoads() {
        List<Map> mapList = userService.findUser();
        Object name = mapList.get(0).get("name");
        System.out.println(name);

    }

}
