<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page  import="java.io.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String name=(String)session.getAttribute("currName");
if(name==null){
	session.setAttribute("errmsg", "Login First");
	request.getRequestDispatcher("/Login.jsp").forward(request, response);
}
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
<style type="text/css">
a{
	font-family: 'Montserrat',sans-serif;
	font-size:50px;
	color:#fff;
}
body{
text-align:center;
}
</style>
  </head>
  
  <body background="BackgroundImage.jpg">
   
   <%-- <%@include file="inner.jsp" %><br /> --%>
    <a text-align="center" href="StudentListServlet">查看学生列表</a>
  </body>
</html>
