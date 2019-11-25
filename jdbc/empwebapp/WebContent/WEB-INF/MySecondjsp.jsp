<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%!
	int a=100;
	public int getA(){
		return a;
	}
	public void setA(int a){
		this.a=a;
	}
	
	String name="kunal";
	public String getName(){
		return name;
	}
	public String getName(String givenName){
		return givenName;
	}
	public void setName(String name){
		this.name=name;
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>HELLO USER</h2>
	
	a1 = <%=a %><br>
	a2 =<%=getA() %><br>
	
	name1 = <%=name %><br>
	name2 = <%=getName() %><br>
	name3 = <%=getName("ABC") %><br>
	
	<%for(int i=0;i<5;i++){ %>
		<%=getName() %>
		<br>
	<%} %>
</body>
</html>

<%-- <jsp:forward page="date.html"></jsp:forward>   --%>
<%-- <jsp:forward page="/myfirstservlet"></jsp:forward> --%>
<%-- <jsp:include page="date.html"></jsp:include> --%>
<jsp:include page="/myfirstservlet"></jsp:include>