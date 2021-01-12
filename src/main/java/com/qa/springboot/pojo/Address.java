package com.qa.springboot.pojo;

public class Address {
    private Integer aid;

    private Integer userid;

    private String address;

    private String daddress;

    private String linkpeople;

    private String phone;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDaddress() {
        return daddress;
    }

    public void setDaddress(String daddress) {
        this.daddress = daddress;
    }

    public String getLinkpeople() {
        return linkpeople;
    }

    public void setLinkpeople(String linkpeople) {
        this.linkpeople = linkpeople;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}