package com.example.demo;
import com.example.demo.common.MyPage;
import com.example.demo.vip.User;
import com.example.demo.vip.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureDataJpa;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
@AutoConfigureDataJpa
@TestPropertySource(locations = "classpath:application.properties")
public class UserTest {

    @Resource
    private UserService userService;

    @Test
    public void addTest() {
        User user = new User();
        user.setUserMapId(1004L);
        user.setUserName("王子");
        user.setUserSex(0L);
        user.setUserEmail("2056910111@qq.com");
        userService.add(user);
    }

    @Test
    public void queryTest() {
        MyPage<User> page = new MyPage<>();
        Page<User> query = userService.query(page);
        System.out.println(query);
    }
}
