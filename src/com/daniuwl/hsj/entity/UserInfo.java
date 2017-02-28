package com.daniuwl.hsj.entity;

import hsj.czy.mybatisframe.annotation.Table;

/**
 * 用户实体类 类UserInfo.java的实现描述：TODO 类实现描述
 * 
 * @author Administrator 2017年2月7日 下午3:44:19
 */
@Table
public class UserInfo extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String            userName;             // 用户名
    private String            password;             // 用户密码

    private String            mobile;               // 手机号
    private String            name;                 // 用户姓名

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
