package com.test;

import com.test.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class Tests {

    @Autowired
    UserService userService;

    @Test
    public void test() {
        userService.test();
    }

}
