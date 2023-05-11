<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	// getAttribute()로 바인딩한 값 가져옴 
	String name = (String)session.getAttribute("name");
	String address = (String)application.getAttribute("address");
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Built-in object scope test2</title>
	</head>
	<body>
		<h1>Name is <%= name %></h1>
		<h1>Address is <%= address %></h1>
	</body>
</html>