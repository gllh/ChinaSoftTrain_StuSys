package com.rj.listener;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class userservlet extends HttpServlet {
   
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//获取表单提取的数据
		String uname=request.getParameter("username");
		String upwd=request.getParameter("userpwd");
		
		if("zhangsan".equals(uname)&&"123".equals(upwd)){
			
			//将用户名保存到session中
			HttpSession session=request.getSession();
			session.setAttribute("currName", uname);
			//将用户名保存到request中
			request.setAttribute("abc", uname);
			//登录人数+1
			ServletContext sc=this.getServletContext();
			Integer count=(Integer)sc.getAttribute("count");
			if(count!=null){
				count++;
			}else{
				count=1;
			}
			sc.setAttribute("count", count);
			//跳转到成功页面
			//response.sendRedirect("/success.jsp");
			request.getRequestDispatcher("success.jsp").forward(request,response);
		}else{
			//跳转到失败页面
			response.sendRedirect("fail.jsp");
		}
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}


}
