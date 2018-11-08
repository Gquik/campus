package com.js.campus.entity.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class LoginCondition extends CommonCondition{
    private static final long serialVersionUID = -1069241470517054602L;
    @ApiModelProperty(value ="登陆账号")
    private String loginName;

    @ApiModelProperty(value ="登陆密码")
    private String password;

    @ApiModelProperty(value = "系统号")
    private Integer sysId;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getSysId() {
        return sysId;
    }

    public void setSysId(Integer sysId) {
        this.sysId = sysId;
    }
}
