<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="java.util.ArrayList"%> 
<%@page import="java.util.List"%> 
<%@page import="model.Book"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>List All Books</h2>
	<% List<Book> list = (List<Book>)request.getAttribute("allBooks"); %>      
	
	<ol>
		<% 
			for(Book b : list)
			{
				out.println("<li>" + b + "</li>");
			}
		%>
	</ol>
	  
 	<br><br>
	
	
	<form action="showBooks" method="post"> 
		<input type="submit" value="Next">
	</form>
	<br><br>

	<a href="index.jsp"><input type="button" value="Back"></a>

</body>
</html>