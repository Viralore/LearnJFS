<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList"%> 
<%@page import="java.util.List"%> 
<%@page import="model.Issue" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Issue List</title>
</head>
<body>

	<h2>All Books Issued</h2>
	
	<table border ="1" width="500"> 
         <tr bgcolor="00FF7F"> 
          <th><b>Issue ID</b></th> 
          <th><b>Book ID</b></th> 
          <th><b>Issue Date</b></th> 
          <th><b>Return Date</b></th> 
         </tr>  
        <%ArrayList<Issue> list =  
            (ArrayList<Issue>)request.getAttribute("allIssues"); 
        for(Issue i : list){%> 
        <%-- Arranging data in tabular form 
        --%> 
            <tr> 
                <td><%=i.getIsid()%></td> 
                <td><%=i.getBid()%></td> 
                <td><%=i.getIsDate()%></td> 
                <td><%=i.getActRetDate()%></td> 
            </tr> 
            <%}%> 
        </table>
        
    <br><br>
	<a href="index.jsp"><input type="button" value="Back"></a>

</body>
</html>