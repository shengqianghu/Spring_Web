package com.boco.service;

import com.boco.model.CourseUserInfo;
import com.boco.model.UserInfo;

import java.util.List;

/**
 * Created by Administrator on 2016/10/9.
 */
public interface UserService {
    UserInfo getUserById(UserInfo userinfo);

    List<CourseUserInfo> getUsers();

    int insert(UserInfo userInfo);
}
