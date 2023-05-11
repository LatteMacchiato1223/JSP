<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	request.setCharacterEncoding("utf-8");
	String name = request.getParameter("name");
	String age = request.getParameter("age");
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Show data</title>
	</head>
	<body>
		<!-- 표현식으로 출력 -->
		<% if (name == null || name.length() == 0) { %>
			<h1>Enter the name</h1>
		<% } else { %>
			<h1><%= name %>, <%= age %></h1>
		<% } %>
		
		<!-- out 객체로 출력 -->
		<% if (age == null || age.length() == 0) { %>
			<h1>Enter the age</h1>
		<% } else { %>
			<h1><% out.println(name + ", " + age); %></h1>
		<% } %>
	</body>
</html>