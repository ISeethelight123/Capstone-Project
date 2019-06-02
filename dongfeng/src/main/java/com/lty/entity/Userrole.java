package com.lty.entity;

public class Userrole {
private int uid;
private int rid;
@Override
public String toString() {
	return "User_role [uid=" + uid + ", rid=" + rid + "]";
}
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}
public int getRid() {
	return rid;
}
public void setRid(int rid) {
	this.rid = rid;
}
}
