package com.js.campus.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "register")
@Api(tags = {"注册"},description = "注册会员")
public class registerController {
}
