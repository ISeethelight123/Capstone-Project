<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>后台管理系统</title>
<link rel="stylesheet" type="text/css"
	href="../static/css/admin-all.css" />
<link rel="stylesheet" type="text/css" href="../static/css/base.css" />
<link rel="stylesheet" type="text/css"
	href="../static/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css"
	href="../static/css/jquery-ui-1.8.22.custom.css" />
<script type="text/javascript" src="../static/js/jquery-1.7.2.js"></script>
<script type="text/javascript"
	src="../static/js/jquery-ui-1.8.22.custom.min.js"></script>
<script type="text/javascript" src="../static/js/index.js"></script>
<script type="text/javascript" src="../static/js/accordion.js"></script>
</head>

<body>
	<div class="warp">
		<!--头部开始-->
		<div class="top_c">
			<div class="top-menu">
				<ul class="top-menu-nav">
					<li><a target="Conframe" href="index1.html">首页</a></li>
					<li><a href="tab.html" target="Conframe">公司任务</a></li>
					<li><a href="yuangong.html" target="Conframe">员工管理</a></li>
					<li><a href="gongzi_list.html" target="Conframe">账目管理</a></li>
					<li><a href="admin_manage.html" target="Conframe">角色设置</a></li>
				</ul>
			</div>
			<!--头部结束-->
			<!--左边菜单开始-->
			<div class="left_c left tg">
				<h1>系统操作菜单</h1>
				<script type="text/javascript">
					$(function() {
						$(".nav").accordion({
							//accordion: true,
							speed: 500,
							closedSign: '[+]',
							openedSign: '[-]'
						});
					});
				</script>

				<style>
					ul {
						list-style: none
					}
					
					.demo {
						padding: 10px;
						background: #f7f7f7;
						overflow: hidden;
					}
					
					.nav {
						padding: 40px 28px 25px 0;
						font-family: "Microsoft yahei", Arial, Helvetica, sans-serif;
					}
					
					ul.nav {
						padding: 0;
						margin: 0;
						font-size: 13px;
						line-height: 0.5em;
						list-style: none;
					}
					
					ul.nav li {
						border: 1px solid #ccc;
						margin: 3px 0;
						border-radius: 5px;
					}
					
					ul.nav li a {
						line-height: 10px;
						font-size: 14px;
						padding: 10px 5px;
						color: #0088cc;
						display: block;
						text-decoration: none;
					}
					
					ul.nav li a:hover {
						background-color: #675C7C;
						color: white;
					}
					
					ul.nav ul {
						margin: 0;
						padding: 0;
						display: none;
						border-top: 1px solid #ccc;
					}
					
					ul.nav ul li {
						margin: 0;
						padding: 0;
						clear: both;
						background: url(icon-forward.png) left center no-repeat;
						border: none;
					}
					
					ul.nav ul li a {
						padding-left: 20px;
						font-size: 12px;
						font-weight: normal;
					}
					
					ul.nav ul li a:hover {
						background-color: #D3C99C;
						color: #675C7C;
					}
					
					ul.nav ul ul li a {
						color: silver;
						padding-left: 40px;
					}
					
					ul.nav ul ul li a:hover {
						background-color: #D3CEB8;
						color: #675C7C;
					}
					
					ul.nav span {
						float: right;
					}
				</style>

				<div class="demo">
					<ul class="nav">
						<li>
							<a href="#" target="_blank">员工管理</a>
							<ul>
								<li class="active">
									<a target="Conframe" href="starfInfo.html">员工信息管理</a>
								</li>
							</ul>
						</li>
						<li>
							<a href="#">权限管理</a>
							<ul>
								<li><b class="tip"></b>
									<a target="Conframe" href="fangyuan.html">权限列表</a>
								</li>
								<li><b class="tip"></b>
									<a target="Conframe" href="zufanglie.html">角色列表</a>
								</li>
							</ul>
						</li>
						<li>
							<a href="#">仓库管理</a>
							<ul>
								<li><b class="tip"></b>
									<a target="Conframe" href="/connect3ion/goWrehouseInfo">仓库信息管理</a>
								</li>
								<li><b class="tip"></b>
									<a target="Conframe" href="/connection/goInWrehouse">入库管理</a>
								</li>
								<li><b class="tip"></b>
									<a target="Conframe" href="/connection/goOutWrehouse">出库管理</a>
								</li>
							</ul>
						</li>
						<li>
							<a href="#">车辆管理</a>
							</a>
							<ul>
								<li><b class="tip"></b>
									<a target="Conframe" href="car/CarInfo">车辆信息管理</a>
								</li>
								<li><b class="tip"></b>
									<a target="Conframe" href="driver/DriverInfo">司机信息管理</a>
								</li>
							</ul>
						</li>
						<li>
							<a href="#">路线管理</a>
							</a>
							<ul>
								<li><b class="tip"></b>
									<a target="Conframe" href="yuangong.html">路线信息管理</a>
								</li>
								<li><b class="tip"></b>
									<a target="Conframe" href="kaoqin_list.html">新增路线</a>
								</li>
								<li><b class="tip"></b>
									<a target="Conframe" href="zhaopin_list.html">修改路线</a>
								</li>
							</ul>
						</li>
						<li>
							<a href="#">调度管理</a>
							</a>
							<ul>
								<li><b class="tip"></b>
									<a target="Conframe" href="Schedule/manageSchedule/manageSchedule">调度单管理</a>
								</li>
								<li><b class="tip"></b>
									<a target="Conframe" href="Schedule/createSchedule/createSchedule">新增调度单</a>
								</li>
								<li><b class="tip"></b>
									<a target="Conframe" href="waybil/waybil">新增运单</a>
								</li>
							</ul>
						</li>
						<li>
							<a href="#">订单管理</a>
							</a>
							<ul>
								<li><b class="tip"></b>
									<a target="Conframe" href="OrderInfo.html">订单信息管理</a>
								</li>
								<li><b class="tip"></b>
									<a target="Conframe" href="InsertOrder.html">新增订单</a>
								</li>
							</ul>
						</li>
						<li>
							<a href="#">财务管理</a>
							</a>
							<ul>
								<li><b class="tip"></b>
									<a target="Conframe" href="yuangong.html">收入</a>
								</li>
								<li><b class="tip"></b>
									<a target="Conframe" href="kaoqin_list.html">支出</a>
								</li>
								<li><b class="tip"></b>
									<a target="Conframe" href="zhaopin_list.html">利润及分析</a>
								</li>
							</ul>
						</li>
					</ul>
				</div>
				<div id="datepicker"></div>

			<div class="top-nav">
				上午好，欢迎您，admin！&nbsp;&nbsp; <a href="#">修改密码</a> | <a href="#">安全退出</a>
			</div>
		</div>
		<!--头部结束-->
		<!--左边菜单开始-->
		<div class="left_c left tg">
			<h1>系统操作菜单</h1>
			<script type="text/javascript">
				$(function() {
					$(".nav").accordion({
						//accordion: true,
						speed : 500,
						closedSign : '[+]',
						openedSign : '[-]'
					});
				});
			</script>

			<style>
