<%@page import="java.util.*,com.app.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	List<Customer> l = new ArrayList<Customer>();
	l.add(new Customer("Rahul","Pawar",true));
	l.add(new Customer("Ankita","Patil",true));
	l.add(new Customer("Sayalee","Jadhav",false));
	l.add(new Customer("Priyanka","Sharma",true));
	l.add(new Customer("Nikita","Dubey",false));
	pageContext.setAttribute("customer_List", l);

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>


<body>
<table border="1">
<tr>
<th>FirstName</th>
<th>LastName</th>
<th>Status</th>
</tr>
<c:forEach var="temp" items="${customer_List}">
<tr>
<td><c:out value="${temp.firstName}"></c:out></td>
<td><c:out value="${temp.lastName}"></c:out></td>
<td>
<c:choose>
<c:when test="${temp.status}">
PRIVILIGED
</c:when>
<c:otherwise>
-
</c:otherwise>
</c:choose>
</td>
</tr>
</c:forEach>
</table>
</body>
</html>