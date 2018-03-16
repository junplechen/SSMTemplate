<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title></title>
	<link href="https://cdn.bootcss.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet">
	<link href="<%=application.getContextPath()%>/resources/css/main.css" rel="stylesheet">
</head>
<body class="login-page">
    
    
    <div class="login-panel">
    	<form action="" method="post">
    		<h2 style="color: white;">登录</h2>
    		<input type="text" class="form-control login-form" id="username" placeholder="用户名"/>
    		<input type="password" class="form-control login-form" id="password" placeholder="密码"/>
    		<h6 id="login-hint">&emsp;</h6>
    		<button type="button" class="btn btn-info btn-login">登录</button>
    	</form>
    </div>
    <div class="bottom">
    <h4 class="power">power by junple</h4>
    </div>
    
    <script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="<%=application.getContextPath()%>/resources/js/main.js"></script>
    <script type="text/javascript">
    	$(document).ready( function(){
    		
    		
    		$(".btn-login").click( function(){
    			
    			var username = $("#username").val();
    			if( username=="") {
    				$("#login-hint").text("请输入用户名");
    				return;
    			}
    			var password = $("#password").val();
    			if( password=="") {
    				$("#login-hint").text("请输入密码");
    				return;
    			}
    			$("#login-hint").text("         ");
    		});
    	});
    </script>
</body>
</html>