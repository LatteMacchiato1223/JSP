<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	// request 객체에 setAttribute() 이용하여 바인딩 
	request.setAttribute("name", "Latte");
	request.setAttribute("address", "Heaven");
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>First JSP</title>
	</head>
	<body>
		<%
			// request 객체를 다른 JSP 파일로 포워딩 
			RequestDispatcher dispatch = request.getRequestDispatcher("request2.jsp");
			dispatch.forward(request, response);
		%>
	</body>
</html>