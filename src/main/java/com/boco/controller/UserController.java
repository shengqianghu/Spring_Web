package com.boco.controller;

import com.boco.model.CourseUserInfo;
import com.boco.model.UserInfo;
import com.boco.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Administrator on 2016/10/11.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/showInfo/{userId}")
    public String showUserInfo(ModelMap modelMap, @PathVariable int userId){
        UserInfo userInfo = userService.getUserById(new UserInfo(new BigDecimal(userId)));
        modelMap.addAttribute("userInfo", userInfo);
        System.out.println(userInfo.getUname());
        System.out.println("I am here!");
        return "/user/showInfo";
    }

    @RequestMapping("/showInfos")
    public @ResponseBody Object showUserInfos(){
        List<CourseUserInfo> userInfos = userService.getUsers();
        return userInfos;
    }
}
