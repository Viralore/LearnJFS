<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Book</title>
</head>
<body>
	<h3>This JSP will show when user sends a request to controller "/mvc/books" and enters a bid as parameter</h3>
	<h3>Patameter in 2 ways:</h3>
	<h3>1. in the url http://localhost:8080/mvc/books?bid=1</h3>
	<h3>2. create a form input number and submit button</h3>
	
	<div>Book received from model (sent by controller)</div>
	<div>${book}</div>
</body>
</html>