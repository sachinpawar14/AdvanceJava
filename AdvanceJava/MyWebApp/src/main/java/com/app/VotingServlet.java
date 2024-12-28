package com.app;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class VotingServlet
 */
@WebServlet("/serv2")
public class VotingServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;

    public VotingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		
		String name = request.getParameter("txtName");
		int age = Integer.parseInt(request.getParameter("txtAge"));
		
		if(age>18)
		{
			pw.write("<h1>Eligible for Voting!!!</h1> "+name);
		}
		else
		{
			pw.write("<h1>Not Eligible for Voting!!!</h1> "+name);
		}
	}
	
	//http://localhost:8080/MyWebApp/serv3?txtName=rahul&txtAge=15
	//protocol://ServerIP:ServerPort/ContextRoot/PathToResource?QueryString

}










