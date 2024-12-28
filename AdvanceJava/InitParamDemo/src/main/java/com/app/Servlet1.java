package com.app;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Servlet implementation class Servlet1
 */

public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private ServletConfig servletConfig;
	private ServletContext servletContext;
	private String unm,pwd,dnm;
	
    public Servlet1() {
        super();
        System.out.println("Constructor Called");
    }
    
	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("Init method invoked");
		servletConfig = getServletConfig();
		servletContext = getServletContext();
		
		/*unm = servletConfig.getInitParameter("user");
		pwd = servletConfig.getInitParameter("password");
		dnm = servletContext.getInitParameter("driverName");*/
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("In Service()");
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		//pw.write("<br>MySql User = "+unm+" Password = "+pwd);
		//pw.write("<br>Driver = "+dnm);
		Enumeration<String> e =   servletConfig.getInitParameterNames();
		while(e.hasMoreElements())
		{
			String str = e.nextElement();
			pw.write("<br>"+str+" "+servletConfig.getInitParameter(str));
		}	
	pw.close();	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
