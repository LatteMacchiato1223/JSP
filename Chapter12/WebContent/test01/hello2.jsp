<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	String name = "Latte";
	public String getName() {return name;} 
%>
<!-- 스크립트릿을 이용해 자바 코드 작성 -->
<% 	String age = request.getParameter("age"); %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Script trit test</title>
	</head>
	<body>
		<h1>Hello Sir <%= name %></h1>
		<!-- 표현식을 이용해 전송된 나이를 출력 -->
		<h1>You're <%= age %> years old</h1>
	</body>
</html>