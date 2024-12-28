<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="jakarta.tags.core"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Student List</h2>
<hr>
<table>
<tr>
<th>FirstName</th>
<th>LastName</th>
<th>Email</th>
</tr>
<c:forEach var="temp" items=<%= request.getAttribute("l") %>>
<tr>
<td>${temp.firstName}</td>
<td>${temp.lastName}</td>
<td>${temp.email}</td>
</tr>
</c:forEach>
</table>
</body>
</html>

