package com.boco.model;

import java.math.BigDecimal;

public class CourseInfo {
    private BigDecimal cId;

    private String cname;

    public BigDecimal getcId() {
        return cId;
    }

    public void setcId(BigDecimal cId) {
        this.cId = cId;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }
}