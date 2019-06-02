<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
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
	<div class="container"
		style="margin-top: 50px; width: 200px; position: absolute; left: 100px;">
		<h4>填写支出单</h4>
		<div class="form-group">
			<label for="exampleInputEmail1">请输入支出金额</label> <input type="text"
				class="form-control" id="money" name="expensesMoney">
		</div>
		<div class="form-group">
			<label for="exampleInputPassword1">请输入支出名称</label> <input type="text"
				class="form-control" id="name" name="expensesName">
		</div>
		<div class="form-group">
			<label for="exampleInputPassword1">请输入支出时间</label> <input type="text"
				class="form-control" id="time" name="expensesTime">
		</div>
		<div class="form-group">
			<label for="exampleInputPassword1">描述</label> <input type="text"
				class="form-control" id="desc" name="expensesDsec">
		</div>
		<button class="btn btn-default" onclick="allExpese();">添加</button>
	</div>
	<script type="text/javascript">
	　$("#time").datetimepicker({//选择年月日
	　　　　　　format: 'yyyy-mm-dd',
	　　　　　　language: 'zh-CN',
	　　　　　　weekStart: 1,
	　　　　　　todayBtn: 1,//显示‘今日’按钮
	　　　　　　autoclose: 1,
	　　　　　　todayHighlight: 1,
	　　　　　　startView: 2,
	　　　　　　minView: 2,  //Number, String. 默认值：0, 'hour'，日期时间选择器所能够提供的最精确的时间选择视图。
	　　　　　　clearBtn:true,//清除按钮
	　　　　　　forceParse: 0
	　　　　});
	$('#time').focus(function(){
	　　　　　　$(this).blur();//不可输入状态
	　　　　});
		
		function allExpese(){
			var money = $("#money").val();
			var name = $("#name").val();
			var time = $("#time").val();
			var desc = $("#desc").val();
			/* alert(money+name+time+desc); */
			$.ajax({
				url:"${pageContext.request.contextPath}/profit/addExpense",
				data:{"expensesMoney":money,"expensesName":name,"expensesTime":time,"expensesDsec":desc},
				dataType:"json",
				type:"post",
				success:function(data){
					/* alert(data); */
					if(data == 1){
						bootbox.alert("添加成功", function(){ 
							var link = "${pageContext.request.contextPath}/profit/expenses";
							window.location.href = link;
						});
					}else{
						bootbox.alert("添加失败", function(){ 
							var link = "${pageContext.request.contextPath}/profit/expenses";
							window.location.href = link;
						});
					} 
				}
			})
		};
	</script>

</body>
</html>