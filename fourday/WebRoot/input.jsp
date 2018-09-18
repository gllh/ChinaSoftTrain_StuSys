<%@ page language="java" import="java.util.*" pageEncoding="utf8"%>
<%
response.setCharacterEncoding("utf-8");
request.setCharacterEncoding("utf-8");
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'input.jsp' starting page</title>
    
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
    <form method="post" action="show.jsp" >
 <center><h2>信息收集</h2> <br>
 <table width="408" border="1" cellpadding="5" cellspacing="0"><!--cellpadding表示的是单元与单元之间的距离，spacing是内容-->
 <tr><td colspan="2" width=211><center>信息录入   </center></td></tr>  <!--让他占2列colspan所写2 -->
 
   <tr><td width="16" bgcolor="#f0f0f0">姓名：</td>
   <td width="221">
   <input type="text" name="uname"placeholder="请输入姓名"/><br>
   </td></tr>
    <tr><td width="16" bgcolor="#f0f0f0">学号：</td>
   <td width="221">
   <input type="text" name="unum"placeholder="请输入学号"/><br>
   </td></tr>
    <tr><td width="161" bgcolor="#f0f0f0">性别：</td>
       <td width="221">
   <input type="radio" value="男" name="sex"/>男
     <input type="radio" value="女" name="sex"/>女<br>
     </td></tr>
 <tr>
   <tr><td width="161" bgcolor="#f0f0f0">身份证号：</td>
   <td width="221">
   <input name="sfz"placeholder="请输入身份证号"/><br>
    </td></tr>
      
   <tr>
   <tr><td width="161" bgcolor="#f0f0f0">爱好：</td>
   <td width="221">
  看书<input type="checkbox"name="hobbies"value="看书">
购物<input type="checkbox"name="hobbies"value="购物">
运动<input type="checkbox"name="hobbies"value="运动">
    </td></tr>
      
<tr><td colspan="2" width=211><center> <input type="submit" value="提交"/></center>  </td></tr> 

</td></tr>
  </form>
  </body>
</html>
