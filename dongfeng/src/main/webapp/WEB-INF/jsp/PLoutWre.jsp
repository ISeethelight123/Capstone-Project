<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>增加出库</title>
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
	
	<div class="container" >
		<h3>填写出库单</h3>
		<input type="hidden" name="wrehouseId" value="${id }" id="wrehouseId" />
		<div class="form-group" style="margin-left: 15px; width: 200px">
			<label for="exampleInputEmail2">订单号*</label> <br>
			<select name="orderId" class="form-control" id="orderId">
				<c:forEach items="${list }" var="ord">
					<option>${ord.orderId }</option>
				</c:forEach>
			</select> 
			<br>
			<label for="exampleInputEmail2">货物位置</label> <br><br>
			<label for="exampleInputEmail2">巷道*</label> <br>
			<input type="text" class="form-control" id="roadway" value="0" style="width: 200px"><br>
			<label for="exampleInputEmail2">货架*</label> <br>
			<input type="text" class="form-control" id="shelf" value="0" style="width: 200px;"><br>
			<label for="exampleInputEmail2">货位*</label> <br>
			<input type="text" class="form-control" id="allocation" value="0" style="width: 200px;"><br>
			
			<button  class="btn btn-default"  onclick="aa();">查询</button>
			<button  class="btn btn-default" onclick="outW();">出库</button>
		</div>
		

	</div>
	<script type="text/javascript">
		
		function aa(){
			var orderId = $("#orderId").val();
			var wrehouseId = $("#wrehouseId").val();
			/* alert(wrehouseId); */
			$.ajax({
				data:{"orderId":orderId,"wrehouseId":wrehouseId},
				dataType:"json",
				url:"${pageContext.request.contextPath}/outWrhouse/showOWreAlloInfo",
				type:"post",
				success: function(data){
					$.each(data,function(index,val){
						var name1 = data[index].roadway;
						var name2 = data[index].shelf;
						var name3 = data[index].allocation;
						/* alert("name1="+name1+"name2="+name2+"name3="+name3); */
						$("#roadway").val(name1);
						$("#shelf").val(name2);
						$("#allocation").val(name3);
					})
				}
			})
		};
		
		function outW(){
			var wrehouseId = $("#wrehouseId").val();
			var orderId = $("#orderId").val();
			var roadway = $("#roadway").val();
			var shelf = $("#shelf").val();
			var allocation = $("#allocation").val();
			/* alert("wrehouseId--"+wrehouseId+"--orderId--"+orderId+"--roadway--"+roadway+"--shelf--"+shelf+"--allocation--"+allocation);
 */			$.ajax({
				type:"post",
				data:{
					"wrehouseId":wrehouseId,
					"orderId":orderId,
					"roadway":roadway,
					"shelf":shelf,
					"allocation":allocation},
				dataType:"json",
				url:"${pageContext.request.contextPath}/outWrhouse/addOutWreInfo",
				success:function(data){
					if(data == 1){
						bootbox.alert("添加成功", function(){ 
							var link = "${pageContext.request.contextPath}/outWrhouse/showOutWreInfo?id="+wrehouseId;
							window.location.href = link;
						});
					}else{
						bootbox.alert("添加失败", function(){ 
							var link = "${pageContext.request.contextPath}/outWrhouse/showOutWreInfo?id="+wrehouseId;
							window.location.href = link;
						});
					}
				}
			})
		};
	</script>
</body>
</html>