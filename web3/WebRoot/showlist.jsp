<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'showlist.jsp' starting page</title>
    
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
    <table>
    <tr>
    	<th>id</th>
    	<th>name</th>
    	<th>sex</th>
    	<th>age</th>
    	<th>成年/未成年</th>
  </tr>
  <c:forEach items="${requestScope.list }" var="stu">
  	<tr>
  	<td>${stu.stuno }</td>
  	<td>${stu.name }</td>
  	<td>${stu.gender }</td>
  	<td>${stu.age }</td>
  	<td>
  		<c:choose>
  			<c:when test="${stu.age>=18 }">成年</c:when>
  			<c:otherwise><font color='red'>未成年</font></c:otherwise>
  		</c:choose>
  		</td>
  	</tr>
  </c:forEach>
    </table>
  </body>
</html>
