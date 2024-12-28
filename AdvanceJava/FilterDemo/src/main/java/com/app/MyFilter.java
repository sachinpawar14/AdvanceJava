package com.app;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpFilter;


/**
 * Servlet Filter implementation class MyFilter
 */
public class MyFilter extends HttpFilter implements Filter {
    public MyFilter() {
        super();
        System.out.println("Filter Constructor Called");
    }

	public void destroy() {
		System.out.println("Filter Destroyed");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// place your code here
		PrintWriter pw = response.getWriter();
		pw.write("Filter Invoked Before");
		System.out.println("Filter Invoked Before");
		String pass = request.getParameter("txtPassword");
		String pwd = pass.trim().toUpperCase();
		request.setAttribute("password", pwd);
		//....
		// pass the request along the filter chain	
		chain.doFilter(request, response);
		System.out.println("Filter Invoked After");
		pw.write("Filter Invoked After");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("In init() of Filter");
		
	}

}
