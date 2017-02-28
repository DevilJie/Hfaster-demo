package com.daniuwl.hsj.service;

import hsj.czy.mybatisframe.exception.MyBatistFrameServiceException;
import hsj.czy.mybatisframe.service.BaseService;

import com.daniuwl.hsj.entity.UserInfo;

public interface UserInfoService extends BaseService<UserInfo, String> {

    public UserInfo login(String userName, String password) throws MyBatistFrameServiceException;
}
