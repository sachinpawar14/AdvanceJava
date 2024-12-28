package com.app.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import com.app.dao.EmployeeDAO;
import com.app.model.Employee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/registerServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public RegistrationServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		String user = request.getParameter("txtUsername");
		String pass = request.getParameter("txtPassword");
		String email = request.getParameter("txtEmail");
		String gender = request.getParameter("gender");
		String age = request.getParameter("age");
		String terms = request.getParameter("terms");
		
		Employee e = new Employee();
		e.setUserName(user);
		e.setPassword(pass);
		e.setEmail(email);
		e.setGender(gender);
		e.setAge(age);
		e.setTerms(terms);
		
		try {
			int i = EmployeeDAO.registerEmployee(e);
			
			if(i == 1)
			{
				pw.write("Registration Done...");
				request.getRequestDispatcher("index.html").include(request, response);
			}
			else
			{
				pw.write("Registration Failed...");
				request.getRequestDispatcher("register.html").include(request, response);
			}
		
		} catch (ClassNotFoundException | SQLException e1) {
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
