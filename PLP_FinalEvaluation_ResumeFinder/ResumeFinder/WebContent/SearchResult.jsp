<%@page import="org.dom4j.bean.BeanAttribute"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.manthan.resumebean.test.ResumeBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%String msg = (String) request.getAttribute("msg");%>
<%List<ResumeBean> ls=(ArrayList)request.getAttribute("ls"); %>

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
        
        th,
        td:nth-child(2) {
            background: 3efefef;
        }
        
        .tableDiv {
            width: 50%;
            border: 2px solid black;
            margin-top: 3%;
            margin-left: 25%;
            border-right: none;
        }
        
        th,
        td {
            border-right: 2px solid black;
        }
    </style>
</head>
<body>
	<jsp:include page="Search.jsp"></jsp:include>
	<%if(msg!=null && !msg.isEmpty()) { %>
		<h3 style="color: red;"><%=msg %></h3>
	<%} %>
	<%if(ls!=null){ %>
	
	<div class="tableDiv">
				<table style="border-collapse: collapse;" cellpadding="4" width="100%">
					<thead>
						<tr style="background: #ccc;">
							<th>File Name</th>
							<th>Name</th>
							<th>Email</th>
							<th>Download Link</th>
						</tr>
					</thead>
					<tbody>
					<%for(ResumeBean bean:ls){ %>
						<tr>
							<td> <%= bean.getFilename() %> </td>
							<td>  <%= bean.getName() %> </td>
							<td>  <%= bean.getEmail() %></td>
							<td  align="center"><a href="./download?filename=<%= bean.getFilename() %>"> <img src="${pageContext.request.contextPath}/image/icon_download.png" alt="download"></a></td>
						</tr>
					</tbody>
					<%} %>
					<%} %>
					<table>
						</div>
						</div>
	
	<%-- <table>
		<tr>
			<th>File Name </th>
			<th>Name</th>
			<th>Email</th>
			<th>Download Link</th>
		</tr>
		<%for(ResumeBean bean:ls){ %>
		<tr>
			<td> <%= bean.getFilename() %> </td>
			<td>  <%= bean.getName() %> </td>
			<td>  <%= bean.getEmail() %></td>
			
			<td> </td>
		</tr>
		<%} %>
		<%} %>
	</table> --%>
</body>
</html>