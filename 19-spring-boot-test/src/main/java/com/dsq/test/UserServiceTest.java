package com.dsq.test;

import com.dsq.Application;
import com.dsq.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {Application.class})//表示当前类为springboot的测试类；加载springboot启动类，启动springboot
public class UserServiceTest {
    @Autowired
    private UserService userService;
    @Test
    public void testAddUser(){
     this.userService.addUser();
    }
}
