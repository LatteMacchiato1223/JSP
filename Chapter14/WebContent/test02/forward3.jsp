<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.*, sec01.ex01.*" pageEncoding="UTF-8"
	isELIgnored="false"	%>
<%
	request.setCharacterEncoding("utf-8");

	// ArrayList 지정 
	List memberList = new ArrayList();
	// MemberBean 객체 생성 후 회원정보 저장
	MemberBean m1 = new MemberBean("owl", "1223", "라떼", "cream@cheese.com");
	MemberBean m2 = new MemberBean("swan", "1881", "흑조", "black@swan.com");
	// ArrayList에 2명의 정보 저장
	memberList.add(m1);
	memberList.add(m2);
	// request 내장 객체에 ArrayList를 속성 이름 memberList로 바인딩 
  	request.setAttribute("memberList", memberList);
%>    

<html>
	<head>
		<meta charset="UTF-8">
		<title>forward3</title>
	</head>
	<body>
		<jsp:forward page="member3.jsp" />
	</body>
</html>
