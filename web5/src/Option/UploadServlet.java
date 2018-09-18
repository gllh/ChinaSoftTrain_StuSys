package Option;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
@WebServlet("/UploadServlet")
@MultipartConfig(
		location="E:\\upload",
		maxFileSize=8388608,
		fileSizeThreshold=819200,
		maxRequestSize=-1
		)
public class UploadServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public UploadServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//获取所有上传对象
		Collection<Part> parts=request.getParts();
		for(Iterator<Part> iterator=parts.iterator();iterator.hasNext();){
			Part part=iterator.next();
			//获取content-disposition请求头，提取文件名称
			String contentDisposition=part.getHeader("content-disposition");
			System.out.println("content-disposition="+contentDisposition);
			String fileName=null;
			//正则表达式获取文件名称
			Pattern pattern=Pattern.compile("filename=\".+\"");
			Matcher matcher=pattern.matcher(contentDisposition);
			if(matcher.find()){
				fileName=matcher.group();
				System.out.println("fileName="+fileName);
				fileName=fileName.substring(10,fileName.length()-1);
				System.out.println("subFileName="+fileName);
			}
			if(fileName!=null){
				part.write(fileName);
			}
		}
	}
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
