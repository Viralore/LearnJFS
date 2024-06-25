<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Student</title>
</head>
<body>
	<h1>Enter details to add Student</h1>
	<br><br>
	<form action="addStudent" method="get">
		Name : <input type="text" name="name"/><br><br>
		Branch : <input type="text" name="branch"/><br><br>
		Password : <input type="password" name="password"/><br><br>
		Roll no : <input type="text" name="roll"/><br><br>
		
		<input type="submit" value="Add Student"/>
	</form>
	
	<br><br>
	<a href="index.jsp"><input type="button" value="Back"></a>

</body>
</html>