package com.boco.dao;

import com.boco.model.CourseInfo;

public interface CourseInfoMapper {
    int insert(CourseInfo record);

    int insertSelective(CourseInfo record);
}