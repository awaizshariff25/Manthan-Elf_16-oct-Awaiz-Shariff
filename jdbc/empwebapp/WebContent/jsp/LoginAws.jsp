<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
		<legend>Employee login</legend>
		<form action="./Dis" method="get">
			<table>
				<tr>
					<td>Employee Id</td>
					<td>:</td>
					<td><input type="number" name="Id" required></td>
				</tr>
				<tr>
					<td>Name</td>
					<td>:</td>
					<td><input type="text" name="Name" required></td>
				</tr>
				<td colspan="3"><br /> <input type="submit" value="submit"></td>
				</tr>

			</table>
		</form>


	</fieldset>
</body>
</html>