<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	// JSP에서는 자동으로 세션 객체 생성
	// 굳이 getSession() 메소드를 호출하여 session을 생성할 필요가 없음
	// 9장 HttpSession session = request.getSession();
	String name = (String)session.getAttribute("name");
	session.setAttribute("address", "Heaven");
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Built-in object test1</title>
	</head>
	<body>
		Name is <%= name %><br>
		<a href=session2.jsp>Go to the second page</a>
	</body>
</html>