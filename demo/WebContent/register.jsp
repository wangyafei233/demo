<%@ page language="java" contentType="text/html; charset=gbk"
	pageEncoding="gbk"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html >
<html>
<head>
<title>register</title>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<link rel="stylesheet" href="static/css/bootstrap.min.css">
<link rel="stylesheet" href="static/css/bootstrap-theme.min.css">
<script src="static/js/jquery.min.js"></script>
<script src="static/js/bootstrap.min.js"></script>
<script type="text/javascript">
	function CheckPass() {
		var pwda = $(".pwda").val(), pwdb = $(".pwdb").val();
		if (pwda != pwdb) {
			$("#message").text("�����������벻һ�£����������룡");
			$(".pwda").val("");
			$(".pwdb").val("");
		} else {
			$("#message").text("");
		}
	}
	$(function() {
		$(".form-control").val("");
	});
</script>
</head>
<body>
	<div style="width: 1200px; margin: 0 auto; text-align: right;">
		<a class="" href="login.jsp">��ã����¼</a>&nbsp;&nbsp; <a class=""
			href="register.jsp">���ע��</a>&nbsp;&nbsp; ${message}&nbsp;&nbsp;&nbsp;
	</div>
	<div style="width: 600px; margin: 8% auto;">
		<div class="panel-body"
			style="margin: 0 auto; width: 350px; text-align: center;">
			<div class="page-header">
				<h2>Sign up</h2>
			</div>
			<form action="registerservlet" method="post">
				<table style="border-collapse: separate; border-spacing: 10px;">
					<tr>
						<td style="text-align: right;">�û�����</td>
						<td><input type="text" class="form-control"
							name="registername" aria-describedby="basic-addon1" /></td>
					</tr>
					<tr>
						<td style="text-align: right;">���룺</td>
						<td><input type="password" class="form-control pwda"
							name="registerpwd" aria-describedby="basic-addon1" /></td>
					</tr>
					<tr>
						<td style="text-align: right;">���룺</td>
						<td><input type="password" class="form-control pwdb"
							onchange="CheckPass();" aria-describedby="basic-addon1" /><span
							style="color: red;" id="message">55555</span></td>
					</tr>
					<tr>
						<td style="text-align: right;">���ͣ�</td>
						<td><select class="form-control" name="registertype">
								<option value="admin1">����1</option>
								<option value="admin2">����2</option>
								<option value="admin3">����3</option>
						</select></td>
					</tr>
					<tr align="center">
						<td colspan="2">
							<button type="submit" data-loading-text="Loading..."
								class="btn btn-success">
								&nbsp;&nbsp;&nbsp;&nbsp;ע&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								&nbsp;&nbsp;��&nbsp;&nbsp;&nbsp;&nbsp;</button>
						</td>
					</tr>
				</table>
			</form>
		</div>
	</div>

</body>
</html>