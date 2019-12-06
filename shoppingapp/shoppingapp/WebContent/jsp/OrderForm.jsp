<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%String msg = (String) request.getAttribute("msg");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%if(msg!=null && !msg.isEmpty()){ %>
	<%=msg %>
	<%} %>
	<form action="./order" method="get">
		<label>product id</label>
		<input type="text" name="product_id" >
		<input type="submit" name="order" value="order"></br></br>
		<a href="/jsp/LoginForm.jsp">Logout!!</a>
	</form>

</body>
</html>