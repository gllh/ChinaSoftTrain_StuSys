package com.zr.tag;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class PrintReqAttr extends TagSupport{
	private String attr;

	public String getAttr() {
		return attr;
	}

	public void setAttr(String attr) {
		this.attr = attr;
	}

	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		//拿到对象请求
		HttpServletRequest request=(HttpServletRequest)pageContext.getRequest();
		//从请求拿attr
		String val=(String)request.getAttribute(attr);
		//val不为空，显示
		if(val!=null&&!val.equals("")){
			JspWriter out=pageContext.getOut();
			try{
				out.println("<font color='red'>"+val+"</font>");
			}catch(Exception e){
				e.printStackTrace();
			}
							
		}
		return super.doStartTag();
	}

}
