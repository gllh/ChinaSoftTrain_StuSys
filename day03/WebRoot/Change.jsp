<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String name=(String)session.getAttribute("currName");
if(name==null){
	session.setAttribute("errmsg", "Login First");
	request.getRequestDispatcher("/Login.jsp").forward(request, response);
}
String id=request.getParameter("id");
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
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
h2{
	font-family: 'Montserrat',sans-serif;
	font-size:50px;
	font-weight:400;
	letter-spacing: -1px;	
	color:#fff;
}
input[type="text"]{
font-size:1.4em;
height:2.3em;
border-radius:4px;
border:1px solid #c8cccf;
color:#6a6f77;
text-align:center;
}
input[type="submit"]{
font-size:1.4em; 
height:2.3em;
border-radius:10px; 
border:1px solid #c8cccf;设置输入框边框的粗细和颜色
color:#6a6f77; 设置输入框中文字的颜色
outline:0; 将输入框点击的时候出现的边框去掉
text-align:center; 设置输入框中文字的位置
}
</style>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Change.jsp' starting page</title>
    
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
  <form method="get" action="StudentChangeServlet">
    <h1 align="center">修改学生信息</h1>
    <table>
    	<tr>
    		<th>id</th>
    		<th>学号</th>
    		<th>姓名</th>
    		<th>性别</th>
    		<th>年龄</th>
    		<th>操作</th>
    	</tr>
    	<tr>        <td><select name="id">
 						<option value=<%=id %>><%=id %></option>
     					</select>
     					</td>
        			<td><input type="text" name="changestuno" /></td>
        			<td><input type="text" name="changename"/></td>
        			<td><input type="text" name="changesex" /></td>
        			<td><input type="text" name="changeage" /></td>
        			<td><input type="submit" value="修改"/></td>
        			<!-- <td><a href="StudentChangeServlet?id=<%=id %>">修改</a> -->
 	
        			</td>
        		</tr>	
        		 </form>
        		  </table>
        <a href="Change.jsp?id=<%=id %>" style="font-family: Montserrat;color:#fff;display: block; text-align: center;font-family: 'Montserrat';font-size:30px;">重置</a>  		  
  </body>
</html>
