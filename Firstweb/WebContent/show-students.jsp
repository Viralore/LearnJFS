<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import ="java.util.List, model.Student"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of all students</title>
</head>
<body>
	<h3>List of all students </h3>
	<% List<Student> list = (List<Student>)request.getAttribute("students");%>
	<ol>
		<%
			for(Student s : list)
			{
				out.println("<li>"+s+"</li>");
			}
		%>
	</ol>
</body>
</html>