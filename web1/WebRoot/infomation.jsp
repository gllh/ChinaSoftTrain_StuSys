<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'infomation.jsp' starting page</title>
    
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
    <form action="servlet/show_stu_info" method="post">
    <h2>信息</h2>
    姓名：<input type="text" name="uname"><br/>
    身份证号码：<input name="sfz"/><br/>
    性别：
    <input type="radio" name="gender" value="男"/>男
     <input type="radio" name="gender" value="女"/>女
     <br/>
     国籍：
     <select name="country">
     	<option value="CN">China</option>
      	<option value="US">USA</option>
      	<option value="EN">Brtish</option>
      	<option value="CA">Canada</option>
     </select>
     <br/>
     入学时间：
     <select name="year">
     	<option value="2013">2013</option>
      	<option value="2014">2014</option>
      	<option value="2015">2015</option>
      	<option value="2016">2016</option>
     </select>  年
     <select name="month">
     	<option value="1">1</option><option value="2">2</option><option value="3">3</option>
      	<option value="4">4</option><option value="5">5</option><option value="6">6</option>
      	<option value="7">7</option><option value="8">8</option><option value="9">9</option>
      	<option value="10">10</option><option value="11">11</option><option value="12">12</option>
     </select>月
      <br/>
      学院：<input type="text" name="uxueyuan"><br/>
  专业：<input type="text" name="umajor"><br/>
  爱好：<input type="text" name="uhobby"><br/>
     <input type="submit" value="提交信息"/>
   </form>
  </body>
</html>
