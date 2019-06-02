package com.lty.entity;

public class User {
private int id;
private String name;
private String uname;
private String pwd;
private String ad;
private String position;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
public String getAd() {
	return ad;
}
public void setAd(String ad) {
	this.ad = ad;
}
public String getPosition() {
	return position;
}
public void setPosition(String position) {
	this.position = position;
}
@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", uname=" + uname + ", pwd=" + pwd + ", ad=" + ad + ", position="
			+ position + "]";
}





}
