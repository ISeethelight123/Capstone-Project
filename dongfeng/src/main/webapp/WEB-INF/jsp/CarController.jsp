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
		<title>调度信息管理</title>
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
			left: 1130px;
		}
		
	</style>

	<body>

		<div class="container" style="margin-top: 50px">
			<form class="form-inline" action="${pageContext.request.contextPath }/driver/DriverInfo">
				<div class="form-group" style="margin-left: 15px;">
					<label for="exampleInputEmail2">编号</label>
					<input value="${driverId }" type="text" placeholder="编号" name="driverId" class="form-control" id="exampleInputEmail2">
				</div>
				
				<div class="form-group" style="margin-left: 15px;">
					<label for="exampleInputEmail2">名字</label> 
					<input value="${driverName }"  type="text" placeholder="名字" name="driverName" style="width: 150px" class="form-control" id="exampleInputEmail2">
				</div>
				<div class="form-group" style="margin-left: 15px;">
					<label for="exampleInputEmail2">电话</label> 
					<input value="${driverPhone }"  type="text" placeholder="电话" name="driverPhone" style="width: 150px" class="form-control" id="exampleInputEmail2">
				</div>
				<div class="form-group" style="margin-left: 15px;">
					<label for="exampleInputEmail2">司机状态</label> 
					<select	class="form-control" id="exampleInputEmail2" placeholder="司机状态" name="driverStatus">
						<option value="">--请选择--</option>
						<option value="0" <c:if test="${'0' == driverStatus}"> selected</c:if>>运输中</option>
						<option value="1" <c:if test="${'1' == driverStatus}"> selected</c:if>>闲置中</option>	
					</select>
				</div>
				<button type="submit" class="btn btn-default">查询</button>
			</form>
			<div id="tj">
				<a href="#" class="btn btn-default" data-toggle="modal" data-target="#driverInsertDialog" >添加</a>
			</div>
			<table class="table table-striped table table-bordered table table-hover" style="margin-top: 30px;text-align: center;">
				<tr>
					<th style="text-align: center;">编号</th>
					<th style="text-align: center;">名字</th>
					<th style="text-align: center;">年龄</th>
					<th style="text-align: center;">电话</th>
					<th style="text-align: center;">地址</th>
					<th style="text-align: center;">状态</th>
					<th style="text-align: center;">操作</th>
				</tr>
				<c:forEach items="${page.rows }" var="row" >
					<tr>
						<td>${row.driverId }</td>
						<td>${row.driverName }</td>
						<td>${row.driverAge }</td>
						<td>${row.driverPhone }</td>
						<td>${row.driverAddress }</td>
						<td>${(row.driverStatus == 0)?"运输中":"闲置中" }</td>
						<td>
							<button class="btn btn-primary btn-xs" id="deleteDriver" onclick="deleteDriver(${row.driverId})">删除</button>
							<a class="btn btn-primary btn-xs" data-toggle="modal" data-target="#driverEditDialog" onclick="editDriver(${row.driverId})">修改</a>
						</td>
					</tr>
				</c:forEach>

			</table>
			<div class="col-md-12 text-right">
				<itcast:page url="${pageContext.request.contextPath }/car/DriverInfo"/>
			</div>
		</div>
		
		
		
		<!-- 车辆信息编辑对话框 -->
		<div class="modal fade" id="driverEditDialog" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">修改司机信息</h4>
				</div>
				<div class="modal-body">
					<form class="form-horizontal" id="edit_driver_form">
						<input type="hidden" id="edit_driverId" name="driverId"/>
						<div class="form-group">
							<label for="edit_driverName" class="col-sm-2 control-label">姓名</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="edit_driverName" placeholder="姓名" name="driverName">
							</div>
						</div>
						<div class="form-group">
							<label for="edit_driverAge" style="float:left;padding:7px 15px 0 55px;">年龄</label> 
							<div class="col-sm-10">
								<input type="text" class="form-control" id="edit_driverAge" placeholder="年龄" name="driverAge">
							</div>
						</div>
						<div class="form-group">
							<label for="edit_driverPhone" style="float:left;padding:7px 15px 0 55px;">电话</label>
							<div class="col-sm-10"> 
								<input type="text" class="form-control" id="edit_driverPhone" placeholder="电话" name="driverPhone">
							</div>
						</div>
						<div class="form-group">
							<label for="edit_driverStatus" style="float:left;padding:7px 15px 0 55px;">状态</label>
							<div class="col-sm-10">
								<select	class="form-control" id="edit_driverStatus" name="driverStatus">
									<option value="">--请选择--</option>
									<option value="0" <c:if test="${'0' == driverStatus}"> selected</c:if>>运输中</option>
									<option value="1" <c:if test="${'1' == driverStatus}"> selected</c:if>>闲置中</option>
								</select>
							</div>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary" onclick="updateDriver()">保存修改</button>
				</div>
			</div>
		</div>
	</div>
	
	
	
		<!-- 车辆信息添加对话框 -->
		<div class="modal fade" id="driverInsertDialog" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">添加司机信息</h4>
				</div>
				<div class="modal-body">
					<form class="form-horizontal" id="text_driver_form">
						<div class="form-group">
							<label for="text_driverName" class="col-sm-2 control-label">姓名</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="text_driverName" placeholder="姓名" name="driverName">
							</div>
						</div>
						<div class="form-group">
							<label for="text_driverAge" style="float:left;padding:7px 15px 0 55px;">年龄</label> 
							<div class="col-sm-10">
								<input type="text" class="form-control" id="text_driverAge" placeholder="年龄" name="driverAge">
							</div>
						</div>
						<div class="form-group">
							<label for="text_driverPhone" style="float:left;padding:7px 15px 0 55px;">电话</label>
							<div class="col-sm-10"> 
								<input type="text" class="form-control" id="text_driverPhone" placeholder="电话" name="driverPhone">
							</div>
						</div>
						<div class="form-group">
							<label for="text_driverStatus" style="float:left;padding:7px 15px 0 55px;">状态</label>
							<div class="col-sm-10">
								<select	class="form-control" id="text_driverStatus" name="driverStatus">
									<option value="">--请选择--</option>
									<option value="0">运输中</option>
									<option value="1">闲置中</option>
								</select>
							</div>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary" onclick="insertDriver()">保存</button>
				</div>
			</div>
		</div>
	</div>

		<script type="text/javascript">
			
			
			function deleteDriver(driverId) {
				if(confirm('确实要删除该车吗? ')) {
					$.post("<%=basePath%>driver/deleteDriverById",{"driverId":driverId},function(data){
						alert("车辆删除成功！");
						window.location.reload();
					});
				}
			};
				
			function editDriver(driverId) {
				$.ajax({
					type:"get",
					url:"<%=basePath%>driver/editDriverById",
					data:{"driverId":driverId},
					success:function(data) {
						$("#edit_driverId").val(data.driverId);
						$("#edit_driverName").val(data.driverName);
						$("#edit_driverAge").val(data.driverAge);
						$("#edit_driverPhone").val(data.driverPhone);
						$("#edit_driverAddress").val(data.driverAddress);
						$("#edit_driverStatus").val(data.driverStatus);
					}
				});
			};	
			function updateDriver() {
				$.post("<%=basePath%>driver/updateDriverById",$("#edit_driver_form").serialize(),function(data){
					alert("车辆信息更新成功！");
					window.location.reload();
				});
			}
			
			function insertDriver() {
				$.post("<%=basePath%>driver/insertDriverById",$("#text_driver_form").serialize(),function(data){
					alert("车辆信息添加成功！");
					window.location.reload();
				});
			}
			
			
			
			
			
		</script>

	</body>

</html>