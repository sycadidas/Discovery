<!DOCTYPE HTML>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>商家后台管理登录</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta charset="utf-8">
<script type="text/javascript" src="../scripts/jquery-1.7.1.min.js"></script>
<script type="text/javascript" src="../scripts/checkCode.js"></script>
<script type="text/javascript">
window.onload=function()//用window的onload事件，窗体加载完毕的时候 加载验证码
{
   createCode();
}
</script>

<link href="../styles/pngStyle.css" rel="stylesheet">	
<link href="../styles/login.css" rel="stylesheet">	
<link href="../styles/checkCodeStyle.css" rel="stylesheet">	
<style type="text/css">
	.imagesStyle {
	CURSOR:pointer;
}
</style>
</head>
<body>
	 <div class="header-login">
		<div class="wrap-990">
			<img width="167" height="50" src="../images/logo.png" />
		</div>
	</div> 
	
	<div class="wrap-990">
		<div class="main-login clearfix">
			<div class="left-login">
				<div class="thumb"><!-- 方块图 -->
					<a href="#">
						<!-- Label -->
						<span>孙-燕-臣</span>
					</a>
				</div>
			</div>
			<div class="right-login">
				<h3>商家后台管理系统</h3>
				<form name="userForm" method="post" id="userForm">
					<div class="inpl-wrap">
						<input class="inp-text" type="text" name="username" id="username"
							placeholder="用户名" value=""/>
						<p class="inp-notice" style="display:none" id="usernamenotice"></p>
					</div>
					<div class="inpl-wrap">
						<input class="inp-text" name="password" id="password"
							type="password" placeholder="密码" value=""/>
						<p class="inp-notice" id="passwordnotice" style="display:none"></p>
					</div>
					 <div>
						  <table border="0" cellspacing="5" cellpadding="5" >
						   <tr>
						    <td><div class="code" id="checkCode" onclick="createCode()" ></div></td>
						    <td><input class="inp-text-yzm" name="password" id="inputCode"
							type="text" placeholder="验证码" value=""/></td>
						   </tr>
						  </table>
					 </div>
					
					<a href="javascript:void(0);" class="btn btn-login" id="BtnOk" onclick="doLogin()">登 录</a>
				</form>
			</div>
		</div>
		<div class="footer footer-login">
		<a href="http://127.0.0.1:8080/Discovery/abc">国美在线</a>
			<p>©2000-2016 国美在线(gome.com.cn)版权所有    京公网安备11010502027062    沪ICP备11009419号    沪B2-20120004号</p>
		</div>
	</div>
</body>
<script type="text/javascript">
function doLogin(){
flag1 = validateCode();//校验验证码是否正确
flag2 = validateusercode();
	if(flag1==true&&flag2==true){
		var username = $("#username").val();
		var password = $("#password").val();
		 $.ajax({  
			     url:'http://127.0.0.1:8080/Discovery/check/user',// 跳转到 action  
			      data:{  
			    	  "username" : username,
			    	  "password" :password
			      },  
			     type:'post',  
			     cache:false,  
			     dataType:'json',  
			     success:function(data) {
			    	 if(data==true){
			    		 window.location.href = "http://127.0.0.1:8080/Discovery/load/script"
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
