<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>First Web Project</title>
</head>
<body>
	<h1>First Web Running</h1>
	<p>testing...</p>
	
	<h3>Student Login</h3>
	<form action="Login" method="post">
		Roll Number : <input type="text" name="roll"/><br><br>
		Password : <input type="password" name="password"/><br><br>
		<input type="submit" value="Login"/>
	</form>
	  <br><br><br>
	  <form action="Books" method="get">
	  	Book id : <input type="text" name="bid" required/><br><br>
	  	<input type="submit" value="Find book"/>
	  </form>
	  <br><br>
	  
	  <p>Add book here    : <a href="add-book.jsp">Click </a> </p>
	  <p>Add student here : <a href="add-student.jsp">Click </a> </p>
	  
	  <!--  <p>All Books : <a href="all-books.jsp">Click </a> </p> -->
	  <p>All Books : <a href="showBooks">Click </a> </p>
	  <p>All Students : <a href="showStudents">Click </a> </p>
	  
	  <br><br>
	  <form action="showBooks" method="post">
	  	<input type="submit" value="Show All Books">
	  </form>
</body>
</html>