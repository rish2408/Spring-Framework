<%@page import="java.time.LocalDateTime"%>
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
		LocalDateTime loc = (LocalDateTime) request.getAttribute("currentDate");
	%>
	<h1>My Id is using ModelAndView to fetch from Controller to view is <%= id %> </h1>
	<h1>My Name using ModelAndView to fetch from Controller to view is <%=name%></h1>
	<h1>Local Date and Time using ModelAndView is <%= loc %></h1>
</body>
</html>