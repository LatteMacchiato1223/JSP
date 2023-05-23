<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	// request 내장 객체에 바인딩
  	request.setAttribute("id", "moon");
  	request.setAttribute("pwd", "9999");
  	// session 내장 객체에 바인딩
  	session.setAttribute("name", "Luna");
  	// application 내장 객체에 바인딩 
  	application.setAttribute("email", "princess@luna");
  	// 주소 정보 추가 
  	request.setAttribute("address", "dream realm");
%>    

<html>
	<head>
		<meta charset="UTF-8">
		<title>forward4</title>
	</head>
	<body>
		<jsp:forward page="member4.jsp" />
	</body>
</html>
