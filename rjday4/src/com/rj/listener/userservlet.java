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
		//��ȡ����ȡ������
		String uname=request.getParameter("username");
		String upwd=request.getParameter("userpwd");
		
		if("zhangsan".equals(uname)&&"123".equals(upwd)){
			
			//���û������浽session��
			HttpSession session=request.getSession();
			session.setAttribute("currName", uname);
			//���û������浽request��
			request.setAttribute("abc", uname);
			//��¼����+1
			ServletContext sc=this.getServletContext();
			Integer count=(Integer)sc.getAttribute("count");
			if(count!=null){
				count++;
			}else{
				count=1;
			}
			sc.setAttribute("count", count);
			//��ת���ɹ�ҳ��
			//response.sendRedirect("/success.jsp");
			request.getRequestDispatcher("success.jsp").forward(request,response);
		}else{
			//��ת��ʧ��ҳ��
			response.sendRedirect("fail.jsp");
		}
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}


}
