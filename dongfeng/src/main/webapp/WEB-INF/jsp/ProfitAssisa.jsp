<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>财务折现图</title>
<link rel="stylesheet" type="text/css"
	href="../static/css/bootstrap.min.css" />
<script type="text/javascript" src="../static/qyqjs/echarts-all.js"></script>
<script type="text/javascript" src="../static/qyqjs/echarts.js"></script>
<script type="text/javascript" src="../static/qyqjs/jquery-1.11.0.js"></script>
</head>
<style>
	#lr{
		position: absolute;
		left: 78px;
		top: 84px;
	}
	#income{
		position: absolute;
		left: 534px;
		top: 84px;
	}
	#ex{
		position: absolute;
		left: 1031px;
		top: 84px;
	}
</style>
<body>
	<div id="lr">
		<h3>利润走向图</h3>
		<div id="chart" style="width: 400px; height: 400px;"></div>
	</div>
	<div id="income">
		<h3>收入走向图</h3>
		<div id="chart1" style="width: 400px; height: 400px;"></div>
	</div>
	<div id="ex">
		<h3>支出走向图</h3>
		<div id="chart2" style="width: 400px; height: 400px;"></div>
	</div>
	<script type="text/javascript">
		// 初始化图表标签
		var myChart = echarts.init(document.getElementById('chart'));
		var option = {
			xAxis : {
				type : 'category',
				data :	${monthList}
			},
			yAxis : {
				type : 'value'
			},
			series : [ {
				data : ${pList},
				type : 'line'
			} ]
		};
		myChart.setOption(option);
	</script>
	<script type="text/javascript">
		// 初始化图表标签
		var myChart = echarts.init(document.getElementById('chart1'));
		var option = {
			xAxis : {
				type : 'category',
				data :	${monthList}
			},
			yAxis : {
				type : 'value'
			},
			series : [ {
				data : ${inList},
				type : 'line'
			} ]
		};
		myChart.setOption(option);
	</script>
	<script type="text/javascript">
		// 初始化图表标签
		var myChart = echarts.init(document.getElementById('chart2'));
		var option = {
			xAxis : {
				type : 'category',
				data :	${monthList}
			},
			yAxis : {
				type : 'value'
			},
			series : [ {
				data : ${exList},
				type : 'line'
			} ]
		};
		myChart.setOption(option);
	</script>
</body>
</html>