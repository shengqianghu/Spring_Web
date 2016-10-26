package com.boco.service;

import com.alibaba.fastjson.JSON;
import com.boco.model.CourseUserInfo;
import com.boco.model.UserInfo;
import com.boco.service.UserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Administrator on 2016/10/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml",
        "classpath:spring-mybatis.xml" })
public class TestUserService {

    private static final Logger LOGGER = Logger
            .getLogger(TestUserService.class);

    @Autowired
    private UserService userService;


    @Test
    public void testQueryById1() {
        UserInfo userInfo = userService.getUserById(new UserInfo(new BigDecimal(1)));
        LOGGER.info(JSON.toJSON(userInfo));
    }

    @Test
    public void testQueryAll() {
        List<CourseUserInfo> userInfos = userService.getUsers();
        LOGGER.info(JSON.toJSON(userInfos));
    }


    @Test
    public void testInsert() {
        UserInfo userInfo = new UserInfo();
        userInfo.setUname("xiaoliang");
        userInfo.setAge(new BigDecimal(4));
        int result = userService.insert(userInfo);
        System.out.println(result);
    }
}
