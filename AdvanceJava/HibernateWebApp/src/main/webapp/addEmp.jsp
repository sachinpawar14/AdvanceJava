<%@page import="com.app.dao.EmployeeDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="emp" class="com.app.entity.Employee"></jsp:useBean>
<jsp:setProperty property="*" name="emp"/>
<%
	int status  = EmployeeDAO.saveEmployee(emp);

	if(status>0)
	{
		response.sendRedirect("success.jsp");
	}
	else
	{
		response.sendRedirect("error.jsp");
	}	
%>
</body>
</html>