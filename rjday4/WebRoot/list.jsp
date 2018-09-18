<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!-- 引入jstl标签库 -->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
	<style type="text/css" >
	table{
	border:1px solid gray;
	border-collapse:collapse;
	width:100%;
	}
	td{
	border:1px solid gray;
	}
	th{
	border:1px solid gray;
	}
	</style>
  </head>

  <body>
 <form action="ListServlet" method="post">
 <table>
    	<tr>
    	    <td>编号</td>
    		<td>学号</td>
    		<td>姓名</td>
    		<td>性别</td>
    		<td>年龄</td>
    		<td>成年/未成年 </td>
    	</tr>
    	<c:forEach items="${requestScope.list}" var="stu">
    	<tr>
    	<td>${stu.id }</td>
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
    </form>
  </body>
</html>
