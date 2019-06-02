<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>出库库表</title>

<!-- 引入bootstrap的核心文件 -->
<link rel="stylesheet" type="text/css"
	href="../static/css/bootstrap.min.css" />

<!-- 引入jqury-->
<script type="text/javascript" src="../static/js/jquery-1.11.0.js"></script>

<!-- 引入bootstrap的核心js文件  -->
<script type="text/javascript" src="../static/js/bootstrap.js"></script>

<script type="text/javascript" src="../static/js/bootbox.js"></script>

<script src="../static/js/bootstrap-dialog.js" type="text/javascript"
	charset="utf-8"></script>

<script src="../static/js/bootstrap-dialog.min.js"
	type="text/javascript" charset="utf-8"></script>

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
			action="${pageContext.request.contextPath}/outWrhouse/selectRequire">
			<div class="form-group" style="margin-left: 15px;">
				<label for="exampleInputEmail2">请输入单号*</label> <input type="text"
					class="form-control" id="exampleInputEmail2" name="id">
			</div>
			<button type="submit" class="btn btn-default">查询</button>
		</form>
		<div id="tj">
			<button class="btn btn-default" onclick="showOWInfo();">增加</button>
		</div>
		<table
			class="table table-striped table table-bordered table table-hover"
			style="margin-top: 30px; text-align: center;">

			<tr>
				<th style="text-align: center;">编号</th>
				<th style="text-align: center;">出库单单号</th>
				<th style="text-align: center;">订单号</th>
				<th style="text-align: center;">出库时间</th>
				<th style="text-align: center;">仓库</th>
				<th style="text-align: center;">操作</th>
			</tr>

			<c:forEach items="${list }" var="outwre" varStatus="status">
				<tr>
					<td>${status.index }+1</td>
					<td>${outwre.outwerhouseId }</td>
					<td>${outwre.orderId }</td>
					<td>${outwre.outtime }</td>
					<td>${outwre.wrehouseId }</td>
					<td>
						<button class="btn btn-default"
							onclick="udOutWre(${outwre.outwerhouseId });">修改</button>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>

	<script type="text/javascript">
		function showOWInfo(){
			bootbox.prompt("请输入要操作的仓库", function (result) {
				var link = "${pageContext.request.contextPath}/outWrhouse/showOutWreInfo?id="+result;
				window.location.href = link;
			})
		};
		
		function udOutWre(data){
			bootbox.prompt("请输入订单号", function (result) {
                var strResult = result;
				$.ajax({
					url:"${pageContext.request.contextPath}/outWrhouse/udoutWreInfo",
					data:{"id":id,"orderId":strResult},
					dataType:"json",
					type:"post",
					success:function(data){
						if(data == 1){
							bootbox.alert("修改成功！");
							
						}else{
							bootbox.alert("修改失败");
						}
					}
				})
			})
		};
	</script>


</body>

</html>