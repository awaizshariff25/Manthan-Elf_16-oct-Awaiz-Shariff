<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%String msg = (String) request.getAttribute("msg");%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <style>
        form {
            padding: 10px;
            border: 1px solid black;
        }
        
        .searchField {
            width: 40%;
            height: 30px;
            border: 2px solid black;
        }
        
        .searhBtn {
            box-shadow: 2px 2px;
            height: 36px;
            width: 8%;
            background: white;
            font-weight: bold;
            border: 2px solid black;
        }
        
        .alignCtr {
            text-align: center;
        }
        
        
    </style>
</head>
<body>
<form action = "./upload" method = "post" enctype = "multipart/form-data">
	<div style="float: right;">
	<a href="./Search.jsp">Search Resume</a>
	</div>
	<div style="height: 488px; margin-top: 10%">
			<h3 class='alignCtr'>Upload Resume</h3>
			<div class='alignCtr'>
			
         <input type = "file" name = "file" class="searchField"/>
         <input type = "submit" value = "Upload File" class="searhBtn"/>
         </div>
      </form>
	<% if(msg!=null) { %>
	<fieldset style="margin-top: 250px; background-color:#7fffd5; border:1px solid black;">
		<p style="color: black; text-align: center;"><%=msg%></p>
	</fieldset>
	<%} %>
</body>
</html>