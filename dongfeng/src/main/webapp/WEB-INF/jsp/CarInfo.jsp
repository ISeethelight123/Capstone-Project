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
		<title>车辆信息管理</title>
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
			<form class="form-inline" action="${pageContext.request.contextPath }/car/CarInfo">
				<div class="form-group" style="margin-left: 15px;">
					<label for="exampleInputEmail2">车牌号</label> <input value="${carPlate }"  type="text" name="carPlate" style="width: 150px" class="form-control" id="exampleInputEmail2">
				</div>
				<!-- <div class="form-group" style="margin-left: 15px;">
					<label for="exampleInputEmail2">车载重</label> <input type="text" style="width: 100px" class="form-control" id="exampleInputEmail2">
				</div> -->
				
				
				<div class="form-group" style="margin-left: 15px;">
					<label for="exampleInputEmail2">车载重</label> 
					<select	class="form-control" id="exampleInputEmail2" placeholder="车载重" name="carWeight">
						<option value="">--请选择--</option>
						<c:forEach items="${listLoads}" var="item">
							<option value="${item.carloadId}" <c:if test="${item.carloadId == carWeight}"> selected</c:if> >${item.carloads }</option>
						</c:forEach>
					</select>
				</div>
				<div class="form-group" style="margin-left: 15px;">
					<label for="exampleInputEmail2">车型</label> 
					<select	class="form-control" id="exampleInputEmail2" placeholder="车型" name="carType">
						<option value="">--请选择--</option>
						<c:forEach items="${listType}" var="item">
							<option value="${item.cartypeId}" <c:if test="${item.cartypeId == carType}"> selected</c:if>>${item.cartypes }</option>
						</c:forEach>
					</select>
				</div>
				<div class="form-group" style="margin-left: 15px;">
					<label for="exampleInputEmail2">车状态</label> 
					<select	class="form-control" id="exampleInputEmail2" placeholder="车状态" name="carStatus">
						<option value="">--请选择--</option>
						<option value="0" <c:if test="${'0' == carStatus}"> selected</c:if>>使用中</option>
						<option value="1" <c:if test="${'1' == carStatus}"> selected</c:if>>闲置中</option>	
					</select>
				</div>
						
				
				<button type="submit" class="btn btn-default">查询</button>
			</form>
			<div id="tj">
				<a href="#" class="btn btn-default" data-toggle="modal" data-target="#carInsertDialog" onclick="">添加</a>
			</div>
			<table class="table table-striped table table-bordered table table-hover" style="margin-top: 30px;text-align: center;">
				<tr>
					<th style="text-align: center;">编号</th>
					<th style="text-align: center;">车牌号</th>
					<th style="text-align: center;">载重</th>
					<th style="text-align: center;">车型</th>
					<th style="text-align: center;">车尺寸</th>
					<th style="text-align: center;">状态</th>
					<th style="text-align: center;">操作</th>
				</tr>
				<c:forEach items="${page.rows }" var="row" >
					<tr>
						<td>${row.carId }</td>
						<td>${row.carPlate }</td>
						<td>${row.loads.carloads }</td>
						<td>${row.types.cartypes }</td>
						<td>${row.carSize }</td>
						<td>${(row.carStatus == 0)?"使用中":"闲置中" }</td>
						<td>
							<button class="btn btn-primary btn-xs" id="deleteCar" onclick="deleteCar(${row.carId})">删除</button>
							<a class="btn btn-primary btn-xs" data-toggle="modal" data-target="#customerEditDialog" onclick="editCar(${row.carId})">修改</a>
						</td>
					</tr>
				</c:forEach>

			</table>
			<div class="col-md-12 text-right">
				<itcast:page url="${pageContext.request.contextPath }/car/CarInfo"/>
			</div>
		</div>
		
		
		
		<!-- 车辆信息编辑对话框 -->
		<div class="modal fade" id="customerEditDialog" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">修改客户信息</h4>
				</div>
				<div class="modal-body">
					<form class="form-horizontal" id="edit_car_form">
						<input type="hidden" id="edit_carId" name="carId"/>
						<div class="form-group">
							<label for="edit_carPlate" class="col-sm-2 control-label">车牌号</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="edit_carPlate" placeholder="车牌号" name="carPlate">
							</div>
						</div>
						<div class="form-group">
							<label for="edit_carWeight" style="float:left;padding:7px 15px 0 39px;">车载重</label> 
							<div class="col-sm-10">
								<select	class="form-control" id="edit_carWeight"  name="carWeight">
									<option value="">--请选择--</option>
									<c:forEach items="${listLoads}" var="item">
										<option value="${item.carloadId}" <c:if test="${item.carloadId == carWeight}"> selected</c:if>>${item.carloads }</option>
									</c:forEach>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label for="edit_carType" style="float:left;padding:7px 15px 0 53px;">车型</label>
							<div class="col-sm-10"> 
								<select	class="form-control" id="edit_carType"  name="carType">
									<option value="">--请选择--</option>
									<c:forEach items="${listType}" var="item">
										<option value="${item.cartypeId}" <c:if test="${item.cartypeId == carType}"> selected</c:if>>${item.cartypes }</option>
									</c:forEach>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label for="edit_carStatus" style="float:left;padding:7px 15px 0 40px;">车状态</label>
							<div class="col-sm-10">
								<select	class="form-control" id="edit_carStatus" name="carStatus">
									<option value="">--请选择--</option>
									<option value="0" <c:if test="${'0' == carStatus}"> selected</c:if>>使用中</option>
									<option value="1" <c:if test="${'1' == carStatus}"> selected</c:if>>闲置中</option>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label for="edit_carSize" class="col-sm-2 control-label">车尺寸</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="edit_carSize" placeholder="车尺寸" name="carSize">
							</div>
						</div>
						
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary" onclick="updateCar()">保存修改</button>
				</div>
			</div>
		</div>
	</div>
	
	
	
		<!-- 车辆信息添加对话框 -->
		<div class="modal fade" id="carInsertDialog" tabindex="-1" role="dialog"
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
	</div>

		<script type="text/javascript">
			
			
			function deleteCar(carId) {
				if(confirm('确实要删除该车吗? ')) {
					$.post("<%=basePath%>car/deleteCarById",{"carId":carId},function(data){
						alert("车辆删除成功！");
						window.location.reload();
					});
				}
			};
				
			function editCar(carId) {
				$.ajax({
					type:"get",
					url:"<%=basePath%>car/editCarById",
					data:{"carId":carId},
					success:function(data) {
						$("#edit_carId").val(data.carId);
						$("#edit_carPlate").val(data.carPlate);
						$("#edit_carWeight").val(data.carWeight);
						$("#edit_carType").val(data.carType);
						$("#edit_carSize").val(data.carSize);
						$("#edit_carStatus").val(data.carStatus);
					}
				});
			};	
			function updateCar() {
				$.post("<%=basePath%>car/updateCarById",$("#edit_car_form").serialize(),function(data){
					alert("车辆信息更新成功！");
					window.location.reload();
				});
			}
			
			function insertCar() {
				$.post("<%=basePath%>car/insertCarById",$("#text_car_form").serialize(),function(data){
					alert("车辆信息添加成功！");
					window.location.reload();
				});
			}
			
			
			
			
			
		</script>

	</body>

</html>