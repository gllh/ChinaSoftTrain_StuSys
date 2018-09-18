package com.cqjtu.lyx.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cqjtu.lyx.dao.StudentDao;
import com.cqjtu.lyx.entity.Student;

public class StudentDelServlet extends HttpServlet {

	private StudentDao dao = new StudentDao();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String idstr = request.getParameter("id");
		int id = Integer.parseInt(idstr);
		dao.delById(id);
		List<Student> list = dao.queryAll();
		request.setAttribute("students", list);
		request.getRequestDispatcher("JSPLshowlist.jsp").forward(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}
}
