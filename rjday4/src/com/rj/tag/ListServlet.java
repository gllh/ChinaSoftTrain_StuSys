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
		//����ѧ������
		List<Student> list=new ArrayList<Student>();
		list.add(new Student(1,"stu001","����","��",16));
		list.add(new Student(2,"stu002","����","��",20));
		list.add(new Student(3,"stu003","����","Ů",21));
		list.add(new Student(4,"stu004","����","Ů",17));
		list.add(new Student(5,"stu005","����","��",23));
		
		//�����ݷ���request�У����ݵ�ҳ��
		request.setAttribute("list", list);
		request.getRequestDispatcher("list.jsp").forward(request, response);
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);

	}
}
