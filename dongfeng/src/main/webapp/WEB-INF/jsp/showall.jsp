<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>员工管理表</title>
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
				<th>编号</th>
				<th>姓名</th>
				<th>职位</th>
				<th>性别</th>
				<th>手机号</th>
				<th>入职时间</th>
				<th>部门</th>
				<th>身份证</th>
				<th>出生日期</th>
				<th>年龄</th>
				<th>详细地址</th>
				<!-- <th>合同开始时间</th>
				<th>合同结束时间</th>
				<th>婚姻状态</th>
				<th>参保时间</th>
				<th>参保基数</th>
				<th>学历</th>
				<th>毕业院校</th> -->
				<th>操作</th>
				<th>操作</th>
				<th>操作</th>
				
			</tr>
		<c:forEach items="${selectall }" var="list" >
				<tr>
					<td>${list.id }</td>
					<td>${list.department }</td>
					<td>${list.position }</td>
					<td>${list.sex }</td>
					<td>${list.phonenum }</td>
					<td>${list.starttime }</td>
					<td>${list.endtime }</td>
					<td>${list.idcard }</td>
					<td>${list.borntime }</td>
					<td>${list.age }</td>
					<td>${list.adress }</td>
					<td><a href="toselecttwo?id=${list.id}">更多</a></td>
					<td><a>删除</a></td>
					<td><a>添加</a></td>
					<%-- <td>${list.starttimeofcon }</td>
					<td>${list.endtimeofcon }</td>
					<td>${list.marrystate }</td>
					<td>${list.insuredtime }</td>
					<td>${list.insuredmonney }</td>
					<td>${list.aducationalbackgroud }</td>
					<td>${list.school }</td> --%>
					
					
			</tr>	
			</c:forEach>



</table>




</div>
</body>
</html>