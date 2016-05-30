
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<script type="text/javascript">
	
</script>

<title>view</title>
</head>
<body>
	<%=request.getAttribute("a")%>

	<a href="selectservlet">查询数据</a><a href="chartview">图标显示</a>
</body>
</html>