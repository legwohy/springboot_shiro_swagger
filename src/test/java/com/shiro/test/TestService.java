package com.shiro.test;

import com.shiro.entirty.Resource;
import com.shiro.entirty.Role;
import com.shiro.entirty.User;
import com.shiro.service.ResourceService;
import com.shiro.service.RoleService;
import com.shiro.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * 测试shiro
 */
@RunWith(SpringRunner.class)
@SpringBootTest()
public class TestService {
    @Autowired private UserService userService;
    @Autowired private RoleService roleService;
    @Autowired private ResourceService resourceService;


    @Test public void testRoleService(){
        User user = new User();
        user.setId(1);
        List<Role> roles = roleService.findRolesByUser(user);
        for (Role role:roles){
            System.out.println(role);
        }
    }


    @Test public void testResourceService(){
        Role role = new Role();
        List<Resource> resources = resourceService.findResourcesByRole(role);
        for (Resource res:resources){
            System.out.println(res);
        }
    }


}
