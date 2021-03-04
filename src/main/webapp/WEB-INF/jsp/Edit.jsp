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
<h1>Edit Details</h1>
<form action="/update">
<table>

<tr>
<td>Name</td>
<td><input type="text" name="name" value="${edited.name}"/></td>
</tr>
<tr>
<td>Subject</td>
<td><input type="text" name="subject" value="${edited.subject}"/></td>
</tr>
<tr>
<td colspan="2"><button type="submit">Update</button></td>
</tr>

</table>
</form>
</div>
</body>
</html>