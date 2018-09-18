<%@ page language="java" import="java.util.*" pageEncoding="utf8"%>
<%@taglib uri="http://www.5retc.com/taglib"  prefix="lyq"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'main.jsp' starting page</title>
    
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
    <lyq:printAttr attr="uname"/><br>
   用户名： <font color="red">${requestScope.uname}</font>
    <div>
    密&nbsp;码：${param.pwd}
    </div>
     <div>
   状态码：${param.state}
    </div>
  </body>
</html>
