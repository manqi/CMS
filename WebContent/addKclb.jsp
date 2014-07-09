<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html lang="zh-cn">
 <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>新增课程类别</title>

	<script type="text/javascript">
		function submitKclb()
		{
			//document.write(Date());
			var myform=document.forms[0];
			myform.action="Kclb/addKclb_success";
			myform.method="post";
			myform.submit();
		}
	</script>
</head>
  
  
<body>
	<h3>课程类别新增</h3>
	<form id="myform1" >
		课程类别码：<input type="text" name="kclb.kclbId" style="height:30px"class="span3"/>
		课程类别：<input type="text" name="kclb.kclb" style="height:30px" class="span3">
		课程性质：<input type="text" name="kclb.classType" style="height:30px"class="span3"/>
		序         	号：<input type="text" name="kclb.cId" style="height:30px" class="span3">
		是否需要重考：<input type="text" name="kclb.reset" style="height:30px"class="span3"/>
		是否需要重修:<input type="text" name="kclb.retake" style="height:30px" class="span3">
		<input type="button" name="btnadd" onclick="submitKclb()" value="提交" />
	 </form>
</body>
</html>	
