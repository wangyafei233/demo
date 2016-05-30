<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML >
<html>
<head>
<base href="<%=basePath%>">

<title>index2</title>
<link rel="stylesheet" href="static/css/bootstrap.min.css">
<link rel="stylesheet" href="static/css/bootstrap-theme.min.css">
<!-- <link rel="stylesheet" href="static/css/jquery-ui.min.css"> -->
<script src="static/js/jquery.min.js"></script>
<script src="static/js/bootstrap.min.js"></script>
<script type="text/javascript" src="static/js/highcharts.js"></script>
<!-- <script src="static/js/jquery-ui.min.js"></script> -->

<script>
	$(document).ready(function() {
		$("#menu button").each(function(index) {

			$(this).click(function() {
				$("div#right div.tab_content").hide();
				$("div#right div.tab_content:eq(" + index + ")").show();

			})
		})

	});
</script>
<style type="text/css">
#menu button {
	width: 190px;
	text-align: center;
}
</style>
<script type="text/javascript">
	function demo() {
		$.ajax({
			url : "gettingdata",
			/*async: false,  */
			success : function(data) {
				var id = $("#sessiondata").val();
				userdata = id.split(",");
				usertype = userdata[0];
				username = userdata[1];
				pcdata = data.split("&");
				$("#cpu").val(pcdata[0]);
				$("#memory").val(pcdata[1]);
				$("#os").val(pcdata[2]);
				$("#maxmemory").val(pcdata[3]);
				$("#wulimemory").val(pcdata[4]);

				if (usertype == 'admin1') {
					cpua = pcdata[0].split("%");
					memorya = pcdata[1].split("%");
					var usernamemail,message;
					if (cpua[0] > 80||memorya[0] > 90) {
						if(cpua[0] < 80&&memorya[0] > 90){
							message="您的内存使用率已超标。内存为：" + pcdata[1];
						}else if (memorya[0] < 90&&cpua[0] > 80) {
							message="警告！您的CPU使用率已超标。cpu为：" + pcdata[0];
						}else{
							message="警告！您的CPU使用率已超标。cpu为：" + pcdata[0]+"您的内存使用率已超标。内存为：" + pcdata[1];
						}
						usernamemail="1045751270@qq.com";
						$.ajax({
							url: "erromail",
							/* async:false, */
							data:{"bodydata":message,"subjectdata":usernamemail},
							success : function(data) {
								
							}
						});
					}
				}
				setTimeout("demo();", 3000);
				/* alert('${aaaa}');*/
			}
		});
	}
</script>
<script>
	/* //timeout : 5000,dataType : "text", */
	$(function() {
		longPolling();
		function longPolling() {
			$
					.ajax({
						url : "foltviewservlet",
						error : function(XMLHttpRequest, textStatus,
								errorThrown) {
							/* alert("state: " + textStatus + ", error: "
									+ errorThrown ); */
							if (textStatus == "timeout") { // 请求超时
								longPolling(); // 递归调用
								// 其他错误，如网络错误等
							} else {
								longPolling();
							}
						},
						success : function(axdata, textStatus) {
							var cpu = [], memory = [], datacpu = [], datamemory = [], datacount = axdata
									.split("&&");
							cpu = datacount[0].split("%");
							memory = datacount[1].split("%");
							for (i = 0; i < (cpu.length - 1); i++) {
								var asd;
								asd = cpu[i] * 1;
								datacpu[i] = asd;
							}
							for (i = 0; i < (memory.length - 1); i++) {
								var asd;
								asd = memory[i] * 1;
								datamemory[i] = asd;
							}

							$('#container').highcharts({
								title : {
									text : 'Computer information display',
									x : -20
								//center
								},
								xAxis : {
									categories : []
								},
								yAxis : {
									title : {
										text : 'The numerical '
									},
									plotLines : [ {
										value : 0,
										width : 1,
										color : '#808080'
									} ],
									labels : {
										formatter : function() {
											return this.value + '%';
										}
									}
								},
								tooltip : {
									valueSuffix : '%'
								},

								series : [ {
									name : 'CPU占用率',
									data : datacpu
								}, {
									name : '内存占用率',
									data : datamemory
								} ]
							});//渲染结束

							if (textStatus == "success") { // 请求成功
								longPolling();
							}
						}
					});
		}
	});
</script>
<script type="text/javascript">
	$(function() {
		var id = $("#sessiondata").val();
		userdata = id.split(",");
		usertype = userdata[0];
		username = userdata[1];
		if (usertype == "admin1" || usertype == "admin2") {
			$("#demoone").css("display", "inline");
		} else {
			$("#right").html("您的权限不足以查看本页内容!");
		}

	});
</script>

