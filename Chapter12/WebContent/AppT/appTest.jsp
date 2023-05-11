<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	// session과 application 내장 객체에 바인딩
	session.setAttribute("name", "Latte");
	application.setAttribute("address", "Heaven");
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Built-in object scope test1</title>
	</head>
	<body>
		<h1>Save name and address</h1>
		<a href=appTest2.jsp>Go to the second page</a>
	</body>
</html>