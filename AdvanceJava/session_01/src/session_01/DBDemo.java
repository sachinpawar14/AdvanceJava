package session_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
public class DBDemo {	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = null;
		try {
		Scanner s = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Found");
		
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "");
		System.out.println("Connection Established!!!");
		
		PreparedStatement pstmt = con.prepareStatement("insert into emp(name,salary) values(?,?)");
		
		System.out.println("Enter Employee name: ");
		String nm = s.next();
		System.out.println("Enter Employee salary: ");
		float sal = s.nextFloat();
		
		pstmt.setString(1, nm);
		pstmt.setFloat(2, sal);
		
		int i = pstmt.executeUpdate();
		System.out.println("i = "+i);
		
		ResultSet rs = pstmt.executeQuery("select *from emp");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3));
		}
		
		/*pstmt.execute(); boolean
		pstmt.executeUpdate(); int
		pstmt.executeQuery(); ResultSet*/
		}catch (Exception e) {
			System.out.println("Exception");
		}
		finally {
			con.close();
		}
		
		
	}

}


/*
	Register the Driver
	Establish the Connection
	Prepare Statemets
	Get ResultSet
	Close the Connection

*/