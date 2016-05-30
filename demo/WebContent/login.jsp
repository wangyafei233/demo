<%@ page language="java" contentType="text/html; charset=gbk"
	pageEncoding="gbk"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<title>index</title>

<link rel="stylesheet" href="static/css/bootstrap.min.css">
<link rel="stylesheet" href="static/css/bootstrap-theme.min.css">
<script src="static/js/jquery.min.js"></script>
<script src="static/js/bootstrap.min.js"></script>

</head>
<body onload="dd()">
	<div
		style="width: 1200px; margin: 0 auto; text-align: right;">
			<a class="" href="login.jsp">你好，请登录</a>&nbsp;&nbsp;
			<a  class="" href="register.jsp">免费注册</a>&nbsp;&nbsp;
		${message}&nbsp;&nbsp;&nbsp;
	</div>

	<div style="width: 600px; margin: 8% auto;">
		<div class="panel-body"
			style="margin: 0 auto;width: 350px;text-align: center;">
			<div class="page-header">
				<h2>
					Sign in 
				</h2>
			</div>
			<form action="loginservlet" method="post">
				<table style="border-collapse: separate; border-spacing: 10px;">
					<tr>
						<td style="text-align: right;">用户名：</td>
						<td><input type="text" class="form-control" placeholder="" 
							aria-describedby="basic-addon1" name="username"></td>
					</tr>
					<tr>
						<td style="text-align: right;">密码：</td>
						<td><input type="password" class="form-control" placeholder="" 
							aria-describedby="basic-addon1" name="password"></td>
					</tr>
					<tr>
						<td style="text-align: right;">类型：</td>
						<td><select class="form-control" name="type" >
								<option value="admin1">类型1</option>
								<option value="admin2">类型2</option>
								<option value="admin3">类型3</option>
						</select></td>
					</tr>
					<tr align="center">
						<td colspan="2">
							<button type="submit" id="myButton"
								data-loading-text="Loading..." class="btn btn-success">
								&nbsp;&nbsp;&nbsp;&nbsp;登&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								&nbsp;&nbsp;陆&nbsp;&nbsp;&nbsp;&nbsp;</button>
						</td>
					</tr>
				</table>
			</form>
		</div>
	</div>
	<div>${message}</div>

</body>
</html>