ul {
	list-style: none
}

.demo {
	padding: 10px;
	background: #f7f7f7;
	overflow: hidden;
}

.nav {
	padding: 40px 28px 25px 0;
	font-family: "Microsoft yahei", Arial, Helvetica, sans-serif;
}

ul.nav {
	padding: 0;
	margin: 0;
	font-size: 13px;
	line-height: 0.5em;
	list-style: none;
}

ul.nav li {
	border: 1px solid #ccc;
	margin: 3px 0;
	border-radius: 5px;
}

ul.nav li a {
	line-height: 10px;
	font-size: 14px;
	padding: 10px 5px;
	color: #0088cc;
	display: block;
	text-decoration: none;
}

ul.nav li a:hover {
	background-color: #675C7C;
	color: white;
}

ul.nav ul {
	margin: 0;
	padding: 0;
	display: none;
	border-top: 1px solid #ccc;
}

ul.nav ul li {
	margin: 0;
	padding: 0;
	clear: both;
	background: url(icon-forward.png) left center no-repeat;
	border: none;
}

ul.nav ul li a {
	padding-left: 20px;
	font-size: 12px;
	font-weight: normal;
}

ul.nav ul li a:hover {
	background-color: #D3C99C;
	color: #675C7C;
}

ul.nav ul ul li a {
	color: silver;
	padding-left: 40px;
}

