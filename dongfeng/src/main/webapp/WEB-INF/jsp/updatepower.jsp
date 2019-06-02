<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/ttoupdatepower" method="post">
<input type="hidden" name="id" value="${uid }">
<select name="selectid">
<option value="1">仓库主管</option>

<option value="2">财务主管</option>

<option value="3">调度主管</option>

<option value="4">人事主管</option>

<option value="5">经理办公室</option>
</select>

<input type="submit" value="确定">
</form> 
</body>
</html>