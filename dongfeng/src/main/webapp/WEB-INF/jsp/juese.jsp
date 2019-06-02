<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
</style>
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
<body>
    <!-- 为ECharts准备一个具备大小（宽高）的Dom -->
     <script src="http://echarts.baidu.com/build/dist/echarts-all.js"></script>
    <div id="main" style="height:300px" ></div>
    <!-- ECharts单文件引入 -->
    <script type="text/javascript">
        // 基于准备好的dom，初始化echarts图表
        var myChart = echarts.init(document.getElementById('main')); 
        

        option = {
            title : {
                text: '东风物流公司',
                subtext: '管理角色结构'
            },
            tooltip : {
                trigger: 'axis'
            },
            legend: {
                orient : 'vertical',
                x : 'right',
                y : 'bottom',
                data:[]
            },
            toolbox: {
                show : true,
                feature : {
                    mark : {show: true},
                    dataView : {show: true, readOnly: false},
                    restore : {show: true},
                    saveAsImage : {show: true}
                }
            },
            polar : [
               {
                   indicator : [
                    { text: '管理员/总经理（Admin）', max: 20000},
                	               { text: '仓库主管（CangkuManager）', max: 16000},
                	               { text: '调度主管（DiaoduManager）', max: 16000},
                	               { text: '财务主管（MonneyManager）', max:160000 },
                	               { text: '人事主管（MonneyManager）', max:160000 },
                    ]
                }
            ],
            calculable : true,
            series : [
                {
                    name: '预算 vs 开销（Budget vs spending）',
                    type: 'radar',
                    data : [
                        {
                            value : [],
                            name : '（Allocated Budget）'
                        },
                         {
                            value : [],
                            name : '（Actual Spending）'
                        }
                    ]
                }
            ]
        };
        // 为echarts对象加载数据 
        myChart.setOption(option); 
    </script>
 <div class="container">

<table class="table table-striped table table-bordered table table-hover">
<tr>
			
				<th>id</th>
				<th>姓名</th>
				<th>用户名</th>
				<th>密码</th>
				<th>部门</th>
				<th>职位/角色</th>
				<th>操作</th>
				<th>操作</th>
				
			</tr>
		<c:forEach items="${selectjs}" var="js" >
				<tr>
				
				<th>${js.id }</th>
				<th>${js.name}</th>
				<th>${js.uname }</th>
				<th>${js.pwd }</th>
				<th>${js.ad}</th>
				<th>${js.position}</th>
				<th><a href="todelete?id=${js.id }">删除</a></th>
				<th><a href="toaddjs">添加</a></th>
				
			</tr>	
			</c:forEach>



</table>




</div>   
  
</body>


</html>