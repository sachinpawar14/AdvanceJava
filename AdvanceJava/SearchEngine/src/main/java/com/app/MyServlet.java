package com.app;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/serv1")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		
		String data = request.getParameter("txtData");
		String engine = request.getParameter("engine");
		
		try
		{
			if(data.trim().length() == 0)
			{
				throw new Exception();
			}
			else if(engine == null)
			{
				throw new Exception();
			}
			
			String url = "";
			if(engine.equals("google"))
			{
				url = "https://www.google.com/search?q="+data;
						
			}
			if(engine.equals("yahoo"))
			{
				url = "https://in.search.yahoo.com/search?p="+data;
						
			}
			if(engine.equals("bing"))
			{
				url = "https://www.bing.com/search?q="+data;			
			}
			
			response.sendRedirect(url);
			
		}catch (Exception e) {
			response.sendRedirect("error.html");
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
