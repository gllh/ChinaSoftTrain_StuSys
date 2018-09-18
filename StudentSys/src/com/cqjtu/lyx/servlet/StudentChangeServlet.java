package com.cqjtu.lyx.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cqjtu.lyx.dao.StudentDao;
import com.cqjtu.lyx.entity.Student;

public class StudentChangeServlet extends HttpServlet {

	private StudentDao dao = new StudentDao();
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");	
		response.setContentType("text/html;charset=utf-8");
		String stringid = request.getParameter("id");
		String stuno=request.getParameter("changestuno");
		String stuno1=new String(stuno.getBytes("iso-8859-1"),"utf-8");
		String name=request.getParameter("changename");
		String name1=new String(name.getBytes("iso-8859-1"),"utf-8");
		String sex=request.getParameter("changesex");
		String sex1=new String(sex.getBytes("iso-8859-1"),"utf-8");
		String major=request.getParameter("changemajor");
		String major1=new String(major.getBytes("iso-8859-1"),"utf-8");
		String stringage=request.getParameter("changeage");
		int id = Integer.parseInt(stringid);
		int age = Integer.parseInt(stringage);
		dao.changeById(id, stuno1, name1, sex1, age,major1);
		List<Student> list = dao.queryAll();
		request.setAttribute("students", list);
		request.getRequestDispatcher("JSPLshowlist.jsp").forward(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}
}
