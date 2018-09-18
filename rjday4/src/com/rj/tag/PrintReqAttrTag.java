package com.rj.tag;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class PrintReqAttrTag extends TagSupport{
	
	private String attr;
	
	@Override
	public int doStartTag() throws JspException{
		//拿到请求对象
		HttpServletRequest request=(HttpServletRequest) pageContext.getRequest();
		//从请求里拿到attr属性值
		String val=(String)request.getAttribute(attr);
		//val不为空，则显示在页面
		  if(val!=null&&!val.equals("")){
			  JspWriter out =pageContext.getOut();
			  try {
				out.println("<font color='red'>"+val+"</font>");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }
		return 0;
	}
	
	public String getAttr(){
		return attr;
	}
	
	public void setAttr(String attr){
		this.attr=attr;
	}
}