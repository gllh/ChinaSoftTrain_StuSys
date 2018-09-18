package com.zr.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zr.dao.StudentDao;
import com.zr.entity.Student;

public class StudentChangeServlet extends HttpServlet {

	private StudentDao dao = new StudentDao();
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");	
		response.setContentType("text/html;charset=utf-8");
		//获取参数id
		
		String stringid = request.getParameter("id");
		String stuno=request.getParameter("changestuno");
		String stuno1=new String(stuno.getBytes("iso-8859-1"),"utf-8");
//		System.out.println("s"+stuno1);
		String name=request.getParameter("changename");
		String name1=new String(name.getBytes("iso-8859-1"),"utf-8");
//		System.out.println("sss"+name);
		String sex=request.getParameter("changesex");
		String sex1=new String(sex.getBytes("iso-8859-1"),"utf-8");
//		System.out.println("sssssss"+sex);
		String stringage=request.getParameter("changeage");
//		System.out.println("ssssssssss"+stringage);
		int id = Integer.parseInt(stringid);
//		System.out.println("sssssssssssss"+id);
		int age = Integer.parseInt(stringage);
//		System.out.println("ssssssssssssssssss"+age);
		
		//调用dao方法修改
		dao.changeById(id, stuno1, name1, sex1, age);
		List<Student> list = dao.queryAll();
		request.setAttribute("students", list);
		//跳转回列表页面
		request.getRequestDispatcher("stulist.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}


	

}
