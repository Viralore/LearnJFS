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
	<%=request.getAttribute("allBooks") %><br><br>
	<table border ="1" width="500"> 
         <tr bgcolor="00FF7F"> 
          <th><b>Book Title</b></th> 
          <th><b>Book Author</b></th> 
          <th><b>Book Publisher</b></th> 
         </tr>  
        <%ArrayList<Book> list =  
            (ArrayList<Book>)request.getAttribute("allBooks"); 
        for(Book b:list){%> 
        <%-- Arranging data in tabular form 
        --%> 
            <tr> 
                <td><%=b.getTitle()%></td> 
                <td><%=b.getAuthor()%></td> 
                <td><%=b.getPublisher()%></td> 
            </tr> 
            <%}%> 
        </table>
	
	<br><br>
	<a href="index.jsp"><input type="button" value="Back"></a>
</body>
</html>