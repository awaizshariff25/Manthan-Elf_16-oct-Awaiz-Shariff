<%@page import="com.manthan.userbean.test.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	UserBean user = (UserBean) session.getAttribute("userBean");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="./search" method="get">
			<label>product id</label> 
			<input type="number" name="product_id"required> 
			<input type="submit" value="product">
			<a href="./OrderForm.jsp">order</a> 
			<a href='./LoginForm.jsp'>Logout!!</a></br>
	</form>
</body>
</html>