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
	<title>Result2</title>
</head>
<body>
	<%
		if (user_id == null || user_id.length() == 0) {
	%>
		Enter your ID<br>
		<a href="/Chapter12/login.html"> Login </a>
	<%
		} else {
	%>
		<h2>Welcome, <%= user_id %></h2>
	<%
		}
	%>
</body>
</html>