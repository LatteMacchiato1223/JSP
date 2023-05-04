<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- 선언문 작성 -->
<%!
	String name = "Latte";
	public String getName() {return name;} 
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Declaration test</title>
	</head>
	<body>
		<!-- 표현식을 이용해 선언문에서 선언한 name 값 출력 -->
		<h1>Hello Sir <%= name %></h1>
	</body>
</html>