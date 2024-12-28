package com.app;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ProfileServlet() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		request.getRequestDispatcher("index.html").include(request, response);
		HttpSession session = request.getSession(false);
		if(session!=null)
		{
			pw.write("<br>Username = "+session.getAttribute("user"));
			pw.write("<br>Password = "+session.getAttribute("pass"));
			pw.write("<br>Session Id = "+session.getId());
			
		}
		else
		{
			pw.write("Re-Login!!");
			request.getRequestDispatcher("login.html").include(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
