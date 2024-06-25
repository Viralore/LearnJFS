<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Added</title>
</head>
<body>
	<h3>Book View</h3>
	
	<div style="background-color=blue"> 	
	<%=request.getAttribute("bookAdded") %>
	</div>
	<a href="index.jsp"><input type="button" value="Back"></a>

</body>
</html>