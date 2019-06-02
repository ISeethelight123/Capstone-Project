package com.sq.pojo;

public class ControlsQueryVo {

	private Integer controlId;
	private Integer controlCarid;
	private Integer controlLineid;
	private Integer controlDriverid;
	private Integer controlWaybilid;
	private String controlStarttime;
	private String controlEndtime;
	private Integer controlWrehouseId;
	private String controlDestination;
	
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
	public Integer getControlId() {
		return controlId;
	}
	public void setControlId(Integer controlId) {
		this.controlId = controlId;
	}
	public Integer getControlCarid() {
		return controlCarid;
	}
	public void setControlCarid(Integer controlCarid) {
		this.controlCarid = controlCarid;
	}
	public Integer getControlLineid() {
		return controlLineid;
	}
	public void setControlLineid(Integer controlLineid) {
		this.controlLineid = controlLineid;
	}
	public Integer getControlDriverid() {
		return controlDriverid;
	}
	public void setControlDriverid(Integer controlDriverid) {
		this.controlDriverid = controlDriverid;
	}
	public Integer getControlWaybilid() {
		return controlWaybilid;
	}
	public void setControlWaybilid(Integer controlWaybilid) {
		this.controlWaybilid = controlWaybilid;
	}
	public String getControlStarttime() {
		return controlStarttime;
	}
	public void setControlStarttime(String controlStarttime) {
		this.controlStarttime = controlStarttime;
	}
	public String getControlEndtime() {
		return controlEndtime;
	}
	public void setControlEndtime(String controlEndtime) {
		this.controlEndtime = controlEndtime;
	}
	public Integer getControlWrehouseId() {
		return controlWrehouseId;
	}
	public void setControlWrehouseId(Integer controlWrehouseId) {
		this.controlWrehouseId = controlWrehouseId;
	}
	public String getControlDestination() {
		return controlDestination;
	}
	public void setControlDestination(String controlDestination) {
		this.controlDestination = controlDestination;
	}
	
	
	
	
}
