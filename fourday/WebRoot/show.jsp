<%@ page language="java" import="java.util.*" pageEncoding="utf8"%>
<%
response.setCharacterEncoding("utf-8");
request.setCharacterEncoding("utf-8");
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'show.jsp' starting page</title>
    
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
  <div>
    用户名： <font color="red">${param.uname}</font>
    </div>
    <div>
    学&nbsp;&nbsp;&nbsp;号：${param.unum}
    </div>
     <div>
 性&nbsp;&nbsp;&nbsp;别：${param.sex}
    </div>
<div>
 爱&nbsp;&nbsp;&nbsp;好：${param.hobbies}
    </div>
 <div>
身份证号：${param.sfz}
    </div> 
  </body>
</html>
