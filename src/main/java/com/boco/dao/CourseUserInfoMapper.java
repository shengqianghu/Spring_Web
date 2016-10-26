package com.boco.dao;

import com.boco.model.CourseUserInfo;

public interface CourseUserInfoMapper {
    int insert(CourseUserInfo record);

    int insertSelective(CourseUserInfo record);
}