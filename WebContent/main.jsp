<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-cn">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>课程管理</title>

    <!-- Bootstrap -->
    <link href="js/site.css" rel="stylesheet">
		<script  src="./js/jquery.min.js"></script>
	<script  src="./js/bootstrap.min.js"></script>
	<script  src="./js/holder.min.js"></script>
	<script  src="./js/application.js"></script>
	<script  src="./js/me.js"></script>

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="http://cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
	</head>
<body>
	<header  class="navbar navbar-inverse navbar-fixed-top docs-nav"  role="banner">
	<img src="1.jpg" style="float:left;">
	<div>
	<p style="color:white;font-size:250%;">欢迎来到中大课程管理系统</p>
	</div>
	<div class="nav navbar-nav navbar-right">
    <a  href="login.html" style="float:right;">注销</a>
	</div>
	</ul>
	</header>
    </div>
		<div  class="col-md-3">
				<div id="toc">
					<ul class="nav sidenav">
					<li><img onClick="Changedisplay1()" src="2.png">课程类别</li>
						<ul id="hiden1">
						<li>课程类别管理</li>
							<ul>
							<li><a onclick="QueryKclb()">查询</a></li>
							<li><a onclick="AddKclb()">新增</a></li>
							<li><a onclick="ModifyKclb()"></a>修改</li>
							<li>删除</li>
							<li>导出</li>
							</ul>
						<li>课程类别和培养类别对应管理</li>
						<ul>
						<li>查询</li>
						<li>修改</li>
						</ul>
					</ul>
				<li><img onClick="Changedisplay2()" src="2.png">课程类别细类</li>
					<ul id="hiden2">
					<li>课程类别细类管理</li>
						<ul>
						<li>查询</li>
						<li>新增</li>
						<li>修改</li>
						<li>删除</li>
						</ul>
					</ul>
				<li><img onClick="Changedisplay3()" src="2.png">课程类别细类模块</li>
					<ul id="hiden3">
					<li>课程类别细类模块管理</li>
						<ul>
						<li>查询</li>
						<li>新增</li>
						<li>修改</li>
						<li>删除</li>
						</ul>
					</ul>
				<li><img onClick="Changedisplay4()" src="2.png">课程库</li>
					<ul id="hiden4">
					<li>课程库管理</li>
						<ul>
						<li>查询</li>
						<li>新增</li>
						<li>修改</li>
						<li>删除</li>
						<li>导出</li>
						</ul>
					<li>课程库新增课程申请</li>
						<ul>
						<li>查询</li>
						<li>新增</li>
						<li>修改</li>
						<li>删除</li>
						<li>导出</li>
						<li>提交</li>
						</ul>
					<li>课程库新增课程审批</li>
						<ul>
						<li>查询</li>
						<li>审批</li>
						<li>导出</li>
						</ul>
					<li>先修课程关系设定申请</li>
						<ul>
						<li>查询</li>
						<li>新增</li>
						<li>修改</li>
						<li>删除</li>
						<li>提交</li>
						</ul>
					<li>先修课程关系设定审批</li>
						<ul>
						<li>查询</li>
						<li>审批</li>
						<li>导出</li>
						</ul>
					</ul>
				</ul>
			</div>
		</div>
	<div class="col-md-9" id="movedown">
		<IFRAME id="ifmSignIn" frameborder="no" scrolling="no" onLoad="iFrameHeight()" width="100%" height="100%" name="ifmSignIn" src="head.jsp"></IFRAME>
	</div>

  </body>
</html>	