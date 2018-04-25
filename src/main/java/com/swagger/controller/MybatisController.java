package com.swagger.controller;


import com.swagger.dao.UserInfoFromDAO;
import com.swagger.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.List;

/**
 * 用户控制器
 * springBoot 连接jdbcTemplate数据库
 */
@RestController
@RequestMapping("/user")
@Api(value = "springboot 访问数据库",description = "使用jdbcTemplate并整合mybatis")
public class MybatisController {
    //@Autowired
    private UserService userService;
    //@Autowired
    private UserInfoFromDAO userDao;

    /**
     * jdbcTemplate 访问数据库
     * @return RestController 返回json
     */
    @GetMapping("/list")
    @ApiOperation(value = "jdbcTemplate",notes = "使用jdbcTemplate获取用户列表")
    public List<HashMap<String,Object>> getUsers(){
        System.out.println("调用了");
        return userService.getList1();
    }

    /**
     * mybatis
     * @return 返回json
     */
   /* @PostMapping("/infos")
    @ApiOperation(value = "mybatis",notes = "mybatis获取用户信息列表")
    public List<HashMap<String,Object>> getUserInfos(){
        System.out.println("infos调用了");
        return userDao.findUserInfo();
    }*/



}
