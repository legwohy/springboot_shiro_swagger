package com.swagger.test;

import com.swagger.entirty.UserInfoFrom;
import com.swagger.service.UserInfoFromService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * 测试通用mapper 本工程共有两个项目 测试的结构需与源码结构一致
 * springBoot 扫描bean默认是从Application类位置开始往下扫描
 */
@RunWith(SpringRunner.class)
@SpringBootTest()
public class TestUserInfoFromService {
    @Autowired private UserInfoFromService userInfoFromService;

    @Test public void test1(){
        UserInfoFrom userInfoFrom = userInfoFromService.findUserInfoFromByPrimaryKey(1);
        System.out.println("测试:"+userInfoFrom.toString());

    }

}
