<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Book</title>
</head>
<body>
	<h1>Enter the details of the Book to Add</h1>
	
	<form action="addBook" method="get">
		Title     : <input type="text" name="title" required/><br><br>
		Author    : <input type="text" name="author" required/><br><br>
		Publisher : <input type="text" name="publisher" required/><br><br>
		
		<input type="submit" value="Add Book">
	</form>
	
	<br><br>
	<a href="index.jsp"><input type="button" value="Back"></a>
	
</body>
</html>