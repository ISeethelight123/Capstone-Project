<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>展示财务信息</title>
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
	<div class="container" style="margin-top: 50px">
		<table
			class="table table-striped table table-bordered table table-hover"
			style="margin-top: 30px; text-align: center;">
			<tr>
				<th>编号</th>
				<th>收入</th>
				<th>支出</th>
				<th>利润</th>
				<th>时间</th>
			</tr>
			<c:forEach items="${list }" var="pre">
				<tr>
					<td>${pre.no }</td>
					<td>${pre.income }</td>
					<td>${pre.expenses }</td>
					<td>${pre.profit }</td>
					<td>${pre.month }</td>
				</tr>
			</c:forEach>
		</table>
	</div>




</body>
</html>