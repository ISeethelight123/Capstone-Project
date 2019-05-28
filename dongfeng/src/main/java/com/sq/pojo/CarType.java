package com.sq.pojo;

public class CarType {

	Integer cartypeId;
	String cartypes;
	public Integer getCartypeId() {
		return cartypeId;
	}
	public void setCartypeId(Integer cartypeId) {
		this.cartypeId = cartypeId;
	}
	public String getCartypes() {
		return cartypes;
	}
	public void setCartypes(String cartypes) {
		this.cartypes = cartypes;
	}
	@Override
	public String toString() {
		return "CarType [cartypeId=" + cartypeId + ", cartypes=" + cartypes + "]";
	}
	
	
	
	
	
}