ul.nav ul ul li a:hover {
	background-color: #D3CEB8;
	color: #675C7C;
}

ul.nav span {
	float: right;
}
</style>

			<div class="demo">
				<ul class="nav">
					<li><a href="#" target="_blank">员工管理</a>
						<ul>
							<li class="active"><a target="Conframe"
								href="starfInfo.html">员工信息管理</a></li>
						</ul></li>
					<li><a href="#">权限管理</a>
						<ul>
							<li><b class="tip"></b> <a target="Conframe"
								href="fangyuan.html">权限列表</a></li>
							<li><b class="tip"></b> <a target="Conframe"
								href="zufanglie.html">角色列表</a></li>
						</ul></li>
					<li><a href="#">仓库管理</a>
						<ul>
							<li><b class="tip"></b> <a target="Conframe"
								href="/connection/goWrePerent">仓库信息展示</a></li>
							<li><b class="tip"></b> <a target="Conframe"
								href="/connection/goWrehouseInfo">仓库信息管理</a></li>
							<li><b class="tip"></b> <a target="Conframe"
								href="/connection/goInWrehouse">入库管理</a></li>
							<li><b class="tip"></b> <a target="Conframe"
								href="/connection/goOutWrehouse">出库管理</a></li>
						</ul></li>
					<li><a href="#">车辆</a>
						<ul>
							<li><b class="tip"></b> <a target="Conframe"
								href="CarInfo.html">车辆信息管理</a></li>
							<li><b class="tip"></b> <a target="Conframe"
								href="CarInfo.html">司机信息管理</a></li>
						</ul></li>
					<li><a href="#">路线管理</a>
						<ul>
							<li><b class="tip"></b> <a target="Conframe"
								href="yuangong.html">路线信息管理</a></li>
							<li><b class="tip"></b> <a target="Conframe"
								href="kaoqin_list.html">新增路线</a></li>
							<li><b class="tip"></b> <a target="Conframe"
								href="zhaopin_list.html">修改路线</a></li>
						</ul></li>
					<li><a href="#">调度管理</a>
						<ul>
							<li><b class="tip"></b> <a target="Conframe"
								href="yuangong.html">调度信息查询</a></li>
							<li><b class="tip"></b> <a target="Conframe"
								href="kaoqin_list.html">调度单管理</a></li>
							<li><b class="tip"></b> <a target="Conframe"
								href="zhaopin_list.html">新增调度单</a></li>
						</ul></li>
					<li><a href="#">订单管理</a>
						<ul>
							<li><b class="tip"></b> <a target="Conframe"
								href="OrderInfo.html">订单信息管理</a></li>
							<li><b class="tip"></b> <a target="Conframe"
								href="InsertOrder.html">新增订单</a></li>
						</ul></li>
					<li><a href="#">财务管理</a>
						<ul>
							<li><b class="tip"></b> <a target="Conframe"
								href="/profit/showProfitInfo">财务信息</a></li>
							<li><b class="tip"></b> <a target="Conframe"
								href="/profit/expenses">支出</a></li>
							<li><b class="tip"></b> <a target="Conframe"
								href="/profit/profitAssay">分析</a></li>
						</ul></li>
				</ul>
			</div>
			<div id="datepicker"></div>
		</div>

		<!--左边菜单结束-->
		<!--右边框架开始-->
		<div class="right_c">
			<div class="nav-tip" onclick="javascript:void(0)">&nbsp;</div>
		</div>
		<div class="Conframe  tg">
			<iframe name="Conframe" src="index1.html" id="Conframe"></iframe>
		</div>
		<!--右边框架结束-->

		<!--底部开始-->
		<div class="bottom_c">Copyright &copy;2016-2016 武汉天下科技有限公司 版权所有</div>
		<!--底部结束-->
	</div>
	<script type="text/javascript" src="js/jquery.nicescroll.js"></script>
	<script type="text/javascript">
		$(".tg").niceScroll({
			cursorcolor : "#fff",
			cursoropacitymax : 1,
			touchbehavior : false,
			cursorwidth : "0px",
			cursorborder : "0",
			cursorborderradius : "0px"
		});
	</script>
</body>

</html>