package com.swagger.controller;

import com.swagger.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * springBoot整合swagger
 */
@RestController
@RequestMapping("/user")
@Api(value = "我的swagger",description = "springboot整合swagger")
public class SwaggerController {
    //@Autowired
    private UserService userService;

    @ApiOperation(value="获取用户列表", notes="获取用户列表")
    @GetMapping("/getList")
    public List<HashMap<String,Object>> getUserList() {
        List<HashMap<String,Object>> r = userService.getList1();
        return r;
    }


    @ApiOperation(value="获取用户详细信息", notes="根据url的id来获取用户详细信息")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Integer")
    @GetMapping("/{id}")
    public HashMap<String,Object> getUser(@PathVariable String id) {
        HashMap<String,Object> map = new HashMap<String, Object>();
        map.put("id",id);
        return userService.findUserByIdH(map);
    }


}
