<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h1 align="center">Employees list</h1>
<br/><br/>
<a href="new">add new employee</a>
<table border="1" cellpadding="10">
	<tr>
	     <th>Id</th>
	     <th>Name</th>
	     <th>Subject</th>
	     <th>Actions</th>
	</tr>
	<c:forEach items="${emplist}" var="emp">
	       <tr>
	           <td>${emp.id}</td>
	           <td>${emp.name}</td>
	           <td>${emp.subject}</td>
	           <td><a href="put/${emp.id}">Edit</a></td>      
	       </tr>
	
	</c:forEach>
</table>
</div>
</body>
</html>