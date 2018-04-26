package com.shiro.test;

import com.shiro.entirty.BackUser;
import com.shiro.service.BackUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 测试shiro
 */
@RunWith(SpringRunner.class)
@SpringBootTest()
public class SpringBootShiro {
    @Autowired private BackUserService userService;
    @Test public void test1(){
        BackUser user = userService.findUserByPrimaryKey(1);
        System.out.println("测试:"+user);
    }


}
