<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>司机信息管理</title>

<!-- 引入bootstrap的核心文件 -->
<link rel="stylesheet" type="text/css"
	href="../static/css/bootstrap.min.css" />

<!-- 引入jqury-->
<script type="text/javascript" src="../static/js/jquery-1.11.0.js"></script>

<!-- 引入bootstrap的核心js文件  -->
<script type="text/javascript" src="../static/js/bootstrap.js"></script>

<script src="../static/js/bootstrap-dialog.js" type="text/javascript"
	charset="utf-8"></script>
<script src="../static/js/bootstrap-dialog.min.js"
	type="text/javascript" charset="utf-8"></script>
<script src="../static/js/bootbox.js" type="text/javascript"
	charset="utf-8"></script>

<meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<style type="text/css">
#tj {
	position: absolute;
	top: 52px;
	left: 1256px;
}
</style>

<body>
	<div class="container" style="margin-top: 50px">
		<form class="form-inline"
			action="${pageContext.request.contextPath}/Wrehouse/showByRequie">
			<select name="num" class="form-control">
				<option value="1">仓库编号</option>
				<option value="2">仓库地址</option>
			</select>
			<div class="form-group" style="margin-left: 15px;">
				<label for="exampleInputEmail2">请输入</label> <input type="text"
					class="form-control" id="exampleInputEmail2" name="requir">
			</div>
			<button type="submit" class="btn btn-default">查询</button>
		</form>
		<div id="tj">
			<button class="btn btn-default" id="tjstarf">添加</button>
		</div>
		<table
			class="table table-striped table table-bordered table table-hover"
			style="margin-top: 30px; text-align: center;">
			<tr>
				<th style="text-align: center;">编号</th>
				<th style="text-align: center;">仓库编号</th>
				<th style="text-align: center;">仓库地址</th>
				<th style="text-align: center;">仓库电话</th>
				<th style="text-align: center;">仓库巷道数</th>
				<th style="text-align: center;">仓库货架数</th>
				<th style="text-align: center;">仓库货位数</th>
				<th style="text-align: center;">操作</th>
			</tr>

			<c:forEach items="${list }" var="wre">
				<tr>
					<td>${wre.wrehouse_ID }</td>
					<td>${wre.wrehouse_Address }</td>
					<td>${wre.wrehouse_Name }</td>
					<td>${wre.Wrehouse_Phone }</td>
					<td>${wre.roadway }</td>
					<td>${wre.shelf }</td>
					<td>${wre.allocationNum }</td>
					<td>
						<button class="btn btn-default" id="deleteStarf" onclick="deleteStatus(${wre.wrehouse_Address});">删除</button> 
							<a class="btn btn-default">修改</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">新增仓库</h4>
				</div>
				<div class="modal-body">
					<form action="Wrehouse/addWrehosueInfo">
						<div class="form-group">
							<label for="txt_parentdepartment">仓库编号</label> <input type="text"
								name="wrehouseAddress" class="form-control" id="wrehouseAddress"
								placeholder="仓库编号">
						</div>
						<div class="form-group">
							<label for="txt_departmentlevel">仓库地址</label> <input type="text"
								name="wrehouseName" class="form-control" id="wrehouseName"
								placeholder="仓库地址">
						</div>
						<div class="form-group">
							<label for="txt_departmentlevel">仓库电话</label> <input type="text"
								name="wrehousePhone" class="form-control" id="wrehousePhone"
								placeholder="仓库电话">
						</div>
						<div class="form-group">
							<label for="txt_departmentlevel">仓库巷道数</label> <input type="text"
								name="roadway" class="form-control" id="roadway"
								placeholder="仓库巷道数">
						</div>
						<div class="form-group">
							<label for="txt_departmentlevel">仓库货架数</label> <input type="text"
								name="shelf" class="form-control" id="shelf" placeholder="巷道货架数">
						</div>
						<div class="form-group">
							<label for="txt_departmentlevel">仓库货位数</label> <input type="text"
								name="allocationnum" class="form-control" id="allocationnum"
								placeholder="巷道货位数">
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">
						<span class="glyphicon glyphicon-remove" aria-hidden="true"></span>关闭
					</button>
					<button type="button" id="btn_submit" class="btn btn-primary"
						data-dismiss="modal">
						<span class="glyphicon glyphicon-floppy-disk" aria-hidden="true"></span>保存
					</button>
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript">
		$("#tjstarf").click(function() {
			$("#myModalLabel").text("新增");
			$('#myModal').modal();

		});

			
			function deleteStatus(id){
				 bootbox.confirm("确认删除", function(result){ 
				    if(result === "" && result == null){
				    }else{
				    	alert(11);
				    	$.ajax({
				    		type:"post",
				    		url:"${pageContext.request.contextPath}/Wrehouse/deleteWrehouse",
				    		data:{"id":id},
				    		dataType:"json",
				    		success:function(data){
				    			if(data == 1){
				    				bootbox.alert("删除成功");
				    			}else{
				    				bootbox.alert("删除失败，请查看仓库是否还有货物");
				    			}
				    		}
				    	})
				    }
				});
			 };
			
			$("#btn_submit").click(function(){
				var wrehouseAddress = $("#wrehouseAddress").val();
				var wrehouseName = $("#wrehouseName").val();
				var wrehousePhone = $("#wrehousePhone").val();
				var roadway = $("#roadway").val();
				var shelf = $("#shelf").val();
				var allocationnum = $("#allocationnum").val();
				
				$.ajax({
					type:"post",
					url:"${pageContext.request.contextPath}/Wrehouse/addWrehosueInfo",
					data:{"wrehouseAddress":wrehouseAddress,"wrehouseName":wrehouseName,"wrehousePhone":wrehousePhone,"roadway":roadway,"shelf":shelf,"allocationnum":allocationnum},
					dataType:"json",
					success:function(data){
						if(data == 1){
							bootbox.alert("添加成功");
						}else{
							bootbox.alert("添加失败")
						}
						
					}
				})
			});
			
		
	</script>

</body>
</html>