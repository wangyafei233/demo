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
			<a class="" href="login.jsp">��ã����¼</a>&nbsp;&nbsp;
			<a  class="" href="register.jsp">���ע��</a>&nbsp;&nbsp;
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
						<td style="text-align: right;">�û�����</td>
						<td><input type="text" class="form-control" placeholder="" 
							aria-describedby="basic-addon1" name="username"></td>
					</tr>
					<tr>
						<td style="text-align: right;">���룺</td>
						<td><input type="password" class="form-control" placeholder="" 
							aria-describedby="basic-addon1" name="password"></td>
					</tr>
					<tr>
						<td style="text-align: right;">���ͣ�</td>
						<td><select class="form-control" name="type" >
								<option value="admin1">����1</option>
								<option value="admin2">����2</option>
								<option value="admin3">����3</option>
						</select></td>
					</tr>
					<tr align="center">
						<td colspan="2">
							<button type="submit" id="myButton"
								data-loading-text="Loading..." class="btn btn-success">
								&nbsp;&nbsp;&nbsp;&nbsp;��&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								&nbsp;&nbsp;½&nbsp;&nbsp;&nbsp;&nbsp;</button>
						</td>
					</tr>
				</table>
			</form>
		</div>
	</div>
	<div>${message}</div>

</body>
</html>