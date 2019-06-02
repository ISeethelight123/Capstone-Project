<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="itcast" uri="http://itcast.cn/common/"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title>调度信息管理</title>
		<!-- 引入bootstrap的核心文件 -->
		<link rel="stylesheet" type="text/css" href="/static/css/bootstrap.min.css" />

		<!-- 引入jqury-->
		<script type="text/javascript" src="/static/js/jquery-1.11.0.js"></script>

		<!-- 引入bootstrap的核心js文件  -->
		<script type="text/javascript" src="/static/js/bootstrap.js"></script>

		<script src="/static/js/bootstrap-dialog.js" type="text/javascript" charset="utf-8"></script>
		<script src="/static/js/bootstrap-dialog.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="/static1/js/jquery.cookie.js" type="text/javascript" charset="utf-8"></script>


		<!-- Bootstrap Core CSS -->
		<link href="<%=basePath%>static1/css/bootstrap.min.css" rel="stylesheet">
		
		<!-- MetisMenu CSS -->
		<link href="<%=basePath%>static1/css/metisMenu.min.css" rel="stylesheet">
		
		<!-- DataTables CSS -->
		<link href="<%=basePath%>static1/css/dataTables.bootstrap.css" rel="stylesheet">
		
		<!-- Custom CSS -->
		<link href="<%=basePath%>static1/css/sb-admin-2.css" rel="stylesheet">
		
		<!-- Custom Fonts -->
		<link href="<%=basePath%>static1/css/font-awesome.min.css" rel="stylesheet"
			type="text/css">
		<link href="<%=basePath%>static1/css/boot-crm.css" rel="stylesheet"
			type="text/css">
		


		<meta name="viewport" content="width=device-width, initial-scale=1">
	</head>
	<style type="text/css">
		#tj {
			position: absolute;
			top: 50px;
			left: 1130px;
		}
		
	</style>

	<body>
		<div class="container" style="margin-top: 50px">
			<form class="form-inline" action="${pageContext.request.contextPath }/createSchedule/createSchedule">
				<div class="form-group" style="margin-left: 15px;">
					<label  for="exampleStartPoint">出发仓库</label> 
					<select	class="form-control" id="exampleStartPoint" placeholder="仓库地址" name="wrehouseId" onchange="createWaybilLists()">
						<option value="">--请选择--</option>
						<c:forEach items="${wrehouseList}" var="item">
							<option value="${item.wrehouseId}" >${item.wrehouseName }</option>
						</c:forEach>
					</select>
				</div>
				<div class="form-group" style="margin-left: 15px;">
					<label for="exampleEndPoint">目的地</label> 
					<select	class="form-control" id="exampleEndPoint" placeholder="目的地" name="recipientsProvince" onchange="createWaybilLists()">
						<option value="">--请选择--</option>
						<c:forEach items="${chinaList}" var="item">
							<option value="${item.name}">${item.name}</option>
						</c:forEach>
					</select>
				</div>
				<div class="form-group" style="margin-left: 15px;">
					<label for="exampleLine">路线</label> 
					<select	class="form-control" id="exampleLine" placeholder="路线" name="lineId">
						<option value="">--请选择--</option>
						<%-- <c:forEach items="${chinaList}" var="item"> --%>
							<option value="1">1</option>
						<%-- </c:forEach> --%>
					</select>
				</div>
				
				<div class="form-group" style="margin-left: 15px;">
					<label for="exampleDriver">司机</label>
					<select	class="form-control" id="exampleDriver" placeholder="司机" name="driverId">
						<option value="">--请选择--</option>
						<c:forEach items="${driverList}" var="item">
							<option value="${item.driverId}" <c:if test="${item.driverId == recipientsProvince}"> selected</c:if> >${item.driverId }</option>
						</c:forEach>
					</select>
					<a class="btn btn-default" onclick="driverEnquiry()">查询司机详情</a>
				</div>
				
				<div class="form-group" style="margin-left: 15px;">
					<label for="exampleCar">车辆</label> 
					<select	class="form-control" id="exampleCar" placeholder="车辆" name="carId">
						<option value="">--请选择--</option>
						<c:forEach items="${carList}" var="item">
							<option value="${item.carId}" <c:if test="${item.carId == recipientsProvince}"> selected</c:if> >${item.carId }</option>
						</c:forEach>
					</select>
					<a class="btn btn-default" onclick="carEnquiry()">查询车辆详情</a>
				</div>
				
				<div class="form-group" style="margin-left: 15px;margin-top: 15px">
					<label for="exampleStartTime">预计出发时间</label> 
					<input type="date" placeholder="时间" name="controlStarttime" style="width: 150px" class="form-control" id="exampleStartTime">
				</div>
				
				<div class="form-group" style="margin-left: 15px;margin-top: 15px">
					<label for="exampleEndTime">预计到达时间</label> 
					<input type="date" placeholder="时间" name="controlEndtime" style="width: 150px" class="form-control" id="exampleEndTime">
				</div>
				
				<div class="form-group" style="margin-left: 15px; margin-top: 15px">
					<label for="exampleWaybilId">运单号</label> 
					<select	class="form-control" id="exampleWaybilId" placeholder="运单号" name="WaybilId" onchange="check()">
						<option value="">--请选择--</option>
						<%-- <c:forEach items="${waybilList}" var="item">
							<option value="${item}" <c:if test="${item == wrehouseName}"> selected</c:if> >${item }</option>
						</c:forEach> --%>
					</select>
					<input type="button" id="sq-botton" class="btn btn-default" onclick="waybilEnquiry()" disabled="disabled" value="查询运单详情"/>
				</div>
				<!-- <button type="submit" class="btn btn-default" style="margin-top: 15px">提交</button> -->
			</form>
			
			<!-- <div id="tj">
				<a href="#" class="btn btn-default" data-toggle="modal" data-target="#driverInsertDialog" >添加</a>
			</div> -->
			
			<table id="t" class="table table-striped table table-bordered table table-hover" style="margin-top: 30px;text-align: center;">
				
			</table>
			<%-- <button class="btn btn-primary btn-xs" id="deleteDriver" onclick="deleteDriver(${row.driverId})">删除</button> --%>
			<div class="col-md-12 text-right">
				<itcast:page url="${pageContext.request.contextPath }/createSchedule/createSchedule"/>
			</div>
			<a class="btn btn-primary btn-xs" style="padding: 8px;" data-toggle="modal" data-target="#scheduleEditDialog" onclick="editSchedule()">生成调度单</a>
		</div>
		
		
		
		<!-- 车辆信息编辑对话框 -->
		<div class="modal fade" id="scheduleEditDialog" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document" style="width:1040px; ">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">关闭</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">
						调度单号:<span style="color: red;font-weight: bold;" id="controlsId"></span>
					</h4>
				</div>
				<div class="modal-body" id="createWaybil">
					<table id="sq-table1" border="1" class="table table-striped table table-bordered table table-hover" style="margin-top: 30px;text-align: center;">
						<tr>
							<th style="text-align: center;">编号</th>
							<th style="text-align: center;">仓库</th>
							<th style="text-align: center;">运单号</th>
							<th style="text-align: center;">目的地</th>
							<th style="text-align: center;">路线</th>
							<th style="text-align: center;">车辆</th>
							<th style="text-align: center;">司机</th>
							<th style="text-align: center;">预计出发时间</th>
							<th style="text-align: center;">预计达到时间</th>
						</tr>
					</table>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
					<button type="button" class="btn btn-primary" aria-label="Close" data-dismiss="modal" onclick="saveSchedule()">保存</button>
				</div>
			</div>
		</div>
	</div> 
	
	
	
		<!-- 车辆信息添加对话框 -->
		<!-- <div class="modal fade" id="driverInsertDialog" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">添加司机信息</h4>
				</div>
				<div class="modal-body">
					<form class="form-horizontal" id="text_driver_form">
						<div class="form-group">
							<label for="text_driverName" class="col-sm-2 control-label">姓名</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="text_driverName" placeholder="姓名" name="driverName">
							</div>
						</div>
						<div class="form-group">
							<label for="text_driverAge" style="float:left;padding:7px 15px 0 55px;">年龄</label> 
							<div class="col-sm-10">
								<input type="text" class="form-control" id="text_driverAge" placeholder="年龄" name="driverAge">
							</div>
						</div>
						<div class="form-group">
							<label for="text_driverPhone" style="float:left;padding:7px 15px 0 55px;">电话</label>
							<div class="col-sm-10"> 
								<input type="text" class="form-control" id="text_driverPhone" placeholder="电话" name="driverPhone">
							</div>
						</div>
						<div class="form-group">
							<label for="text_driverStatus" style="float:left;padding:7px 15px 0 55px;">状态</label>
							<div class="col-sm-10">
								<select	class="form-control" id="text_driverStatus" name="driverStatus">
									<option value="">--请选择--</option>
									<option value="0">运输中</option>
									<option value="1">闲置中</option>
								</select>
							</div>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary" onclick="insertDriver()">保存</button>
				</div>
			</div>
		</div>
	</div> -->

		<script type="text/javascript">
		
		
		
		function check(){
	        var waybilId = document.getElementById("exampleWaybilId").value;
	        alert(waybilId);
	        if(waybilId != ""){
	            document.getElementById("sq-botton").disabled="";
	        }else{
	            document.getElementById("sq-botton").disabled="disabled";
	        }
	    };
	    
		/* 写车辆表格 */
		function carEnquiry() {
			var carId = document.getElementById("exampleCar").value;
			if(carId == ""){
				carId = 0;
			}
			$.ajax({
				type:"get",
				url:"<%=basePath%>Schedule/createSchedule/enquiryCar",
				data:{"carId":carId},
				success:function(res) {
					alert("success");
					$("#t tr").remove();
					$("#t").append("<tr><th style=\"text-align: center;\">编号</th><th style=\"text-align: center;\">车牌号</th><th style=\"text-align: center;\">载重</th><th style=\"text-align: center;\">车型</th><th style=\"text-align: center;\">车尺寸</th><th style=\"text-align: center;\">状态</th></tr>");
					$(res).each(function(index,ob){
						$("#t").append("<tr><td>"+this.carId+"</td><td>"+this.carPlate+"</td><td>"+this.loads.carloads+"</td><td>"+this.types.cartypes+"</td><td>"+this.carSize+"</td><td>"+"闲置中 "+ "</td></tr>");
					})
				}
			});
		};
		/* 写司机表格 */
		function driverEnquiry() {
			var driverId = document.getElementById("exampleDriver").value;
			if(driverId == ""){
				driverId = 0;
			}
			$.ajax({
				type:"get",
				url:"<%=basePath%>Schedule/createSchedule/enquiryDriver",
				data:{"driverId":driverId},
				success:function(res) {
					alert("success");
					$("#t tr").remove();
					$("#t").append("<tr><th style=\"text-align: center;\">编号</th><th style=\"text-align: center;\">姓名</th><th style=\"text-align: center;\">年龄</th><th style=\"text-align: center;\">电话</th><th style=\"text-align: center;\">地址</th><th style=\"text-align: center;\">状态</th></tr>");
					$(res).each(function(index,ob){
						$("#t").append("<tr><td>"+this.driverId+"</td><td>"+this.driverName+"</td><td>"+this.driverAge+"</td><td>"+this.driverPhone+"</td><td>"+this.driverAddress+"</td><td>"+"闲置中 "+"</td></tr>");
					})
				}
			});
		};
		/*写运单号列表  */
		function createWaybilLists() {
			var startPoint = $("#exampleStartPoint").val();
			var endPoint = $("#exampleEndPoint").val();
			if(startPoint == ""){
				startPoint = 0;
			}
			if(endPoint == ""){
				endPoint = 0;
			}
			var param1 = {"startPoint":startPoint,"endPoint":endPoint};
			$.ajax({
				type:"get",
				url:"<%=basePath%>Schedule/createSchedule/createWaybilLists",
				/* contentType:"application/json; charset=utf-8", */
	            dataType:"json",
				data:param1,
				success:function(res) {
					alert("success");
					$("#exampleWaybilId").find("option").remove();
					$("#exampleWaybilId").append("<option value=\"\">-- 请选择 - - </option>");
					$(res).each(function(index,ob){
						$("#exampleWaybilId").append("<option value=\""+this.waybilId+"\">"+this.waybilId+"</option>");
					})
				}
			});
		};
		/*写运单号表格  */
		function waybilEnquiry() {
			alert("js==waybilEnquiry");
			var waybilId = $("#exampleWaybilId").val();
			alert("waybilId=="+waybilId);
			if(waybilId == ""){
				waybilId = 0;
			}
			var param1 = {"waybilId":waybilId};
			$.ajax({
				type:"get",
				url:"<%=basePath%>Schedule/createSchedule/waybilEnquiry",
				/* contentType:"application/json; charset=utf-8", */
	            dataType:"json",
				data:param1,
				success:function(res) {
					alert("success");
					$("#t tr").remove();
					$("#t").append("<tr><th style=\"text-align: center;\">订单编号</th><th style=\"text-align: center;\">订单货物类型</th><th style=\"text-align: center;\">订单货物重量</th><th style=\"text-align: center;\">订单金额</th><th style=\"text-align: center;\">运单号</th></tr>");
					$(res).each(function(index,ob){
						$("#t").append("<tr><td>"+this.order.orderId+"</td><td>"+this.order.orderType+"</td><td>"+this.order.orderWeight+"</td><td>"+this.order.orderMoney+"</td><td>"+this.waybilId+"</td></tr>");
					})
				}
			});
		};
		/*写调度单表格  */
		function editSchedule() {
			var controlWrehouseId = $("#exampleStartPoint").val();
			var controlDestination = $("#exampleEndPoint").val();
			var controlLineid = $("#exampleLine").val();
			var controlDriverid = $("#exampleDriver").val();
			var controlCarid = $("#exampleCar").val();
			var controlStarttime = $("#exampleStartTime").val();
			var controlEndtime = $("#exampleEndTime").val();
			var controlWaybilid = $("#exampleWaybilId").val();
			alert("WrehouseId="+controlWrehouseId);
			alert("Destination="+controlDestination);
			alert("Lineid="+controlLineid);
			alert("Driverid="+controlDriverid);
			alert("Carid="+controlCarid);
			alert("Starttime="+controlStarttime);
			alert("Endtime="+controlEndtime);
			alert("Waybilid="+controlWaybilid);
			if(controlWrehouseId == ""){
				alert("请填写仓库信息");
				return;
			}
			if(controlDestination == ""){
				alert("请写目的地信息");
				return;
			}
			 if(controlLineid == ""){
				 alert("请写路线信息");
				 return; 
			} 
			if(controlDriverid == ""){
				alert("请写司机信息");
				return;
			}
			if(controlCarid == ""){
				alert("请写车辆信息");
				return;
			}
			if(controlStarttime == ""){
				alert("请写出发时间信息");
				return;
			}
			if(controlEndtime == ""){
				alert("请写到达时间信息");
				return;
			}
			if(controlWaybilid == ""){
				alert("请写运单号信息");
				return;
			}
			var param1 = {"controlWrehouseId":controlWrehouseId,"controlDestination":controlDestination,"controlLineid":controlLineid,
					"controlDriverid":controlDriverid,"controlCarid":controlCarid,"controlStarttime":controlStarttime,"controlEndtime":controlEndtime,"controlWaybilid":controlWaybilid};
			$.ajax({
				type:"get",
				url:"<%=basePath%>Schedule/createSchedule/editSchedule",
	            dataType:"json",
				data:param1,
				success:function(res) {
					alert("success");
					$("#controlsId").text(res.controlId);
					$("#sq-table1 tr:not(:first)").remove();
					$("#sq-table1").append("<tr><td>"+res.controlId+"</td><td>"+res.controlWrehouseId+"("+res.wrehouse.wrehouseName+")"+"</td><td>"+res.controlWaybilid+"</td><td>"+res.controlDestination+"</td><td>"+res.controlLineid+"</td><td>"+res.controlCarid+"("+res.car.carPlate+")"+"</td><td>"+res.controlDriverid+"("+res.driver.driverName+")"+"</td><td>"+res.controlStarttime+"</td><td>"+res.controlEndtime+"</td></tr>");
				}
			});
		}
		
		function saveSchedule() {
			var controlWrehouseId = $("#exampleStartPoint").val();
			var controlDestination = $("#exampleEndPoint").val();
			var controlLineid = $("#exampleLine").val();
			var controlDriverid = $("#exampleDriver").val();
			var controlCarid = $("#exampleCar").val();
			var controlStarttime = $("#exampleStartTime").val();
			var controlEndtime = $("#exampleEndTime").val();
			var controlWaybilid = $("#exampleWaybilId").val();
			if(controlWrehouseId == ""){
				alert("请填写仓库信息");
				return;
			}
			if(controlDestination == ""){
				alert("请写目的地信息");
				return;
			}
			 if(controlLineid == ""){
				 alert("请写路线信息");
				 return; 
			} 
			if(controlDriverid == ""){
				alert("请写司机信息");
				return;
			}
			if(controlCarid == ""){
				alert("请写车辆信息");
				return;
			}
			if(controlStarttime == ""){
				alert("请写出发时间信息");
				return;
			}
			if(controlEndtime == ""){
				alert("请写到达时间信息");
				return;
			}
			if(controlWaybilid == ""){
				alert("请写运单号信息");
				return;
			}
			var param1 = {"controlWrehouseId":controlWrehouseId,"controlDestination":controlDestination,"controlLineid":controlLineid,
					"controlDriverid":controlDriverid,"controlCarid":controlCarid,"controlStarttime":controlStarttime,"controlEndtime":controlEndtime,"controlWaybilid":controlWaybilid};
			$.ajax({
				type:"get",
				url:"<%=basePath%>Schedule/createSchedule/saveSchedule",
				data:param1,
				success:function(res) {
					if("OK" == res){
						alert("新增调度单成功");
					}else{
						alert("新增调度单失败");
					}
				}
			});
		}
		
		
		
			
			
			
			
			
			
			
			
			
			
		
		
		
		
		
		
		
		<%-- function editWaybil() {
			$.ajax({
				type:"get",
				url:"<%=basePath%>waybil/editWaybil",
				success:function(res) {
					$("#t tr:not(:first)").remove();
					$(res).each(function(index,ob){
						$("#t").append("<tr><td>"+this.orderId+"</td><td>"+this.orderMailName+"</td><td>"+this.orderMailPhone+"</td><td>"+this.orderMailAddress+"</td><td>"+this.recipient.recipientsProvince+"</td><td>"+this.orderTime+"</td><td>"+this.orderWeight+"</td><td>"+this.orderType+"</td><td>"+this.orderMoney+"</td><td>"+this.orderState+"</td></tr>");
					})
				}
			});
		};
		
		function createWaybilId(){
			$.ajax({
				type:"get",
				url:"<%=basePath%>waybil/createWaybilId",
				success:function(res) {
					alert(res);
					$("#waybilId").text(res+1);
				}
			});
			
		};
		
		function saveWaybil(){
			$.ajax({
				type:"get",
				url:"<%=basePath%>waybil/saveWaybil",
				success:function(res) {
					if("OK" == res){
						alert("添加运单成功");
						window.location.reload();
					}else{
						alert("添加运单失败");
					}
				}
			});
		};
		
		
			 
		
		
		
		
			//获得cookie
			function GetCookie(name) {
		        if (document.cookie.length > 0) {
		          c_start = document.cookie.indexOf(name + "=");
		        if (c_start != -1) {
		          c_start = c_start + name.length + 1;
		          c_end = document.cookie.indexOf(";", c_start);
		          if (c_end == -1) c_end = document.cookie.length;
		          return unescape(document.cookie.substring(c_start, c_end));
		        }
		      }
		      return "";
		    }
			//设置cookie
			function SetCookie(name, value) {
			      document.cookie = name + "=" + escape(value);
				  delCookie(value);
		    }
			//添加cookie
			function AddCookie(i) {
		       d = GetCookie("ArticleId");
		       if (d == "") d = "|";
		       if (d.indexOf("|" + i + "|") == -1) {
		            d += i + "|";
		            SetCookie("ArticleId", d);
		       } 
		    }
		  	//移除cookie
		    function RemoveCookie(i) {
		      d = GetCookie("ArticleId");
		      var reg = new RegExp("\\|" + i + "\\|");
		      if (reg.test(d)) {
		        d = d.replace(reg, "|");  
		        SetCookie("ArticleId", d);
		      }     
		    } 
			
			
		     
		    function SetArticleId(o, i) { 
		       if (o.checked) {
		         AddCookie(i)
		       }
		       else {
		         RemoveCookie(i)
		       } 
		    } 
			//点击选中复选框,设置cookie
		    $(".mycheckbox").click(function(){
		       var uid =$(this).attr('id');
		       SetArticleId(this,uid);
		    })
		    
		   
		    /***页面获取的uid和cookie中获取的uid对比，相等 通过js主动勾选复选框**/
		
		    window.onload=function(){
		      var d = GetCookie("ArticleId");
		      if (d != ""){
			      var str = d.substring(1,d.length-1);
				  //cookie中保存的值
			      var arry=str.split('|');
				  alert(arry);
				  var sum = 0;
			      $('.mycheckbox').each(function(i,item){
				      var uid=parseInt($(item).attr('id'));
				      for(var i=0;i<arry.length;i++){
				      	var did=parseInt(arry[i]);
				      	if(uid==did){
				      		$(item)[0].checked=true;
							sum=sum+1;
				     	}
		      		  }
		           })
				var coll1 = document.getElementsByName("orderId");
				alert("coll1.length="+coll1.length);
				alert(sum);
				if(coll1.length == sum){
					var collid1 = document.getElementById("sq-orderid");
					collid1.checked = true;
				}
				 
				 
		
		      }
		    }
			
			
		   //删除cookie中指定变量函数    
	       function delCookie(value){
		    	//1.获取当前日期
	            var myDate= new Date(); 
	            //2. 获取当前分钟
	 		    var min=myDate.getMinutes();
	 		    //3. 设置当前时间+5分钟：把当前分钟数+5后的值重新设置为date对象的分钟数
	            myDate.setMinutes(min+1);
	            document.cookie="ArticleId="+value+"; expires=" + myDate.toGMTString();            
	       }  --%>
		   
		
			<%-- function deleteDriver(driverId) {
				if(confirm('确实要删除该车吗? ')) {
					$.post("<%=basePath%>driver/deleteDriverById",{"driverId":driverId},function(data){
						alert("车辆删除成功！");
						window.location.reload();
					});
				}
			};
				
				
			function updateDriver() {
				$.post("<%=basePath%>driver/updateDriverById",$("#edit_driver_form").serialize(),function(data){
					alert("车辆信息更新成功！");
					window.location.reload();
				});
			}
			
			function insertDriver() {
				$.post("<%=basePath%>driver/insertDriverById",$("#text_driver_form").serialize(),function(data){
					alert("车辆信息添加成功！");
					window.location.reload();
				});
			} --%>
			
			/* function sqcli(){
				//获取控制其它复选框的对象obj
				var collid = document.getElementById("sq-orderid");
				//获取需要全选，全不选功能的所有复选框
				var coll = document.getElementsByName("orderId");
				//如果obj被选中，则全选
				if (collid.checked){
				   //循环设置所有复选框为选中状态
				   for(var i = 0; i < coll.length; i++){
				     coll[i].checked = true;
				   }
				   $('.mycheckbox').each(function(i,item){
				      var uid=parseInt($(item).attr('id'));
				      SetArticleId(item,uid);
		           })
				   
				}else{//取消obj选中状态，则全不选
				   //循环设置所有复选框为未选中状态
				   for(var i = 0; i < coll.length; i++){
					   coll[i].checked = false;
				   }
				   $('.mycheckbox').each(function(i,item){
				      var uid=parseInt($(item).attr('id'));
				      RemoveCookie(uid);
		           })
				}
			} */
			
			
			
		</script>

	</body>

</html>