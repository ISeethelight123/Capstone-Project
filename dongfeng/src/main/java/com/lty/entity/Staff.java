package com.lty.entity;

public class Staff {
    private Integer id;

    private String department;

    private String position;

    private String sex;

    private String phonenum;

    private String starttime;

    private String endtime;

    private String idcard;

    private String borntime;

    private Integer age;

    private String adress;

    private String starttimeofcon;

    private String endtimeofcon;

    private String marrystate;

    private String insuredtime;

    private String insuredmonney;

    private String aducationalbackgroud;

    private String school;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum == null ? null : phonenum.trim();
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime == null ? null : starttime.trim();
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime == null ? null : endtime.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getBorntime() {
        return borntime;
    }

    public void setBorntime(String borntime) {
        this.borntime = borntime == null ? null : borntime.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress == null ? null : adress.trim();
    }

    public String getStarttimeofcon() {
        return starttimeofcon;
    }

    public void setStarttimeofcon(String starttimeofcon) {
        this.starttimeofcon = starttimeofcon == null ? null : starttimeofcon.trim();
    }

    public String getEndtimeofcon() {
        return endtimeofcon;
    }

    public void setEndtimeofcon(String endtimeofcon) {
        this.endtimeofcon = endtimeofcon == null ? null : endtimeofcon.trim();
    }

    public String getMarrystate() {
        return marrystate;
    }

    public void setMarrystate(String marrystate) {
        this.marrystate = marrystate == null ? null : marrystate.trim();
    }

    public String getInsuredtime() {
        return insuredtime;
    }

    public void setInsuredtime(String insuredtime) {
        this.insuredtime = insuredtime == null ? null : insuredtime.trim();
    }

    public String getInsuredmonney() {
        return insuredmonney;
    }

    public void setInsuredmonney(String insuredmonney) {
        this.insuredmonney = insuredmonney == null ? null : insuredmonney.trim();
    }

    public String getAducationalbackgroud() {
        return aducationalbackgroud;
    }

    public void setAducationalbackgroud(String aducationalbackgroud) {
        this.aducationalbackgroud = aducationalbackgroud == null ? null : aducationalbackgroud.trim();
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }
}