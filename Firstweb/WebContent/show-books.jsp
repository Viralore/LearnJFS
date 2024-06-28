<%@page import="java.util.ArrayList"%> 
<%@page import="java.util.List"%> 
<%@page import="model.Book"%> 

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Books</title>
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
	<a href="showBooks"><input type="button" value="Next"></a>
	<br><br>
	<a href="index.jsp"><input type="button" value="Back"></a>
</body>
</html>