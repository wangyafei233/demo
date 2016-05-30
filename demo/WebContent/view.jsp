<%@ page language="java" contentType="text/html; charset=gbk"
	pageEncoding="gbk"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<link rel="stylesheet" href="static/css/bootstrap.min.css">
<title>数据遍历</title>
</head>
<body>
<div style="width: 960px; margin: 0 auto;" >
<div><a href="add2.jsp" class="btn btn-primary">返回首页</a></div>
<div>
	<table border="3px">
		<thead>
			<tr>
				<th>id</th>
				<th>cpuname</th>
				<th>memoryname</th>
				<th>osname</th>
				<th>maxmemoryname</th>
				<th>wulimemoryname</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list}" var="s">
				<tr>
					<td>${s.name1}</td>
					<td>${s.name2}</td>
					<td>${s.name3}</td>
					<td>${s.name4}</td>
					<td>${s.name5}</td>
					<td>${s.name6}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	</div>
	
</div>



</body>
</html>