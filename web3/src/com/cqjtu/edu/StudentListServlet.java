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
		//����һ����
		List<Student> list=dao.queryAll();
//		List<Student>list=new ArrayList<Student>();
//		list.add(new Student(1,"stu01","��","��",20));
//		list.add(new Student(2,"stu02","��","��",21));
//		list.add(new Student(3,"stu03","��","��",22));
//		list.add(new Student(4,"stu04","Ǯ","Ů",23));
//		list.add(new Student(5,"stu05","��","Ů",24));
		//�����ݷ���request������ҳ����
		request.setAttribute("students",list);
		request.getRequestDispatcher("/stulist.jsp").forward(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
		
	}
	
}
