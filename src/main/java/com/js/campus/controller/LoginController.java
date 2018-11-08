package com.js.campus.controller;

import com.js.campus.entity.request.LoginCondition;
import com.js.campus.entity.response.Response;
import com.js.campus.services.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "login")
@Api(tags = {"登陆"},description = "登陆验证")
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "",method = RequestMethod.POST)
    public Response<LoginCondition> login(@RequestBody LoginCondition loginCondition){
        return userService.login(loginCondition);
    }
}
