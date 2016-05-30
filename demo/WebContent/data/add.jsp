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
<script type="text/javascript" src="static/js/highcharts.js"></script>


<script type="text/javascript">
	$(function() {//等jquery加载完后再执行
		/* $('#btnmodel').click(); */
	});
</script>

</head>
<body>




	<form action="registerservlet" method="post">
		
				用户名：
				<input type="password" >
			
				密码：
				<input type="text" >
			
				密码：
				<input type="password" >
			<select >
						<option value="admin1">类型1</option>
						<option value="admin2">类型2</option>
						<option value="admin3">类型3</option>
				</select>
					<button type="submit" 
						class="btn btn-success">
						&nbsp;&nbsp;&nbsp;&nbsp;注&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;册&nbsp;&nbsp;&nbsp;&nbsp;</button>
	</form>



	<button type="button" class="btn btn-primary btn-lg"
		data-toggle="modal" id="btnmodel" data-target="#myModal">Launch
		demo modal</button>

	<!-- Modal -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">Modal title</h4>
				</div>
				<div class="modal-body">...</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					<button type="button" class="btn btn-primary">Save changes</button>
				</div>
			</div>
		</div>
	</div>

</body>
</html>