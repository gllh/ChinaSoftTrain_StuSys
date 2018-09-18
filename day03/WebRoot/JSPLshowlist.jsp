<%@page import="com.zr.entity.Student"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page  import="java.io.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
	table{
	border: 1px solid gray;
	border-collapse: collapse;
	width:100%;
	}
	td {
    border-width: 1px;
    padding: 8px;
    border-style: solid;
    border-color: #666666;
    background-color: #ffffff;
}
	th {
    border-width: 1px;
    padding: 8px;
    border-style: solid;
    border-color: #666666;
    background-color: #dedede;
}
	</style>
	<%
	//从request中取出集合
	List<Student> list = (List<Student>)request.getAttribute("students");
	%>
	 
  </head>
  
  <body background="BackgroundImage.jpg">
    <table>
    	<tr>
    		<th>学号</th>
    		<th>姓名</th>
    		<th>性别</th>
    		<th>年龄</th>
    		<th>操作</th>
    	</tr>
    	<c:forEach items="${requestScope.students }" var="stu">
        		<tr >
        			<td onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#ffffff';">${stu.stuno }</td>
  					<td onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#ffffff';">${stu.name }</td>
  					<td onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#ffffff';">${stu.gender }</td>
  					<td onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#ffffff';">${stu.age }</td>
        			<td onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#ffffff';"><a href="StudentDelServlet?id=${stu.id }">删除</a>
        		<a href="Change.jsp?id=${stu.id } %>">修改</a>	
        			</td>
        		</tr>
    	</c:forEach>
    </table>
    <a href="add.jsp"style="font-family: Montserrat;color:#fff;display: block; text-align: center;font-family: 'Montserrat';font-size:30px;">在此添加学生</a>
  </body>
</html>









