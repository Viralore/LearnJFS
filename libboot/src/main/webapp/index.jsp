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

<% 
	for(int i=1;i<=5;i++)
		out.println("<h4>"+i+"</h4>");
%>

</body>
</html>