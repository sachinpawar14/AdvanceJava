<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Student Form</h1>
<hr>
<form:form action="addStudent" method="post" modelAttribute="student">
Enter FirstName: <form:input path="firstName"></form:input>
<br><br>
Enter LastName: <form:input path="lastName"></form:input>
<br><br>
<form:button value="Submit"></form:button>
</form:form>
</body>
</html>