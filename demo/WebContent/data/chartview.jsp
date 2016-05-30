<!doctype html>
<html lang="en">
<head>
<!-- <script type="text/javascript"
	src="http://cdn.hcharts.cn/jquery/jquery-1.8.3.min.js"></script>
<script type="text/javascript"
	src="http://cdn.hcharts.cn/highcharts/highcharts.js"></script>
<script type="text/javascript"
	src="http://cdn.hcharts.cn/highcharts/exporting.js"></script> -->

<script type="text/javascript" src="static/js/jquery.min.js"></script>
<script type="text/javascript" src="static/js/highcharts.js"></script>
<script>
	$(function() {
		$('#container').highcharts(
				{
					title : {
						text : 'Computer information display ',
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
					
					series : [
							{
								name : 'CPU占用率',
								data : [ 40.0, 80.0, 60.0, 14.5 ,78.4]
							},
							{
								name : '内存占用率',
								data : [ 90.0, 56.7, 15.0, 78.6,60.4]
							}]
				});
	});
</script>
</head>
<body>
	<div id="container" style="min-width: 700px; height: 400px"></div>
</body>
</html>