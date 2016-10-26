package com.boco.dao;

import com.boco.model.CourseInfo;
import com.boco.model.CourseUserInfo;
import com.boco.model.UserInfo;

import java.util.List;

public interface UserInfoMapper {
    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(UserInfo userInfo);

    List<CourseUserInfo> selectAll();
}