package com.cqjtu.edu;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cqjtu.Dao.StudentDao;
import com.cqjtu.entity.Student;

public class StudentListServlet extends HttpServlet {

	private StudentDao dao=new StudentDao();
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//构造一集合
		List<Student> list=dao.queryAll();
//		List<Student>list=new ArrayList<Student>();
//		list.add(new Student(1,"stu01","张","男",20));
//		list.add(new Student(2,"stu02","李","男",21));
//		list.add(new Student(3,"stu03","王","男",22));
//		list.add(new Student(4,"stu04","钱","女",23));
//		list.add(new Student(5,"stu05","孙","女",24));
		//将数据放入request，传入页面中
		request.setAttribute("students",list);
		request.getRequestDispatcher("/stulist.jsp").forward(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
		
	}
	
}
