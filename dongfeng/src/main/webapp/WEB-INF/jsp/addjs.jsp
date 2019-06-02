<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
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
	<form action="${pageContext.request.contextPath }/toaddjsjs">
		<div class="form-group" style="width: 200px;">
			<label for="exampleInputEmail1">请输入员工姓名</label> <input type="text"
				class="form-control" id="exampleInputEmail1" name="name">
		</div>
		<div class="form-group"style="width: 200px;">
			<label for="exampleInputEmail1">请输入用户账户</label> <input type="text"
				class="form-control" id="exampleInputEmail1"name="uname">
		</div>

		<div class="form-group"style="width: 200px;">
			<label for="exampleInputEmail1">请输入用户密码</label> <input type="text"
				class="form-control" id="exampleInputEmail1"name="pwd">
		</div>
		<div class="form-group"style="width: 200px;">
			<label for="exampleInputEmail1">请输入用户部门</label> <input type="text"
				class="form-control" id="exampleInputEmail1"name="ad">
		</div>
		<div class="form-group"style="width: 200px;">
			<label for="exampleInputEmail1">请输入用户职位</label> <input type="text"
				class="form-control" id="exampleInputEmail1"name="position">
		</div>
		<div class="form-group"style="width: 200px;">
			<div class="col-sm-offset-2 col-sm-10">
				<button type="submit" class="btn btn-default">add</button>
			</div>
		</div>
	</form>



</body>
</html>