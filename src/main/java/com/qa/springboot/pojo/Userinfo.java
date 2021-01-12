package com.qa.springboot.pojo;

import java.util.Date;

public class Userinfo {
    private Integer userid;

    private String name;

    private Integer sex;

    private Date birthday;

    private String ufnum;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getUfnum() {
        return ufnum;
    }

    public void setUfnum(String ufnum) {
        this.ufnum = ufnum;
    }
}