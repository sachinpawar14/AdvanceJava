<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*" session="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- 1. Create a HTML Form -->
<form action="todo-demo.jsp">
Add New Item: <input type="text" name="theItem">
<input type="submit" value="SUBMIT">

<!-- 2. Add a new Item to TODO List -->
<%
	//get the TODO items from the session
	List<String> items = (List<String>)session.getAttribute("myToDoList");

	//if the TODO items dosent exist, then create a new one
	if(items==null)
	{
		items = new ArrayList<String>();
		session.setAttribute("myToDoList", items);
	}

	//see if there is form data to add
	String theItem = request.getParameter("theItem");
	if(theItem!="" && theItem!=null)
	{
		items.add(theItem);
	}	
%>

<!-- Step3: Display all the TODO items from Session -->
<hr>
<b>To List items:</b><br>
<ol>
	<%
		for(String temp:items)
		{
			out.println("<li>"+temp+"</li>");
		}
	%>
</ol>
</form>
</body>
</html>