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
			<form class="form-inline" action="${pageContext.request.contextPath }/waybil/waybil">
				<div class="form-group" style="margin-left: 15px;">
					<label for="exampleInputEmail2">仓库</label> 
					<select	class="form-control" id="exampleInputEmail2" placeholder="仓库地址" name="wrehouseName">
						<option value="">--请选择--</option>
						<c:forEach items="${wrehouseList}" var="item">
							<option value="${item.wrehouseName}" <c:if test="${item.wrehouseName == wrehouseName}"> selected</c:if> >${item.wrehouseName }</option>
						</c:forEach>
					</select>
				</div>
				
				<div class="form-group" style="margin-left: 15px;">
					<label for="exampleInputEmail2">目的地(省级)</label> 
					<select	class="form-control" id="exampleInputEmail2" placeholder="目的地" name="recipientsProvince">
						<option value="">--请选择--</option>
						<c:forEach items="${chinaList}" var="item">
							<option value="${item.name}" <c:if test="${item.name == recipientsProvince}"> selected</c:if> >${item.name }</option>
						</c:forEach>
					</select>
				</div>
				<div class="form-group" style="margin-left: 15px;">
					<label for="exampleInputEmail2">时间</label> 
					<input value="${orderTime }"  type="date" placeholder="时间" name="orderTime" style="width: 150px" class="form-control" id="exampleInputEmail2">
				</div>
				<button type="submit" class="btn btn-default">查询</button>
			</form>
			
			<!-- <div id="tj">
				<a href="#" class="btn btn-default" data-toggle="modal" data-target="#driverInsertDialog" >添加</a>
			</div> -->
			
			<table id="guide-table1" class="table table-striped table table-bordered table table-hover" style="margin-top: 30px;text-align: center;">
				<tr>
					<th style="text-align: center;"><input type="checkbox" id="sq-orderid" onclick="sqcli()" ></th>
					<th style="text-align: center;">订单编号</th>
					<th style="text-align: center;">寄件人姓名</th>
					<th style="text-align: center;">寄件人电话</th>
					<th style="text-align: center;">寄件人地址</th>
					<th style="text-align: center;">收件省份</th>
					<th style="text-align: center;">订单生成时间</th>
					<th style="text-align: center;">订单货物重量</th>
					<th style="text-align: center;">订单货物类型</th>
					<th style="text-align: center;">订单金额</th>
					<th style="text-align: center;">订单状态</th>
					<!-- <th style="text-align: center;">操作</th> -->
				</tr>
		
				<c:forEach items="${page.rows }" var="row" >
					
                	<tr>
						<td><input type="checkbox" class="mycheckbox" name="orderId" value="${row.order.orderId }" id="${row.order.orderId }" ></td>
						<td>${row.order.orderId }</td>
						<td>${row.order.orderMailName }</td>
						<td>${row.order.orderMailPhone }</td>
						<td>${row.order.orderMailAddress }</td>
						<td>${row.order.recipient.recipientsProvince }</td>
						<td>${row.order.orderTime }</td>
						<td>${row.order.orderWeight }</td>
						<td>${row.order.orderType }</td>
						<td>${row.order.orderMoney }</td>
						<td>${(row.order.orderState == 0)?"未发货":"已发货" }</td>
						<%-- <td>
							<button class="btn btn-primary btn-xs" id="deleteDriver" onclick="deleteDriver(${row.driverId})">删除</button>
							<a class="btn btn-primary btn-xs" data-toggle="modal" data-target="#driverEditDialog" onclick="editDriver(${row.driverId})">修改</a>
						</td> --%>
					</tr>
					</volist>
				</c:forEach>
				</table>
				<%-- <button class="btn btn-primary btn-xs" id="deleteDriver" onclick="deleteDriver(${row.driverId})">删除</button> --%>
				<a class="btn btn-primary btn-xs" style="padding: 8px;" data-toggle="modal" data-target="#waybilEditDialog" onclick="editWaybil(),createWaybilId()">提交</a>
			
			<div class="col-md-12 text-right">
				<itcast:page url="${pageContext.request.contextPath }/waybil/waybil"/>
			</div>
		</div>
		
		
		
		<!-- 车辆信息编辑对话框 -->
		<div class="modal fade" id="waybilEditDialog" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document" style="width:1040px; ">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">关闭</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">
					运单号:<span style="color: red;font-weight: bold;" id="waybilId"></span>
					</h4>
				</div>
				<div class="modal-body" id="createWaybil">
					<table id="t" border="1" class="table table-striped table table-bordered table table-hover" style="margin-top: 30px;text-align: center;">
						<tr>
							<th style="text-align: center;">订单编号</th>
							<th style="text-align: center;">寄件人姓名</th>
							<th style="text-align: center;">寄件人电话</th>
							<th style="text-align: center;">寄件人地址</th>
							<th style="text-align: center;">收件省份</th>
							<th style="text-align: center;">订单生成时间</th>
							<th style="text-align: center;">订单货物重量</th>
							<th style="text-align: center;">订单货物类型</th>
							<th style="text-align: center;">订单金额</th>
							<th style="text-align: center;">订单状态</th>
						</tr>
					</table>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
					<button type="button" class="btn btn-primary" aria-label="Close" data-dismiss="modal" onclick="saveWaybil()">保存</button>
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
		
		
		function editWaybil() {
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
	       }  
		   
		
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
			
			function sqcli(){
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
			}
			
			
			
		</script>

	</body>

</html>