package com.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.app.model.Employee;

public class EmployeeDAO {
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Found");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee",
				"root", "");
		System.out.println("Connection Established!");
		return con;
	}
	
	public static int registerEmployee(Employee e) throws ClassNotFoundException, SQLException
	{
		int i = 0;
		try
		{
		Connection con = getConnection();
		PreparedStatement pstmt = con.prepareStatement
				("insert into emp1(username,password,email,gender,age,terms) values(?,?,?,?,?,?)");
		pstmt.setString(1, e.getUserName());
		pstmt.setString(2, e.getPassword());
		pstmt.setString(3, e.getEmail());
		pstmt.setString(4, e.getGender());
		pstmt.setString(5, e.getAge());
		pstmt.setString(6, e.getTerms());
		i = pstmt.executeUpdate();
		}
		catch (Exception e1) {
			return i;
		}
		return i;
	}
	
	public static boolean loginEmployee(Employee e) throws ClassNotFoundException, SQLException
	{
		boolean ans  = false;
		Connection con = getConnection();
		PreparedStatement pstmt = con.prepareStatement
				("select *from emp1 where username=? and password=?");
		pstmt.setString(1, e.getUserName());
		pstmt.setString(2, e.getPassword());
		
		ResultSet rs = pstmt.executeQuery();
		 ans = rs.next();
		 System.out.println("ans = "+ans);
	return ans;
	}

}
