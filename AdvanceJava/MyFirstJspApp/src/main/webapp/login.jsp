<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String uname = request.getParameter("txtUsername");
	String pwd = request.getParameter("txtPassword");
	
	if(uname.equals("admin")&& pwd.equals("admin123"))
	{
		out.write("Login Success");
	}
	else
	{
		out.write("Invalid!!!");
		request.getRequestDispatcher("third.jsp").include(request, response);
		
		
	}

%>
</body>
</html>