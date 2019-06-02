<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>入库单增加</title>
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
<body>
	<!-- 入库：入库单号，订单号，位置 -->
	<div class="container">
		<button type="button" class="btn btn-success" onclick="javascript:history.back(-1);">返回</button>
		<h3>填写入库单</h3>
		
			<input name="wrehouseId" value="${id }" id="wrehouseId"  type="hidden"/><br>
			<div class="form-group" style="margin-left: 15px;width: 200px;">
				<label for="exampleInputEmail2">订单号*</label> <br>
				<select name="orderId" class="form-control" id="orderId">
					<c:forEach items="${orderList }" var="ord">
						<option>${ord.orderId }</option>
					</c:forEach>
				</select> <br>
				
				<label for="exampleInputEmail2">巷道*</label> <br>
				<select name="allocationId" class="form-control" id="roadway">
					<c:forEach items="${roadway }" var="roadway">
						<option>${roadway }</option>
					</c:forEach>
				</select>
				<br>
				<label for="exampleInputEmail2">货架*</label> <br>
				<select name="allocationId" class="form-control" id="shelf">
					<c:forEach items="${shelf }" var="shelf">
						<option>${shelf }</option>
					</c:forEach>
				</select>
				<br>
				<label for="exampleInputEmail2">货位*</label> <br>
				<select name="allocationId" class="form-control" id="allocationId">
					<c:forEach items="${allocationList }" var="allocationList">
						<option>${allocationList }</option>
					</c:forEach>
				</select>
				<br>
				<button class="btn btn-default" id="addButton">入库</button>
			</div>
	</div>

	<script type="text/javascript">
		$('button').click(function(){
			$('button').addClass('disabled');
		});
		
		$("#addButton").click(function(){
			var wrehouseId = $("#wrehouseId").val();
			var orderId = $("#orderId").val();
			var roadway = $("#roadway").val();
			var shelf = $("#shelf").val();
			var allocationId = $("#allocationId").val();
			/* alert("allocationId"+allocationId);
			alert("wrehouseId"+wrehouseId);
			alert("orderId"+orderId); */
			$.ajax({
				type:"post",
				data:{
					"wrehouseId":wrehouseId,
					"orderId":orderId,
					"allocationId":allocationId,
					"shelf":shelf,
					"roadway":roadway},
				dataType:"json",
				url:"${pageContext.request.contextPath}/ourderCon/addInWre",
				success:function(data){
					if(data == 1){
						bootbox.alert("添加成功", function(){ 
							var link = "${pageContext.request.contextPath}/ourderCon/showOrderInfo?id="+wrehouseId;
							window.location.href = link;
						});
						
					}else{
						bootbox.alert("添加失败", function(){ 
						});
					}
				}
			})
		});
	</script>

</body>
</html>