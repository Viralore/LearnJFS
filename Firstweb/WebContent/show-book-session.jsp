<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>List All Books</h2>
	<%=request.getAttribute("allBooks") %><br><br>         
 	<br><br>
	

	<form action="showBooks" method="post"> 
		<input type="submit" value="Next">
	</form>
	<br><br>
	<a href="index.jsp"><input type="button" value="Back to home"></a>

</body>
</html>