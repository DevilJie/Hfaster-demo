package com.daniuwl.hsj.service.impl;

import hsj.czy.mybatisframe.exception.MyBatistFrameServiceException;
import hsj.czy.mybatisframe.service.impl.BaseServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daniuwl.hsj.dao.UserInfoDao;
import com.daniuwl.hsj.entity.UserInfo;
import com.daniuwl.hsj.service.UserInfoService;

@Service
public class UserInfoServiceImpl extends BaseServiceImpl<UserInfo, String> implements UserInfoService {

    // 除了最基本的增删改查业务逻辑，也可以根据自己需要，进行扩展
    // 例如：用户登录,用户登录需要接收用户名以及密码参数，
    // 然后根据根据入参来判断当前登录信息是否可用

    @Autowired
    public void setBaseDao(UserInfoDao baseDao) {
        // TODO Auto-generated method stub
        super.setBaseDao(baseDao);
    }

    @Override
    public UserInfo login(String userName, String password) throws MyBatistFrameServiceException {
        // 首先根据用户名获取用户信息
        UserInfo u = ((UserInfoDao) baseDao).findByColumn("userName", userName);
        if (u == null) throw new MyBatistFrameServiceException("用户不存在"); // 如果用户不存在，上抛异常处理
        if (u.getPassword().equals(password)) {
            return u;
        } else {
            throw new MyBatistFrameServiceException("用户名密码错误"); // 如果用户密码错误，上抛异常处理
        }
    }
}
