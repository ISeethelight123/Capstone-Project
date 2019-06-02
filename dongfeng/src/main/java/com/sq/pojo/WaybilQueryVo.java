package com.sq.pojo;

public class WaybilQueryVo {

	private Integer startPoint;
	private String endPoint;
	private Integer waybilId;
	//当前页
	private Integer page = 1;
	//每页数
	private Integer size = 10;
	//起始行
	private Integer startRow;
	
	
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public Integer getStartRow() {
		return startRow;
	}
	public void setStartRow(Integer startRow) {
		this.startRow = startRow;
	}
	public Integer getWaybilId() {
		return waybilId;
	}
	public void setWaybilId(Integer waybilId) {
		this.waybilId = waybilId;
	}
	public Integer getStartPoint() {
		return startPoint;
	}
	public void setStartPoint(Integer startPoint) {
		this.startPoint = startPoint;
	}
	public String getEndPoint() {
		return endPoint;
	}
	public void setEndPoint(String endPoint) {
		this.endPoint = endPoint;
	}
	
	
	
	
}
