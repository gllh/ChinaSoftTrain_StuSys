package web1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class show_stu_info extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public show_stu_info() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the GET method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");	
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		//����post���룬������һ��post����ȫ
		request.setCharacterEncoding("utf-8");
		String uname=request.getParameter("uname");
		String uid=request.getParameter("sfz");
		String usex=request.getParameter("gender");
		
		//getҪ��
		String ss=new String(usex.getBytes("iso-8859-1"),"utf-8");
		String ucountry=request.getParameter("country");
		String uyear=request.getParameter("year");
		String umonth=request.getParameter("month");
		String uxueyuan=request.getParameter("uxueyuan");
		String umajor=request.getParameter("umajor");
		String uhobby=request.getParameter("uhobby");
		out.println("<h2>"+"������"+uname+"<br/>"+"���֤�ţ�"+uid+"<br/>"+"�Ա�"
		+usex+"<br/>"+"������"+ucountry+"<br/>"+"��ѧʱ�䣺"+uyear+"��"+umonth+
		"��"+"<br/>"+"ѧԺ��"+uxueyuan+"<br/>"+"רҵ��"+umajor+"<br/>"+"���ã�"+uhobby+"<br/>"+"<h2>");
		System.out.println("������"+uname+"���֤�ţ�"+uid+"�Ա�"
				+usex+"������"+ucountry+"��ѧʱ�䣺"+uyear+"��"+umonth+"��"+
				"ѧԺ��"+uxueyuan+"רҵ��"+umajor+"���ã�"+uhobby);
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
