package com.macro.mall.tiny.controller;

import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.mbg.model.User;
import com.macro.mall.tiny.service.UserService;
import com.sun.corba.se.spi.presentation.rmi.IDLNameTranslator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Api(tags = "UserController", description = "用户管理")
@RequestMapping("/sso2")
public class UserController {
    @Autowired
    private UserService userService;
    @ApiOperation("获取用户信息")
    @RequestMapping(value = "/getAuthCode1", method = RequestMethod.POST)
    @ResponseBody
    public User selectUser(@RequestParam Integer id) {
        return userService.selectAll(id);
    }
//    @ApiOperation("添加用户信息")
//    @RequestMapping(value = "/getAuthCode1", method = RequestMethod.POST)
//    @ResponseBody
//    public User insertUser(@RequestParam Integer id) {
//        return userService.insertUser(id);
//    }

}
