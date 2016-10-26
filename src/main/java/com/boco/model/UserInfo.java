package com.boco.model;

import java.math.BigDecimal;

public class UserInfo {
    private BigDecimal uId;

    private String uname;

    private BigDecimal age;

    public UserInfo() {
    }

    public UserInfo(BigDecimal uId) {
        this.uId = uId;
    }

    public BigDecimal getuId() {
        return uId;
    }

    public void setuId(BigDecimal uId) {
        this.uId = uId;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public BigDecimal getAge() {
        return age;
    }

    public void setAge(BigDecimal age) {
        this.age = age;
    }
}