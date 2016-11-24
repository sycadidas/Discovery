<!DOCTYPE HTML>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
<title>Login</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>

<link href="../styles/style.css" rel='stylesheet' type='text/css' />
<script type="text/javascript" src="../scripts/jquery-1.7.1.min.js"></script>
</head>
<body>
<script>$(document).ready(function(c) {
	$('.close').on('click', function(c){
		$('.login-form').fadeOut('slow', function(c){
	  		$('.login-form').remove();
		});
	});
});
</script>
 <!--SIGN UP-->
 <h1>gonna be fun</h1>
<div class="login-form">
	<div class="close"> </div>
		<div class="head-info">
			<label class="lbl-1"> </label>
			<label class="lbl-2"> </label>
			<label class="lbl-3"> </label>
		</div>
			<div class="clear"> </div>
	<div class="avtar">
		<img src="../images/avtar.png" />
	</div>
			<form>
					<input id="username" type="text" class="text" placeholder="Username">
		<div class="key">
					<input id="password" type="password" placeholder="Password">
	    </div>
			</form>
	<div class="signin">
		<input type="submit" value="Login" onclick="doLogin()" >
	</div>
</div>
</body>
<script type="text/javascript">
function doLogin(){
flag = validateusercode();
	if(flag==true){
		var username = $("#username").val();
		var password = $("#password").val();
		 $.ajax({  
			     url:"<%=basePath %>check/user",// 跳转到 action  
			      data:{  
			    	  "username" : username,
			    	  "password" :password
			      },  
			     type:'post',  
			     cache:false,  
			     dataType:'json',  
			     success:function(data) {
			    	 if(data==true){
			    		 window.location.href = "<%=basePath %>load/script"
			    	 }else{
			    		 alert("用户名或者密码错误");
			    	 }
			      }  
			 });
	}
}
function validateusercode(){
	if($("#username").val()!=''&&$("#password").val()!=''){
		return true;
	}else{
		alert('用户名或密码不能为空');
		return false;
	}
}
</script>
</html>
