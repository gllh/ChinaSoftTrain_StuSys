<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
<style type="text/css">
h1{
	font-family: 'Montserrat',sans-serif;
	font-size:50px;
	font-weight:400;
	letter-spacing: -1px;
	
	color:#fff;
}
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
input[type="text"]{
font-size:1em;
height:2.3em;
border-radius:4px;
border:1px solid #c8cccf;
color:#6a6f77;
text-align:center;
}
input[type="submit"]{
font-size:1em; 
height:2.3em;
border-radius:10px; 
border:1px solid #c8cccf;设置输入框边框的粗细和颜色
}
</style>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'add.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body background="BackgroundImage.jpg">
  <%
   %>
  <h1 align="center">欢迎添加学生</h1>
     <table >
    	<tr>
    		<th>id</th>
    		<th>学号</th>
    		<th>姓名</th>
    		<th>性别</th>
    		<th>年龄</th>
    		<th>操作</th>
    	</tr>
    	<form action="StudentAddServlet" method="get">
        		<tr>
        			<td><input type="text" name="addid" /></td>
        			<td><input type="text" name="addstuno" /></td>
        			<td><input type="text" name="addname" /></td>
        			<td><input type="text" name="addsex" /></td>
        			<td><input type="text" name="addage" /></td>
        			<td><input type="submit" value="添加"/></a>	
        			</td>
        			
        		</tr>
        		</form>
    </table>
<a href="add.jsp" style="font-family: Montserrat;color:#fff;display: block; text-align: center;font-family: 'Montserrat';font-size:30px;">重置</a>
    
  </body>
</html>
