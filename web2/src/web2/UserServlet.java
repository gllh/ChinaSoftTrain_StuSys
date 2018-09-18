package web2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UserServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public UserServlet() {
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

		String uname=request.getParameter("uname");
		String upwd=request.getParameter("upwd");
		if("haha".equals(uname)&&"123".equals(upwd)){
			String saveday=request.getParameter("saveday");
			if(saveday!=null&&!saveday.equals("-1")){
				int day=Integer.parseInt(saveday);
				//new Cookie
				Cookie cname=new Cookie("username",uname);
				Cookie cpwd=new Cookie("userpwd",upwd);
				//set save time
				cname.setMaxAge(day*24*3600);
				cpwd.setMaxAge(day*24*3600);
				//add to response
				response.addCookie(cname);
				response.addCookie(cpwd);
				System.out.println(cname);
				System.out.println(cpwd);
			}
			//用户名保存在session中
			HttpSession session=request.getSession();
			session.setAttribute("currName", uname);
			ServletContext sc=this.getServletContext();
			Integer count=(Integer)sc.getAttribute("count");
			if(count!=null){
				count++;
			}else{
				count=1;
			}
			sc.setAttribute("count", count);
			response.sendRedirect("/web2/SuccessLogin.jsp");
//			request.getRequestDispatcher("/SuccessLogin.jsp").forward(request, response);
		}
		else{
			response.sendRedirect("/web2/FailLogin.jsp");
		}
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

		this.doGet(request, response);
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
