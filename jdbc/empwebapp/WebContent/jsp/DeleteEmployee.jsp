<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<% String msg=(String) request.getAttribute("msg"); %>
<jsp:include page="/home"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%if(msg!=null && !msg.isEmpty()) { %>
		<h3 style="color: red;"><%=msg %></h3>
	<%} %>
	<fieldset>
		<legend>Delete Employee</legend>
		<form action="./delEmployee" method="post">
		<table>
			<tr>
				<td>Employee Id</td>
				<td> : </td>
				<td><input type="number" name="empId" required></td>
			</tr>
			<tr>
				<td colspan="3" align="center">
				<input type="submit" value="Add Employee">
				</td>
			</tr>
		</table>
	</fieldset>
</body>
</html>