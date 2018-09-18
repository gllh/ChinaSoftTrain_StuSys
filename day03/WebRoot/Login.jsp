<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>学生管理系统</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
h1{
	font-family: 'Montserrat',sans-serif;
	font-size:50px;
	font-weight:400;
	letter-spacing: -1px;
	
	color:#fff;
}
input[type="text"],[type="password"]{
font-size:1.4em;
height:2.7em;
border-radius:4px;
border:1px solid #c8cccf;
color:#6a6f77;
text-align:center;
}
input[type="submit"]{
font-size:1.4em; 
height:2.7em;
border-radius:10px; 
border:1px solid #c8cccf;设置输入框边框的粗细和颜色
color:#6a6f77; 设置输入框中文字的颜色
outline:0; 将输入框点击的时候出现的边框去掉
text-align:center; 设置输入框中文字的位置
}
body{
text-align:center;
}

</style>
  </head>
  
  <body background="BackgroundImage.jpg">
  		<h1 align="center">学生管理系统</h1>
  		<div style="color:red;">
  			${errmsg }
  		</div>		
  		<br/>
  		<br/>
  		<br/>
 		<form method="get" action="servlet/UserRedirectServlet">
   	 		<input type="text" name="uname" placeholder="用户名(haha)" /><br/>
   	 		<br/>
   	 		<input type="password" name="upwd" placeholder="密码(123)"/><br/>
   	 		<br/>
    		<input type="submit" value="login"/>
 		</form>	
 		<br/>
 		<br/>
 		<br/>
 		<h4>Sql Server数据库版学生管理系统，添加、修改、全部学生列表等页面有登录限制</h4>
  </body>
</html>
