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
		//�õ��������
		HttpServletRequest request=(HttpServletRequest) pageContext.getRequest();
		//���������õ�attr����ֵ
		String val=(String)request.getAttribute(attr);
		//val��Ϊ�գ�����ʾ��ҳ��
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