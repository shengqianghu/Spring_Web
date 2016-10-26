package com.boco.model;

import java.math.BigDecimal;

public class CourseUserInfo {
    private BigDecimal id;

    private BigDecimal uId;

    private BigDecimal cId;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getuId() {
        return uId;
    }

    public void setuId(BigDecimal uId) {
        this.uId = uId;
    }

    public BigDecimal getcId() {
        return cId;
    }

    public void setcId(BigDecimal cId) {
        this.cId = cId;
    }
}