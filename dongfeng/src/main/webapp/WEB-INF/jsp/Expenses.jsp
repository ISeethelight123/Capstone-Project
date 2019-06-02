<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>

<!-- 引入bootstrap的核心文件 -->
<link rel="stylesheet" type="text/css"
	href="../static/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css"
	href="../static/qyqjs/bootstrap-datetimepicker.min.css" />

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
<script src="../static/qyqjs/bootstrap-datetimepicker.min.js"
	type="text/javascript" charset="utf-8"></script>

<meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
	<div class="container" style="margin-top: 50px">
		<h4>支出详情单</h4>
		<a class="btn btn-default"
			href="${pageContext.request.contextPath}/profit/insertexpenses"
			style="float: right;">添加</a>
		<table
			class="table table-striped table table-bordered table table-hover"
			style="margin-top: 30px; text-align: center;">
			<tr>
				<th>编号</th>
				<th>金额</th>
				<th>名称</th>
				<th>说明</th>
				<th>时间</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${list }" var="pre">
				<tr>
					<td>${pre.no }</td>
					<td>${pre.expensesMoney}</td>
					<td>${pre.expensesName }</td>
					<td>${pre.expensesDsec }</td>
					<td>${pre.expensesTime }</td>
					<td>
						<button class="btn btn-default" onclick="deleteEX(${pre.no});">删除</button>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>

	<script type="text/javascript">
		function deleteEX(no){
			 bootbox.confirm("确认删除", function(result){ 
				 if(result === "" && result == null){
				 }else{
					 $.ajax({
							url:"${pageContext.request.contextPath}/profit/deleteEX",
							data:{"no":no},
							dataType:"json",
							type:"post",
							success:function(data){
								if(data == 1){
									bootbox.alert("删除成功", function(){ 
										var link = "${pageContext.request.contextPath}/profit/expenses";
										window.location.href = link;
									});
								}else{
									bootbox.alert("删除失败", function(){ 
										var link = "${pageContext.request.contextPath}/profit/expenses";
										window.location.href = link;
									});
								} 
							}
							
						})
				 	}
			 	})
			};
			
	</script>

</body>
</html>