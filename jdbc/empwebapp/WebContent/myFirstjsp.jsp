<%@ page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%!
    	public void jspInit(){
    	System.out.println("inside jspInit()...........");
    	}
    	public void jspDestroy(){
    		System.out.println("inside destory()...............");
    	}
    %>
    <% 
    	System.out.println("inside _jspservice......................");
    	// java code to generate dynmaic date
    	Date dateref=new Date();
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Current date & time -<br>
		<%=dateref %>
	</h1>
</body>
</html>