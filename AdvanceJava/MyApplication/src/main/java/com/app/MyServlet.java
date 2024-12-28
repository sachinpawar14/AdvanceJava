package com.app;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		response.setContentType("application/msword");//MIME Type
		
		String fnm = request.getParameter("txtFirstName");
		String lnm = request.getParameter("txtLastName");
		pw.write("<h2>Welcome : </h2>"+fnm+" "+lnm);
		pw.close();	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}





//http://localhost:8080/MyApplication/MyServlet?txtFirstName=Sham&txtLastName=chhaparwal
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	