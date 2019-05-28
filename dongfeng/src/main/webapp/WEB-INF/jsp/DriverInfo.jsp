<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title>仓库信息管理页面</title>
		
		<!-- 引入bootstrap的核心文件 -->
		<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />

		<!-- 引入jqury-->
		<script type="text/javascript" src="js/jquery-1.11.0.js"></script>

		<!-- 引入bootstrap的核心js文件  -->
		<script type="text/javascript" src="js/bootstrap.js"></script>

		<script src="js/bootstrap-dialog.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/bootstrap-dialog.min.js" type="text/javascript" charset="utf-8"></script>

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
			<form class="form-inline" action="">
				<select name="wreSel_qyq" class="form-control">
					<option>仓库编号查询</option>
					<option>仓库地址查询</option>
				</select>
				<div class="form-group" style="margin-left: 15px;">
					<label for="exampleInputEmail2">请输入</label> <input type="text" class="form-control" id="exampleInputEmail2">
				</div>
				<button type="submit" class="btn btn-default">查询</button>
			</form>
			<div id="tj">
				<button class="btn btn-default" id="tjstarf">添加</button>
			</div>
			<table class="table table-striped table table-bordered table table-hover" style="margin-top: 30px;text-align: center;">
				<tr>
					<th style="text-align: center;">编号</th>
					<th style="text-align: center;">仓库编号</th>
					<th style="text-align: center;">仓库地址</th>
					<th style="text-align: center;">仓库电话</th>
					<th style="text-align: center;">仓库占比</th>
					<th style="text-align: center;">操作</th>
				</tr>
				<tr>
					<td>1</td>
					<td>210000</td>
					<td>湖北省</td>
					<td>010-1010101</td>
					<td>12%</td>
					<td>
						<button class="btn btn-default" id="deleteStarf">删除</button>
						<a class="btn btn-default">修改</a>
					</td>
				</tr>

			</table>
		</div>
		<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
						<h4 class="modal-title" id="myModalLabel">新增员工</h4>
					</div>
					<div class="modal-body">

						<div class="form-group">
							<label for="txt_parentdepartment">仓库编号</label>
							<input type="text" name="txt_parentdepartment" class="form-control" id="txt_parentdepartment" placeholder="仓库编号">
						</div>
						<div class="form-group">
							<label for="txt_departmentlevel">仓库地址</label>
							<input type="text" name="txt_departmentlevel" class="form-control" id="txt_departmentlevel" placeholder="仓库地址">
						</div>
						<div class="form-group">
							<label for="txt_departmentlevel">仓库电话</label>
							<input type="text" name="txt_departmentlevel" class="form-control" id="txt_departmentlevel" placeholder="仓库电话">
						</div>
						<div class="form-group">
							<label for="txt_departmentlevel">仓库巷道数</label>
							<input type="text" name="txt_departmentlevel" class="form-control" id="txt_departmentlevel" placeholder="仓库巷道数">
						</div>
						<div class="form-group">
							<label for="txt_departmentlevel">仓库货架数</label>
							<input type="text" name="txt_departmentlevel" class="form-control" id="txt_departmentlevel" placeholder="仓库巷道数">
						</div>
						<div class="form-group">
							<label for="txt_departmentlevel">仓库货位数</label>
							<input type="text" name="txt_departmentlevel" class="form-control" id="txt_departmentlevel" placeholder="仓库巷道数">
						</div>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span>关闭</button>
						<button type="button" id="btn_submit" class="btn btn-primary" data-dismiss="modal"><span class="glyphicon glyphicon-floppy-disk" aria-hidden="true"></span>保存</button>
					</div>
				</div>
			</div>
		</div>
		<script type="text/javascript">
			$("#tjstarf").click(function() {
				$("#myModalLabel").text("新增");
				$('#myModal').modal();

			});

			$("#deleteStarf").click(function(funcclose, funcok) {
				BootstrapDialog.confirm({
					title: '确认',
					message: '是否删除',
					type: BootstrapDialog.TYPE_WARNING, // <-- Default value is
					// BootstrapDialog.TYPE_PRIMARY
					closable: true, // <-- Default value is false，点击对话框以外的页面内容可关闭
					draggable: true, // <-- Default value is false，可拖拽
					btnCancelLabel: '取消', // <-- Default value is 'Cancel',
					btnOKLabel: '确定', // <-- Default value is 'OK',
					btnOKClass: 'btn-warning', // <-- If you didn't specify it, dialog type
					size: BootstrapDialog.SIZE_SMALL,
					// 对话框关闭的时候执行方法
					/*onhide: funcclose,
					callback: function(result) {
						// 点击确定按钮时，result为true
						if(result) {
							// 执行方法
							funcok.call();
						}
					}*/
				});
			})

			/*function funcclose() {

			}

			function funcok() {
				BootstrapDialog.show({
					type: BootstrapDialog.TYPE_SUCCESS,
					title: '成功 ',
					message: str,
					size: BootstrapDialog.SIZE_SMALL,
					buttons: [{
						label: '确定',
						action: function(dialogItself) {
							dialogItself.close();
						}
					}];

				});*/
		</script>
		
	</body>
</html>
