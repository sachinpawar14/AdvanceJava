package com.app.controller;

import java.io.IOException;
import java.util.List;

import com.app.model.Student;
import com.app.utility.StudentUtility;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/studentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public StudentController() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Student> list = StudentUtility.getStudentsList();
		request.setAttribute("l", list);
		request.getRequestDispatcher("displayStud.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
