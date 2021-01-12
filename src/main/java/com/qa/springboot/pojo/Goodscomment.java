package com.qa.springboot.pojo;

import java.util.Date;

public class Goodscomment {
    private Integer userid;

    private Integer gdid;

    private Date gcdate;

    private Integer gctype;

    private String gctext;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getGdid() {
        return gdid;
    }

    public void setGdid(Integer gdid) {
        this.gdid = gdid;
    }

    public Date getGcdate() {
        return gcdate;
    }

    public void setGcdate(Date gcdate) {
        this.gcdate = gcdate;
    }

    public Integer getGctype() {
        return gctype;
    }

    public void setGctype(Integer gctype) {
        this.gctype = gctype;
    }

    public String getGctext() {
        return gctext;
    }

    public void setGctext(String gctext) {
        this.gctext = gctext;
    }
}