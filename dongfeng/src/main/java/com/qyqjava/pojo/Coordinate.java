package com.qyqjava.pojo;

public class Coordinate {
    private Integer no;

    private String nameid;

    private Double x;

    private Double y;

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getNameid() {
        return nameid;
    }

    public void setNameid(String nameid) {
        this.nameid = nameid == null ? null : nameid.trim();
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }
}