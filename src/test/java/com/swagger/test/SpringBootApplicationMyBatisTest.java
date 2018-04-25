package com.swagger.test;

import com.swagger.dao.UserDao;
import com.swagger.entirty.User;
import com.swagger.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.text.ParseException;
import java.util.HashMap;
import java.util.List;

/**
 * 测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest()
public class SpringBootApplicationMyBatisTest {

    @Autowired private UserDao userDao;
    @Autowired private UserService userService;

    @Test public void query(){
        List<HashMap<String,Object>> mapList = userDao.findUserH();
        System.out.println("测试:"+mapList.size());
    }

    @Test public void query2(){
       User user = userService.findUserById(1001);
        User user1 = userService.findUserByPhone("85409678233");
       System.out.println("测试:"+user1);
    }

    /**
     * 测试注册用户
     */
    @Test public void register() throws ParseException {
        User user = new User();

        user.setUsername("gtl");
        user.setRealname("乐天");
        user.setUserPhone("85212345678");
        user.setGender("male");
        user.setBirthday("1993-10-10");
        user.setAddress("HongKong");
        user.setPassword("movie is my whole life");

       boolean flag = userService.insertUser(user);
        Assert.assertTrue(flag);
    }

    @Test public void queryAll(){
        List<User> users = userService.findUsers();
        System.out.println("测试:"+users.size());
    }

    @Test public void delete(){
        boolean flag = userService.deleteUser(1001);
        Assert.assertTrue(flag);
    }

}
