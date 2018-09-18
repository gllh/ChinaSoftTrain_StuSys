<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
request.setCharacterEncoding("utf-8");
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>input</title>
    
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
    <form action="show.jsp" method="post">
    <h2>学生信息收集：</h2>
	真实姓名:<input name="realname"><br />
	身份证号:<input name="idno"/><br />
	性别：
    	 男<input type="radio" name="gender" value="男" />
     	 女<input type="radio" name="gender" value="女" /><br />
	爱好：
    	看书<input type="checkbox" name="hobbies"  value="看书"/> 
    	 购物<input type="checkbox" name="hobbies"  value="购物" /> 
    	运动<input type="checkbox" name="hobbies"  value="运动"/><br />
	<input type="submit" value="提交"/><br />
	</form>
</body>
</html>
