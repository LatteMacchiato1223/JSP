<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<% request.setCharacterEncoding("utf-8"); %>

<html>
	<head>
		<meta charset="UTF-8">
		<title>result</title>
	</head>
	<body>
		<c:if test="${empty param.id}">
			아이디를 입력하시오<br>
			<a href="login.jsp">로그인</a>
		</c:if>
		<c:if test="${not empty param.id}">
			<h1>환영합니다, <c:out value="${param.id}" />님.</h1>
		</c:if>
	</body>
</html>