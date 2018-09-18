package com.rj.tag;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rj.entity.Student;

public class ListServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//构造学生集合
		List<Student> list=new ArrayList<Student>();
		list.add(new Student(1,"stu001","张三","男",16));
		list.add(new Student(2,"stu002","李四","男",20));
		list.add(new Student(3,"stu003","王五","女",21));
		list.add(new Student(4,"stu004","陈六","女",17));
		list.add(new Student(5,"stu005","宋七","男",23));
		
		//将数据放入request中，传递到页面
		request.setAttribute("list", list);
		request.getRequestDispatcher("list.jsp").forward(request, response);
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);

	}
}
