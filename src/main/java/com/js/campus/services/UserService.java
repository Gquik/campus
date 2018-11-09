package com.js.campus.services;

import com.js.campus.dao.UserMapper;
import com.js.campus.entity.User;
import com.js.campus.entity.request.LoginCondition;
import com.js.campus.entity.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public Response<LoginCondition> login(LoginCondition loginCondition){
        Response response = new Response();
        User user = userMapper.selectByLoginName(loginCondition.getLoginName());
        if (user!=null && user.getPassword().equals(loginCondition.getPassword())){
            response.setCode("0");
            response.setData(user);
        } else {
            response.setCode("1");
            response.setMessage("用户名或密码错误！");
        }
        return response;
    }
}
