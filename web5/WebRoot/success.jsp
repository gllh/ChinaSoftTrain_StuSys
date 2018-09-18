<%@page import="cqjtu.com.Dao.UserHeadName"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page  import="java.io.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<%
	//从request中取出集合
	List<UserHeadName> list = (List<UserHeadName>)request.getAttribute("upfilename");
	%>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'success.jsp' starting page</title>
    
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
    		<td>学号</td>
    		<td>姓名</td>
    		<td>头像路径</td>
    		<td>头像</td>
    	</tr>
    	<%
    	if(list != null){
    		for(UserHeadName s : list){ 
        		%>
        		<tr>
        			<td><%=s.getId() %></td>
        			<td><%=s.getName() %></td>
        			<td>E:\upload\<%=s.getImage()%></td>
        	<!-- 	<td><img alt="aaa" src="E:\\uplad\\<%=s.getImage()%>"></td> -->
        	<td><img alt="aaa" src="E:\upload\xjj.jpg"></td>
        			</tr>
        		<%
        	}
    	}
    	%>
    	 </table>
  </body>
</html>
