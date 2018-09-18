<%@page import="fourday.student"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'list.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

 
<% List<student>list=(List<student>) request.getAttribute("student"); %>
  </head>
  
  <body>
  <center>学生信息表</center>
  <br>
  <center>  <table>
   		<tr>
   			<td><center>学号</center></td>
   			<td><center>姓名</center></td>
   			<td><center>性别</center></td>
   			<td><center>年龄</center></td>
   			<td><center>是否成年</center></td>
   		
   <c:forEach items="${requestScope.student }" var="stu">
   <tr>
   		<td>${stu.stuno}</td>
   		<td>${stu.name }</td>
   		<td>${stu.gender}</td>
   		<td>${stu.age}</td>
   		<td>
   			<c:choose>
   				<c:when test="${stu.age>=18 }">成年</c:when>
   				<c:otherwise><font color='red'>未成年</font></c:otherwise>
   			</c:choose>	
   		</td>
   </tr></c:forEach>
  
   </table><br>
   <a href="studentadd.jsp"> <input type="submit" value="添加"></a>
   </center>
  </body>
</html>
