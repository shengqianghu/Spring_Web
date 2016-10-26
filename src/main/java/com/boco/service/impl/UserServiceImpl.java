package com.boco.service.impl;

import com.boco.dao.UserInfoMapper;
import com.boco.model.CourseUserInfo;
import com.boco.model.UserInfo;
import com.boco.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/10/9.
 */
@Service("userService")
public class UserServiceImpl implements UserService{
    @Autowired
    private UserInfoMapper  userInfoMapper;

    public UserInfo getUserById(UserInfo userInfo) {
        return userInfoMapper.selectByPrimaryKey(userInfo);
    }

    public List<CourseUserInfo> getUsers() {
        return userInfoMapper.selectAll();
    }

    public int insert(UserInfo userInfo) {
        int result = userInfoMapper.insert(userInfo);
        System.out.println(result);
        return result;
    }
}
