package com.app.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import com.app.dao.EmployeeDAO;
import com.app.model.Employee;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		String user = request.getParameter("txtUsername");
		String pass = request.getParameter("txtPassword");
		
		Employee e = new Employee();
		e.setUserName(user);
		e.setPassword(pass);
		
		boolean status;
		try {
			status = EmployeeDAO.loginEmployee(e);
			if(status)
			{
				pw.write("Login Successfull...");
				request.getRequestDispatcher("welcome.html").include(request, response);
			}
			else
			{
				pw.write("Invalid User...");
				request.getRequestDispatcher("index.html").include(request, response);
			}
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
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
