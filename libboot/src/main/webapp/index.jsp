<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP</title>
</head>
<body>

<h2>Index.jsp file in webapp</h2>

	<form action="/mvc-books" method="get">
		Book bid : <input type="number"  name="bid">
	  	<input type="submit" value="Show Book">
	</form>
	<br><br>
	
	<form action="/mvc-students" method="get">
		Student ID : <input type="number"  name="sid">
	  	<input type="submit" value="Show Student">
	</form>

</body>
</html>