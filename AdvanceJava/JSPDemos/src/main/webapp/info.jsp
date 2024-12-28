<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="header.html" %>
<hr>
Request Headers: <%= request.getHeader("User-Agent") %>
<br>
Locale: <%= request.getLocale() %>
<br>
<%@ include file="footer.jsp" %>
</body>
</html>