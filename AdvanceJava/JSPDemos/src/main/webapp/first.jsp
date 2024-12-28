<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
	int no = 100;
	public String getData(String str)
	{
		return str.toLowerCase();
	}
%>

<%= "String to Lower Case = "+getData("INFOWAY") %>


</body>
</html>












