package com.cqjtu.lyx.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UserRedirectServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String uname=request.getParameter("uname");
		String upwd=request.getParameter("upwd");
		if("haha".equals(uname)&&"123".equals(upwd)){
			String saveday=request.getParameter("saveday");
			if(saveday!=null&&!saveday.equals("-1")){
				int day=Integer.parseInt(saveday);
				Cookie cname=new Cookie("username",uname);
				Cookie cpwd=new Cookie("userpwd",upwd);
				cname.setMaxAge(day*24*3600);
				cpwd.setMaxAge(day*24*3600);
				response.addCookie(cname);
				response.addCookie(cpwd);
				System.out.println(cname);
				System.out.println(cpwd);
			}
			HttpSession session=request.getSession();
			session.setAttribute("currName", uname);
			ServletContext sc=this.getServletContext();
			response.sendRedirect("/StudentSys/index.jsp");
		}
		else{
			response.sendRedirect("/StudentSys/FailLogin.jsp");
		}
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}
}
