<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport" content="initial-scale=1.0, user-scalable=no" />
<title>仓库库存主页</title>
<script type="text/javascript" src="../static/qyqjs/echarts-all.js"></script>
<script type="text/javascript" src="../static/qyqjs/echarts.js"></script>
<script type="text/javascript" src="../static/qyqjs/jquery-1.11.0.js"></script>

<script type="text/javascript"
	src="http://api.map.baidu.com/api?v=2.0&ak=b7OBL3MBVZVIQwKWG3goQ0wPk3MQpHUV"></script>
</head>
<style type="text/css">
body, html, #allmap {
	/*display: inline-block;*/
	width: 800px;
	height: 500px;
	/*overflow: hidden;*/
	margin: 0;
	font-family: "微软雅黑";
	margin: 15px 0 0 10px;
}
</style>
<body>
	<!-- 百度地图的容器 -->
	<div id="allmap"></div>
	<!--  为 ECharts 准备一个具备大小（宽高）的 DOM 柱形图 -->
	<div id="second"
		style="width: 400px; height: 400px; position: absolute; left: 860px; top: 20px;"></div>

	<script type="text/javascript">
		var myChart = echarts.init(document.getElementById('second'));
		// 显示标题，图例和空的坐标轴
		myChart.setOption({
			title : {
				text : '仓库订单显示'
			},
			tooltip : {},
			legend : {
				data : [ '订单量' ]
			},
			xAxis : {
				type: 'category',
				data : [] ,
				axisLabel : {
					rotate:-15,
					interval : 0,
				},
			},
			  grid:{
				  y2:150,
                  left:5,
                  right:20,
                  top:80,
                  bottom:50,
                  containLabel:true,
              },
			yAxis : {},
			series : [ {
				name : '订单量',
				type : 'bar',
				data : []
			} ]
		});

		var names = []; //类别数组（实际用来盛放X轴坐标值）
		var nums = []; //销量数组（实际用来盛放Y坐标值
		
		<%List<String> listx = (List<String>) request.getAttribute("listx");
			for (String str : listx) {%>
		names.push("<%=str%>");	
		<%}%>
		/* alert(names);  */
		
		myChart.hideLoading(); //隐藏加载动画
		myChart.setOption({ //加载数据图表
			xAxis : {
				data : names
			},
			series : [ {
				// 根据名字对应到相应的系列
				name : '订单量',
				data : ${listy}
			} ]
		});
	</script>
	<script type="text/javascript">
	var map = new BMap.Map("allmap");
	var point = new BMap.Point(114.311754, 30.598604);
	map.centerAndZoom(point, 9);
	var marker = new BMap.Marker(point);
	/* var mapPoints = [{
			y: 114.311754,
			x: 30.598604
		},
		{
			y: 121.480248,
			x: 31.236276
		}, //上海市政府
		{
			y: 113.270758,
			x: 23.135589
		}, //广州市政府,
		{
			y: 113.631557,
			x: 34.75261
		} //郑州市政府
	]; */
	 var mapPoints = ${string}; 
	
	var i = 0;
	map.addOverlay(marker);
	map.enableScrollWheelZoom(true);
	// 函数 创建多个标注
	function markerFun(points) {
		var markers = new BMap.Marker(points);
		map.addOverlay(markers);
	}
	for(; i < mapPoints.length; i++) {
		var points = new BMap.Point(mapPoints[i].y, mapPoints[i].x); //创建坐标点
		markerFun(points);
	};
	var opts = {};
	map.addControl(new BMap.NavigationControl(opts));
	
	</script>
</body>
</html>