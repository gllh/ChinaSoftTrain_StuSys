<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!-- 引入自定义标签 -->
<%@taglib uri="http://www.5retc.com/taglib" prefix="abc" %>
<%

request.setCharacterEncoding("utf-8");
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>show</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
  显示页面  
  <div>
  <!-- el -->
   	 真实姓名：<font color='red'> ${param.realname }</font>
   </div>
   <div>身份证号：${param.idno } </div>
    <div>性别：${param.gender } </div>
    <div>爱好：${paramValues.hobbies[0] }
     ${paramValues.hobbies[1] }
     ${paramValues.hobbies[2] }</div>
    
  </body>
</html>