<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!-- 引入自定义标签 -->
<%@taglib uri="http://www.5retc.com/taglib" prefix="abc" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
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
  主页
 <div>
  <%---
  String val=(String)request.getAttribute("uname");
  if(val!=null&&!val.equals("")){
  %>
  <font color='red'><%=val %></font>
  <% 
  }
   %>
   <abc:printReqAttr attr="uname"/>
   --%>
   
   <!-- el -->
  <!-- el -->
   	 用户名：<font color='red'> ${requestScope.uname }</font>
   </div>

   <div>密码：${param.pwd } </div>
    <div>状态码：${param.state } </div>
  </body>
</html>
