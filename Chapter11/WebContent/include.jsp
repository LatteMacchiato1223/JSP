<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Include directive</title>
	</head>
	<body>
		<h1>Welcome to JSP</h1>
		<!-- 인클루드 디렉티브 태그를 이용해 image.jsp를 포함 -->
		<%@ include file="image.jsp" %><br>
		<h1>End of page</h1>
	</body>
</html>