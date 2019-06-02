package com.sq.pojo;

public class Waybil {

	private Integer waybilId;
	private Integer waybilOrderid;
	private Integer waybilOid;
	//表一对一
	private Orders order;
	
	public Orders getOrder() {
		return order;
	}
	public void setOrder(Orders order) {
		this.order = order;
	}
	public Integer getWaybilId() {
		return waybilId;
	}
	public void setWaybilId(Integer waybilId) {
		this.waybilId = waybilId;
	}
	public Integer getWaybilOrderid() {
		return waybilOrderid;
	}
	public void setWaybilOrderid(Integer waybilOrderid) {
		this.waybilOrderid = waybilOrderid;
	}
	public Integer getWaybilOid() {
		return waybilOid;
	}
	public void setWaybilOid(Integer waybilOid) {
		this.waybilOid = waybilOid;
	}
	
	
	
	
	
	
	
	
}
