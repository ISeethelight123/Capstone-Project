<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
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
</head>
<body>
<div class="container">

<table class="table table-striped table table-bordered table table-hover">
<tr>
				<th>id</th>
				<th>姓名</th>
				<th>职位</th>
				<th>权限状态</th>
				<th>操作</th>
				<th>操作</th>
				
			</tr>
		<c:forEach items="${powerMap}" var="product" >
				<tr>
				
				<th>${product.id }</th>
				<th>${product.name}</th>
				<th>${product.position }</th>
				<th>${product.rid }</th>
				<th><a href="toupdatepower?id=${product.id }">添加权限</a></th>
				<th><a href="todeletepower?id=${product.id }">删除权限</a></th>
			</tr>	
			</c:forEach>



</table>




</div>   
</body>
</html>