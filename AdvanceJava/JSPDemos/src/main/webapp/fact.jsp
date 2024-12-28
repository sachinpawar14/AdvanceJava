<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  import="com.app.Demo"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	int b = Integer.parseInt(request.getParameter("txtNum"));
	out.write("Facotial of "+b+" is "+Demo.factorial(b)); 

%>
</body>
</html>