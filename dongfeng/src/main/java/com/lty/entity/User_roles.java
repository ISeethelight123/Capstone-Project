package com.lty.entity;

public class User_roles {
private int id;
private String username;
private String rolename;
@Override
public String toString() {
	return "user_roles [id=" + id + ", username=" + username + ", rolename=" + rolename + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getRolename() {
	return rolename;
}
public void setRolename(String rolename) {
	this.rolename = rolename;
}

}
