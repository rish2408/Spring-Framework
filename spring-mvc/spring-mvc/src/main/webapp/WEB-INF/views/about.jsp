<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>My Id is using ModelAndView to fetch from Controller to view is ${id}</h1>
	<h1>My Name using ModelAndView to fetch from Controller to view is ${name}</h1>
	<c:forEach var="item" items="${friends}">
		<h1>${item}</h1>
	</c:forEach>
</body>
</html>