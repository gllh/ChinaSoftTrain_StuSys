<%@page import="com.cqjtu.lyx.entity.Student"%>
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
h1{
	font-family: 'Montserrat',sans-serif;
	font-size:50px;
	font-weight:400;
	letter-spacing: -1px;
	
	color:#fff;
}
	</style>
	<%
	//从request中取出集合
	List<Student> list = (List<Student>)request.getAttribute("students");
	%>
	 
  </head>
  
  <body background="BackgroundImage.jpg">
  <h1 align="center">学生信息列表</h1>
    <table>
    	<tr>
    		<th>学号</th>
    		<th>姓名</th>
    		<th>性别</th>
    		<th>年龄</th>
    		<th>专业</th>
    		<th>操作</th>
    	</tr>
    	<c:forEach items="${requestScope.students }" var="stu">
        		<tr >
        			<td style="background:#f2f2f2" onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#f2f2f2';">${stu.stuno }</td>
  					<td style="background:#f2f2f2" onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#f2f2f2';">${stu.name }</td>
  					<td style="background:#f2f2f2" onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#f2f2f2';">${stu.gender }</td>
  					<td style="background:#f2f2f2" onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#f2f2f2';">${stu.age }</td>
  					<td style="background:#f2f2f2" onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#f2f2f2';">${stu.major }</td>
        			<td style="background:#f2f2f2" onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#f2f2f2';">
        			<div align="center">
        			<input type = "button" style="color:red;" value = "删除" onclick = "window.location.href = 'StudentDelServlet?id=${stu.id }'">
        			<input type = "button" style="color:green;" value = "修改" onclick = "window.location.href = 'Change.jsp?id=${stu.id}'">
        			</div>
        			</td>
        		</tr>
    	</c:forEach>
    </table>
    </br>
    <div align="center"><input type = "button" style="font-size:25px; color:#000000;padding:10px 30px;border-radius: 5px;"value = "在此添加学生" onclick = "window.location.href = 'add.jsp'"></div>	

  </body>
</html>