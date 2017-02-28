package com.daniuwl.hsj.service;

import hsj.czy.mybatisframe.exception.MyBatistFrameServiceException;
import hsj.czy.mybatisframe.service.BaseService;

import com.daniuwl.hsj.entity.UserInfo;

public interface UserInfoService extends BaseService<UserInfo, String> {

    /**
     * 登录方法
     * 
     * @param userName 用户名
     * @param password 密码
     * @return
     * @throws MyBatistFrameServiceException
     */
    public UserInfo login(String userName, String password) throws MyBatistFrameServiceException;
}
