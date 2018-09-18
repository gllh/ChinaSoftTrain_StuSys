package com.rj.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.rj.utils.ReadWriteCount;

public class CountListener implements ServletContextListener{
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		String count=arg0.getServletContext().getAttribute("count").toString();
        ReadWriteCount.write("C://Users//RJ//Workspaces//MyEclipse Professional 2014"
        		+ "//.metadata//.me_tcat7//webapps//rjday4//",count);
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		int count=ReadWriteCount.read(arg0.getServletContext().getRealPath("/"));
		arg0.getServletContext().setAttribute("count", count);
	}

}
 