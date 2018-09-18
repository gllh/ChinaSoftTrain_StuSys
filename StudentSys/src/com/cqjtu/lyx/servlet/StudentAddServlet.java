package com.cqjtu.lyx.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import com.cqjtu.lyx.dao.StudentDao;
import com.cqjtu.lyx.entity.Student;

public class StudentAddServlet extends HttpServlet {

	private StudentDao dao = new StudentDao();
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");	
		response.setContentType("text/html;charset=utf-8");

		String stringid = request.getParameter("addid");
		
		String stuno=request.getParameter("addstuno");
		String stuno1=new String(stuno.getBytes("iso-8859-1"),"utf-8");
		
		String name=request.getParameter("addname");
		String name1=new String(name.getBytes("iso-8859-1"),"utf-8");
		
		String sex=request.getParameter("addsex");
		String sex1=new String(sex.getBytes("iso-8859-1"),"utf-8");
		
		String stringage=request.getParameter("addage");
		
		String major=request.getParameter("addmajor");
		String major1=new String(major.getBytes("iso-8859-1"),"utf-8");
		
		int id = Integer.parseInt(stringid);
		int age = Integer.parseInt(stringage);
//		if(stuno.equals(null)|name.equals(null)|stringid.equals(null)
//				|sex.equals(null)|major.equals(null)|stringage.equals(null)){
//		if(request.getParameter("addid").toString().equals(null)){
//			 JOptionPane.showMessageDialog(null, "不能为空");
//		}
//		if(!stuno.equals("")&&!name.equals("")&&!stringid.equals("")
//				&&!sex.equals("")&&!major.equals("")&&!stringage.equals("")){
		JOptionPane.showMessageDialog(null, "不能为空");
			dao.AddStu(id, stuno1, name1, sex1, age,major1);
			List<Student> list = dao.queryAll();
			request.setAttribute("students", list);
			request.getRequestDispatcher("JSPLshowlist.jsp").forward(request, response);			
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			this.doGet(request, response);
	}
}
