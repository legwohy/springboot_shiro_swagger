package com.shiro.controller;

import com.shiro.entirty.Resource;
import com.shiro.entirty.User;
import com.shiro.service.ResourceService;
import com.shiro.service.UserService;
import org.apache.shiro.authz.Permission;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 *
 */
@Controller
public class IndexController {
    @Autowired private ResourceService resourceService;
    @Autowired private UserService userService;

    /**
     * 表单验证成功后，此url将会作为进入主页的入口
     * @param model
     * @return
     */
    @RequestMapping("/hi")
    @RequiresAuthentication// 已经验证登录
    public String index(Model model, HttpServletRequest request) {
        User user = request.getSession() != null?(User)request.getSession().getAttribute("user"):null;
        HashMap<String,Object> params = new HashMap<>();
        params.put("userId",user.getId());
        params.put("parentId",0);
        List<Resource> permissions = resourceService.findResourcesByUser(params);
        model.addAttribute("menus", permissions);
        System.out.println("index登陆:"+new Date());
        return "ins";
    }

    @RequestMapping("/welcome")
    public String welcome() {
        return "welcome";
    }


}
