package com.cqjtu.lyx.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cqjtu.lyx.dao.StudentDao;
import com.cqjtu.lyx.entity.Student;
public class StudentListServlet extends HttpServlet {
	
	private StudentDao dao = new StudentDao();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		List<Student> list = dao.queryAll();
		System.out.println("11111111111111111111");
		System.out.println(list);
		request.setAttribute("students", list);
		request.getRequestDispatcher("JSPLshowlist.jsp").forward(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}
}




