<%@page import="com.cqjtu.entity.Student"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'stulist.jsp' starting page</title>
    
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
	border:1px solid blue;
	border-collapse:collopse;
	width:100%
	}
	td{
	border:1px solid black;
	}
	</style>
    <%
    //从request中取出集合
    List<Student>list=(List<Student>)request.getAttribute("students");
     %>
  </head>
  
  <body>
    <table>
    <tr>
         <td>学号</td>
         <td>姓名</td>
         <td>性别</td>
         <td>年龄</td>
    </tr>
    <%
    for(Student s:list){
       %>
       <tr>
           <td><%=s.getStudo()%></td>
           <td><%=s.getName()%></td>
           <td><%=s.getGender()%></td>
           <td><%=s.getAge()%></td>
       </tr>
       <%
      }
     %>
    </table>
  </body>
</html>
