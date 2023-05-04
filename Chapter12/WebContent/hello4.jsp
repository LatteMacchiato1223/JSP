<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	String name = "Latte";
	public String getName() {return name;} 
%>
<% 
/* 스크립트릿 주석 처리 */
/* String age = request.getParameter("age"); */ 
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Annotation test</title>
	</head>
	<body>
		<h1>Hello Sir <%= name %></h1>
		<h1>You're <%= age %> years old</h1>
		<h1>You're <%= 181 %>cm tall</h1>
		<h1>Your age + 10 is <%--<%= Integer.parseInt(age)+10 %> --%></h1>
	</body>
</html>