<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	// getAttribute() 사용하여 서블릿과 JSP에 바인딩된 name과 address 값을 가져옴 
	String name = (String)session.getAttribute("name");
	String address = (String)session.getAttribute("address");
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Built-in object test2</title>
	</head>
	<body>
		Name is <%= name %><br>
		Address is <%= address %><br>
	</body>
</html>