<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Success Page</h1>
	<h1>${title }</h1>
	<h1>${dateandtime }</h1>
	<h1>Welcome ${user.username }</h1>
	<h1>Your User id is ${user.id }</h1>
	<h1>Your email id is ${user.email }</h1>
	<h1>Your password is ${user.password }</h1>
</body>
</html>