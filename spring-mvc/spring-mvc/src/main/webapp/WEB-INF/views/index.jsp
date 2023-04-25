<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String name = (String) request.getAttribute("name");
		Integer id =  (Integer) request.getAttribute("id");
		
		List<String> friends = (List<String>) request.getAttribute("friends");
	%>
	<h1>Welcome to my Website</h1>
	<h1>My Id is using Model to fetch from Controller to view is <%= id %> </h1>
	<h1>My Name using Model to fetch from Controller to view is <%= name %></h1>
	
	<h1>All Friends</h1>
	<%
		for(String fr: friends)
		{
	%>
	
	<h1><%= fr %></h1>
	
	<%
		}
	%>
</body>
</html>