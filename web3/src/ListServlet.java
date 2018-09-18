import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ListServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Student> list=new ArrayList<Student>();
		list.add(new Student(1,"stu001","aa","��",20));
		list.add(new Student(2,"stu002","bb","��",20));
		list.add(new Student(3,"stu003","cc","Ů",17));
		list.add(new Student(4,"stu004","dd","��",20));
		list.add(new Student(5,"stu005","ee","��",20));
		request.setAttribute("list", list);
		request.getRequestDispatcher("showlist.jsp").forward(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
		
	}

	

}
