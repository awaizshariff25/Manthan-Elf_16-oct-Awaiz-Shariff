<%@page import="com.manthan.empwebapp.beans.EmployeeInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<% EmployeeInfoBean employeeInfoBean= (EmployeeInfoBean) session.getAttribute("employeeInfoBean"); %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3 style="color: navy;">Hello <%=employeeInfoBean.getEmpname() %>!</h3>
	<a href="./searchEmployeeForm">Search Employee</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="./addEmployeeForm1">Add Employee</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="./updateEmployeeForm">Update Employee</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="./deleteEmployeeForm">Delete Employee</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="./seeAllEmployeeForm">See All Employee</a><br>
	<a href="./logout">Logout</a>
</body>
</html>