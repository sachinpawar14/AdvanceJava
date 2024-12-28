package com.app;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Servlet1() {
        super();
        System.out.println("Servlet Constructor called");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("In doGet");
		PrintWriter pw = response.getWriter();//get PrintWriter
		response.setContentType("text/html");//Set MIME type
		pw.write("<br>In Servlet1<br>");
		String username = request.getParameter("txtUsername");
		String password = (String) request.getAttribute("password");
		
		pw.write("Password = "+password);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