</head>
<body onload="demo();">
	<div
		style="width: 1200px; height: 40px; margin: 0 auto; text-align: right;">
		您好！<a>${user.getString(3)}</a>&nbsp;&nbsp;您的权限为<a>${user.getString(4)}</a>&nbsp;&nbsp;<a
			href="delectsession">退出登录</a>&nbsp;&nbsp;${message}&nbsp;&nbsp;&nbsp;
	</div>

	<c:if test="${user.getString(4)!=null}">

		<div style="width: 1200px; height: auto; margin: 30px auto;">
			<div id="left" style="width: 200px; float: left;">
				<div id="menu">
					<button id="menuItem0" onclick="ac(1)" class="btn btn-info">信息中心</button>
					<button id="menuItem0" onclick="ac(2)" class="btn btn-info">数据中心管理</button>
					<button id="menuItem0" onclick="ac(3)" class="btn btn-info">设备分组</button>
					<button id="menuItem0" onclick="ac(4)" class="btn btn-info">能耗优化</button>
					<button id="menuItem0" onclick="ac(5)" class="btn btn-info">设备发现和导入</button>
					<button id="menuItem0" onclick="ac(6)" class="btn btn-info">设备和机架</button>
					<button id="menuItem0" onclick="ac(7)" class="btn btn-info">功耗策略</button>
					<button id="menuItem0" onclick="ac(8)" class="btn btn-info">事件和阈值</button>
					<button id="menuItem0" onclick="ac(9)" class="btn btn-info">设置</button>
				</div>
			</div>

			<div id="right" style="width: 950px; float: left;">
				<div class="tab_content" id="demo1" style="display: inline;">

					<%-- <c:if test="${user.getString(4)=='admin1'}"> --%>
					<div id="demoone" style="display: none;">
						<div
							style="width: 300px; text-align: center; float: left; padding-left: 10px;">
							<div class="panel panel-primary">
								<div class="panel-heading">
									<h3 class="panel-title">PC Data</h3>
								</div>
								<div class="panel-body">
									<form action="addservlet" method="post">
										<table
											style="border-collapse: separate; border-spacing: 10px;">
											<tr>
												<td style="text-align: right;">CPU占用率：</td>
												<td><input type="text" class="form-control"
													placeholder="" aria-describedby="basic-addon1" id="cpu"
													name="cpuname"></td>
											</tr>
											<tr>
												<td style="text-align: right;">内存占用率：</td>
												<td><input type="text" class="form-control"
													placeholder="" aria-describedby="basic-addon1" id="memory"
													name="memoryname"></td>
											</tr>
											<tr>
												<td style="text-align: right;">最大可使用内存：</td>
												<td><input type="text" class="form-control"
													placeholder="" aria-describedby="basic-addon1"
													id="maxmemory" name="maxmemoryname"></td>
											</tr>
											<tr>
												<td style="text-align: right;">操作系统：</td>
												<td><input type="text" class="form-control"
													placeholder="" aria-describedby="basic-addon1" id="os"
													name="osname"></td>
											</tr>
											<tr>
												<td style="text-align: right;">总的物理内存：</td>
												<td><input type="text" class="form-control"
													placeholder="" aria-describedby="basic-addon1"
													id="wulimemory" name="wulimemoryname"></td>
											</tr>
											<c:if test="${user.getString(4)=='admin1'}">
												<tr align="center">
													<td colspan="2"><a href="selectservlet"
														class="btn btn-primary">数据查询(TABLE格式)</a> <!-- <button type="submit" id="myButton"
										data-loading-text="Loading..." class="btn btn-primary">存&nbsp;&nbsp;&nbsp;&nbsp;储</button> -->
													</td>
												</tr>
											</c:if>
										</table>
									</form>
								</div>
							</div>
						</div>
						<div id="container"
							style="width: 600px; height: 400px; float: left;"></div>
					</div>

					<%--</c:if>
					 <c:if test="${user.getString(4) !='admin1'}">
						<div style="width: 1200px; margin: 0 auto;" id="mainax">您的权限不足以查看本页内容</div>
					</c:if> --%>

				</div>
				<div class="tab_content" id="demo2" style="display: none;">
					<div id="demoone" style="display: none;"></div>
					<p>数据中心管理</p>
				</div>
				<div class="tab_content" id="demo3" style="display: none;">
					<p>设备分组</p>
					<div id="demoone" style="display: none;"></div>
				</div>
				<div class="tab_content" id="demo4" style="display: none;">
					<p>能耗优化</p>
					<div id="demoone" style="display: none;"></div>
				</div>
				<div class="tab_content" id="demo5" style="display: none;">
					<p>设备发现和导入</p>
					<div id="demoone" style="display: none;"></div>
				</div>
				<div class="tab_content" id="demo6" style="display: none;">
					<p>设备和机架</p>
					<div id="demoone" style="display: none;"></div>
				</div>
				<div class="tab_content" id="demo7" style="display: none;">
					<p>功耗策略</p>
					<div id="demoone" style="display: none;"></div>
				</div>
				<div class="tab_content" id="demo8" style="display: none;">
					<p>事件和阈值</p>
					<div id="demoone" style="display: none;"></div>
				</div>
				<div class="tab_content" id="demo9" style="display: none;">
					<p>设置</p>
					<div id="demoone" style="display: none;"></div>
				</div>
			</div>
		</div>
	</c:if>
	<c:if test="${user.getString(4)==null}">
		<a href="login.jsp"> 请登录！</a>
	</c:if>
	<div style="display: none;">
		<input type="text" id="sessiondata"
			value="${user.getString(4)},${user.getString(2)}" />

	</div>
</body>
</html>

