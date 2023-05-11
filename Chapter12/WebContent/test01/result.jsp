<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	request.setCharacterEncoding("utf-8");
	String user_id = request.getParameter("user_id");
	String user_pwd = request.getParameter("user_pwd");
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Result</title>
</head>
<body>
	<h1>Result output</h1>
	<h1>ID : <%= user_id %></h1>
	<h1>PW : <%= user_pwd %></h1>
</body>
</html>