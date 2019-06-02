<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="itcast" uri="http://itcast.cn/common/"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title>调度单管理</title>
		<!-- 引入bootstrap的核心文件 -->
		<link rel="stylesheet" type="text/css" href="/static/css/bootstrap.min.css" />

		<!-- 引入jqury-->
		<script type="text/javascript" src="/static/js/jquery-1.11.0.js"></script>

		<!-- 引入bootstrap的核心js文件  -->
		<script type="text/javascript" src="/static/js/bootstrap.js"></script>

		<script src="/static/js/bootstrap-dialog.js" type="text/javascript" charset="utf-8"></script>
		<script src="/static/js/bootstrap-dialog.min.js" type="text/javascript" charset="utf-8"></script>


		<!-- Bootstrap Core CSS -->
		<link href="<%=basePath%>static1/css/bootstrap.min.css" rel="stylesheet">
		
		<!-- MetisMenu CSS -->
		<link href="<%=basePath%>static1/css/metisMenu.min.css" rel="stylesheet">
		
		<!-- DataTables CSS -->
		<link href="<%=basePath%>static1/css/dataTables.bootstrap.css" rel="stylesheet">
		
		<!-- Custom CSS -->
		<link href="<%=basePath%>static1/css/sb-admin-2.css" rel="stylesheet">
		
		<!-- Custom Fonts -->
		<link href="<%=basePath%>static1/css/font-awesome.min.css" rel="stylesheet"
			type="text/css">
		<link href="<%=basePath%>static1/css/boot-crm.css" rel="stylesheet"
			type="text/css">



		<meta name="viewport" content="width=device-width, initial-scale=1">
	</head>
	<style type="text/css">
		#tj {
			position: absolute;
			top: 50px;
			left: 1050px;
		}
		
		
		
	</style>

	<body>

		<div class="container" style="margin-top: 50px">
			<form class="form-inline" action="${pageContext.request.contextPath }/Schedule/manageSchedule/manageSchedule">
				<div class="form-group" style="margin-left: 15px;">
					<label for="examplecontrolId">调度单编号</label> 
					<input value="${controlId }"  type="text" name="controlId" style="width: 150px" class="form-control" id="examplecontrolId">
				</div>
				<div class="form-group" style="margin-left: 15px;">
					<label  for="exampleStartPoint">出发仓库</label> 
					<select	class="form-control" id="exampleStartPoint" placeholder="仓库地址" name="controlWrehouseId">
						<option value="">--请选择--</option>
						<c:forEach items="${wrehouseList}" var="item">
							<option value="${item.wrehouseId}" <c:if test="${item.wrehouseId == controlWrehouseId}">selected</c:if> >${item.wrehouseId}(${item.wrehouseName })</option>
						</c:forEach>
					</select>
				</div>
				<div class="form-group" style="margin-left: 15px;">
					<label for="exampleEndPoint">目的地</label> 
					<select	class="form-control" id="exampleEndPoint" placeholder="目的地" name="controlDestination">
						<option value="">--请选择--</option>
						<c:forEach items="${chinaList}" var="item">
							<option value="${item.name}" <c:if test="${item.name == controlDestination}">selected</c:if>  >${item.name}</option>
						</c:forEach>
					</select>
				</div>
				<div class="form-group" style="margin-left: 15px;">
					<label for="exampleControlCarid">车辆编号</label> 
					<select	class="form-control" id="exampleControlCarid" placeholder="车辆ID" name="controlCarid">
						<option value="">--请选择--</option>
						<c:forEach items="${carList}" var="item">
							<option value="${item.carId}" <c:if test="${item.carId == controlCarid}"> selected</c:if> >${item.carId }(${item.carPlate })</option>
						</c:forEach>
					</select>
				</div>
				<div class="form-group" style="margin-left: 15px;">
					<label for="exampleControlLineid">路线编号</label> 
					<select	class="form-control" id="exampleControlLineid" placeholder="路线编号" name="controlLineid">
						<option value="">--请选择--</option>
						<%-- <c:forEach items="${listType}" var="item"> --%>
							<option value="1">1</option>
						<%-- </c:forEach> --%>
					</select>
				</div>
				<div class="form-group" style="margin-left: 15px; margin-top: 15px;">
					<label for="exampleControlDriverid">司机编号</label> 
					<select	class="form-control" id="exampleControlDriverid" placeholder="司机编号" name="controlDriverid">
						<option value="">--请选择--</option>
						<c:forEach items="${driverList}" var="item">
							<option value="${item.driverId}" <c:if test="${item.driverId == controlDriverid}"> selected</c:if>>${item.driverId }(${item.driverName })</option>
						</c:forEach>
					</select>
				</div>
				<button type="submit" class="btn btn-default" style="margin-left: 15px; margin-top: 15px;">查询</button>
			</form>
			<div id="tj">
				<!-- <a href="#" class="btn btn-default" data-toggle="modal" data-target="#carInsertDialog" onclick="">添加</a> -->
			</div>
			<table class="table table-striped table table-bordered table table-hover" style="margin-top: 30px;text-align: center;">
				<tr>
					<th style="text-align: center;">调度单编号</th>
					<th style="text-align: center;">仓库</th>
					<th style="text-align: center;">运单号</th>
					<th style="text-align: center;">目的地</th>
					<th style="text-align: center;">路线</th>
					<th style="text-align: center;">车辆</th>
					<th style="text-align: center;">司机</th>
					<th style="text-align: center;">预计出发时间</th>
					<th style="text-align: center;">预计达到时间</th>
					<th style="text-align: center;">操作</th>
				</tr>
				<c:forEach items="${page.rows }" var="row" >
					<tr>
						<td>${row.controlId }</td>
						<td>${row.controlWrehouseId }(${row.wrehouse.wrehouseName})</td>
						<td>${row.controlWaybilid }</td>
						<td>${row.controlDestination }</td>
						<td>${row.controlLineid }</td>
						<td>${row.controlCarid }(${row.car.carPlate })</td>
						<td>${row.controlDriverid}(${row.driver.driverName })</td>
						<td>${row.controlStarttime }</td>
						<td>${row.controlEndtime }</td>
						<td>
							<button class="btn btn-primary btn-xs" id="deleteCar" onclick="deleteCar(${row.controlId})">删除</button>
							<a class="btn btn-primary btn-xs" data-toggle="modal" data-target="#ScheduleEditDialog" onclick="editSchedule(${row.controlId})">修改</a>
						</td>
					</tr>
				</c:forEach>

			</table>
			<div class="col-md-12 text-right">
				<itcast:page url="${pageContext.request.contextPath }/Schedule/manageSchedule/manageSchedule"/>
			</div>
		</div>
		
		
		
		<!-- 车辆信息编辑对话框 -->
		<div class="modal fade" id="ScheduleEditDialog" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document" style="width:700px;">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">关闭</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">修改调度单信息</h4>
				</div>
				<div class="modal-body">
					<form class="form-horizontal" id="edit_schedule_form">
						<div class="form-group">
							<label for="edit_controlId" class="col-sm-2 control-label">调度单编号</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="edit_controlId" name="controlId" readonly="readonly"/>
							</div>
						</div>
						<div class="form-group">
							<label for="edit_controlWrehouseId" class="col-sm-2 control-label">仓库</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="edit_controlWrehouseId" placeholder="仓库" name="controlWrehouseId" readonly="readonly">
							</div>
						</div>
						<div class="form-group">
							<label for="edit_controlWaybilid" class="col-sm-2 control-label">运单号</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="edit_controlWaybilid" placeholder="运单号" name="controlWaybilid" readonly="readonly">
							</div>
						</div>
						<div class="form-group">
							<label for="edit_controlDestination" style="float:left;padding:7px 15px 0 58px;">目的地</label> 
							<div class="col-sm-10">
								<input type="text" class="form-control" id="edit_controlDestination" placeholder="运单号" name="controlDestination" readonly="readonly">
							</div>
						</div>
						<div class="form-group">
							<label for="edit_controlCarid" style="float:left;padding:7px 15px 0 70px;">车辆</label>
							<div class="col-sm-10"> 
								<select	class="form-control" id="edit_controlCarid"  name="controlCarid">
									<option value="">--请选择--</option>
									<c:forEach items="${carList}" var="item">
										<option value="${item.carId}" <c:if test="${item.carId == controlCarid}"> selected</c:if> >${item.carId }(${item.carPlate })</option>
									</c:forEach>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label for="edit_controlLineid" style="float:left;padding:7px 15px 0 70px;">路线</label>
							<div class="col-sm-10"> 
								<select	class="form-control" id="edit_controlLineid"  name="controlLineid">
									<option value="">--请选择--</option>
									<option value="1" selected="selected">1</option>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label for="edit_controlDriverid" style="float:left;padding:7px 15px 0 70px;">司机</label>
							<div class="col-sm-10"> 
								<select	class="form-control" id="edit_controlDriverid"  name="controlDriverid">
									<c:forEach items="${driverList}" var="item">
										<option value="${item.driverId}" <c:if test="${item.driverId == controlDriverid}"> selected</c:if>>${item.driverId }(${item.driverName })</option>
									</c:forEach>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label for="edit_controlStarttime" style="float:left;padding:7px 15px 0 16px;">预计出发时间</label>
							<div class="col-sm-10">
								<input type="date" placeholder="预计出发时间" name="controlStarttime" class="form-control" id="edit_controlStarttime">
							</div>
						</div>
						<div class="form-group">
							<label for="edit_controlEndtime" class="col-sm-2 control-label">预计到达时间</label>
							<div class="col-sm-10">
								<input type="date" class="form-control" id="edit_controlEndtime" placeholder="预计到达时间" name="controlEndtime">
							</div>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary" onclick="updateSchedule()">保存修改</button>
				</div>
			</div>
		</div>
	</div>
	
	
	
		<!-- 车辆信息添加对话框 -->
		<%-- <div class="modal fade" id="carInsertDialog" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">添加车辆信息</h4>
				</div>
				<div class="modal-body">
					<form class="form-horizontal" id="text_car_form">
						<div class="form-group">
							<label for="text_carPlate" class="col-sm-2 control-label">车牌号</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="text_carPlate" placeholder="车牌号" name="carPlate">
							</div>
						</div>
						<div class="form-group">
							<label for="text_carWeight" style="float:left;padding:7px 15px 0 39px;">车载重</label> 
							<div class="col-sm-10">
								<select	class="form-control" id="text_carWeight"  name="carWeight">
									<option value="">--请选择--</option>
									<c:forEach items="${listLoads}" var="item">
										<option value="${item.carloadId}">${item.carloads }</option>
									</c:forEach>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label for="text_carType" style="float:left;padding:7px 15px 0 53px;">车型</label>
							<div class="col-sm-10"> 
								<select	class="form-control" id="text_carType"  name="carType">
									<option value="">--请选择--</option>
									<c:forEach items="${listType}" var="item">
										<option value="${item.cartypeId}">${item.cartypes }</option>
									</c:forEach>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label for="text_carStatus" style="float:left;padding:7px 15px 0 40px;">车状态</label>
							<div class="col-sm-10">
								<select	class="form-control" id="text_carStatus" name="carStatus">
									<option value="">--请选择--</option>
									<option value="0">使用中</option>
									<option value="1">闲置中</option>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label for="text_carSize" class="col-sm-2 control-label">车尺寸</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="text_carSize" placeholder="车尺寸" name="carSize">
							</div>
						</div>
						
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary" onclick="insertCar()">保存</button>
				</div>
			</div>
		</div>
	</div> --%>

		<script type="text/javascript">
			
			function editSchedule(controlId) {
				$.ajax({
					type:"get",
					url:"<%=basePath%>Schedule/manageSchedule/editSchedule",
					data:{"controlId":controlId},
					success:function(data) {
						$("#edit_controlId").val(data.controlId);
						$("#edit_controlWrehouseId").val(data.controlWrehouseId);
						$("#edit_controlWaybilid").val(data.controlWaybilid);
						$("#edit_controlDestination").val(data.controlDestination);
						$("#edit_controlLineid").val(data.controlLineid);
						$("#edit_controlCarid").val(data.controlCarid);
						$("#edit_controlDriverid").val(data.controlDriverid);
						$("#edit_controlStarttime").val(data.controlStarttime);
						$("#edit_controlEndtime").val(data.controlEndtime);
					}
				});
			};	
			
			function updateSchedule() {
				$.post("<%=basePath%>Schedule/manageSchedule/editSchedule",$("#edit_schedule_form").serialize(),function(data){
					alert("车辆信息更新成功！");
					window.location.reload();
				});
			}
		
		
			<%-- function deleteCar(carId) {
				if(confirm('确实要删除该车吗? ')) {
					$.post("<%=basePath%>car/deleteCarById",{"carId":carId},function(data){
						alert("车辆删除成功！");
						window.location.reload();
					});
				}
			};
				
				
			
			
			function insertCar() {
				$.post("<%=basePath%>car/insertCarById",$("#text_car_form").serialize(),function(data){
					alert("车辆信息添加成功！");
					window.location.reload();
				});
			} --%>
			
			
			
			
			
		</script>

	</body>

</html>