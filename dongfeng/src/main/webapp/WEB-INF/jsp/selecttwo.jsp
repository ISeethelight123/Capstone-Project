<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>员工表</title>
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
</head>
<body>
<div class="container">

<table class="table table-striped table table-bordered table table-hover">
<tr>
			
				<th>合同开始时间</th>
				<th>合同结束时间</th>
				<th>婚姻状态</th>
				<th>参保时间</th>
				<th>参保基数</th>
				<th>学历</th>
				<th>毕业院校</th>
				
			</tr>
		<c:forEach items="${selecthalf}" var="listl" >
				<tr>
				
					<td>${listl.starttimeofcon }</td>
					<td>${listl.endtimeofcon }</td>
					<td>${listl.marrystate }</td>
					<td>${listl.insuredtime }</td>
					<td>${listl.insuredmonney }</td>
					<td>${listl.aducationalbackgroud }</td>
					<td>${listl.school }</td>
					
			
			</tr>	
			</c:forEach>



</table>




</div>
</body>
</html>