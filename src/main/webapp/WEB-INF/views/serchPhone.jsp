<!DOCTYPE HTML>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>	
<html>
<head>
<script type="text/javascript" src="../scripts/jquery-1.7.1.min.js"></script>
</head>
<body>
<input id="pnumb" type="text" placeholder="请输入电话查询" />
<input id="serch" type="button" value="查询" onclick="serch()"/>
<div id="pi" style="width: 350px;height: 50px;margin-top: 35px">

</div>
</body>
<script type="text/javascript">
function serch(){
			var pnumb = $("#pnumb").val();
			 $.ajax({  
				     url:"<%=basePath %>load/getInfo",
				      data:{  
				    	  "pnumb" : pnumb
				      },  
				     type:'post',  
				     cache:false,  
				     dataType:'json',  
				     success:function(msg) {
				    	 msg = eval(msg);
				    	 $("#pi").html(msg.data);
				      }  
				 });
		}
</script>
</html>