package com.daniuwl.hsj.dao.impl;

import hsj.czy.mybatisframe.service.impl.BaseDaoImpl;

import org.springframework.stereotype.Repository;

import com.daniuwl.hsj.dao.UserInfoDao;
import com.daniuwl.hsj.entity.UserInfo;

@Repository
public class UserInfoDaoImpl extends BaseDaoImpl<UserInfo, String> implements UserInfoDao {
}
