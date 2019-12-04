<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
	<form action="./searchServlet" method="post">
		<div style="float: right;">
			<a href="./Upload.jsp">Upload Resume</a>
		</div>
		<div style="height: 488px; margin-top: 10%">
			<h3 class='alignCtr'>Search Resume</h3>
			<div class='alignCtr'>
				<input type="text" name="searchText" class="searchField"> <input
					type="submit" value="Search" class="searhBtn">
			</div>
		</form>
						<!-- <a href="" style="float: right;">Upload Resume</a>
		
	<form action="./searchServlet" method="post">
		<label style="font: italic;">Search Resume</label><br>
		<input type="text" name="searchText">&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="submit" value="Search">
	</form> -->
						
</body>
</html>