package com.sq.pojo;

public class NetWork {

	Integer networkId;
	Integer networkAddressid;
	String networkTemp1;
	String networkTemp2;
	public Integer getNetworkId() {
		return networkId;
	}
	public void setNetworkId(Integer networkId) {
		this.networkId = networkId;
	}
	public Integer getNetworkAddressid() {
		return networkAddressid;
	}
	public void setNetworkAddressid(Integer networkAddressid) {
		this.networkAddressid = networkAddressid;
	}
	public String getNetworkTemp1() {
		return networkTemp1;
	}
	public void setNetworkTemp1(String networkTemp1) {
		this.networkTemp1 = networkTemp1;
	}
	public String getNetworkTemp2() {
		return networkTemp2;
	}
	public void setNetworkTemp2(String networkTemp2) {
		this.networkTemp2 = networkTemp2;
	}
	@Override
	public String toString() {
		return "NetWork [networkId=" + networkId + ", networkAddressid=" + networkAddressid + ", networkTemp1="
				+ networkTemp1 + ", networkTemp2=" + networkTemp2 + "]";
	}
	
	
	
	
}
