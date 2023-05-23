<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.*, sec01.ex01.*" pageEncoding="UTF-8" 
    isELIgnored="false" %>
<% request.setCharacterEncoding("UTF-8"); %>   

<jsp:useBean id="m1" class="sec01.ex01.MemberBean" />
<jsp:setProperty name="m1" property="*" />
<jsp:useBean id="memberList" class="java.util.ArrayList" />
<jsp:useBean id="memberMap" class="java.util.HashMap" />

<%
	memberMap.put("id", "chiffon");
	memberMap.put("pwd", "0000");
	memberMap.put("name", "머핀");
	memberMap.put("email", "family@dead.com");

	MemberBean m2 = new MemberBean("owl", "1223", "라떼", "cream@cheese.com");
	memberList.add(m1);
	memberList.add(m2);
	// 회원 정보가 저장된 memberList를 memberList라는 key로 memberMap에 저장 
	memberMap.put("memberList", memberList);
%>

<html>
	<head>
		<meta charset=”UTF-8">
		<title>회원 정보 출력창</title>
	</head>
	<body>
		<table border="1" align="center" >
			<tr align="center" bgcolor="#99ccff">
				<td width="20%"><b>아이디</b></td>
		      	<td width="20%"><b>비밀번호</b></td>
		      	<td width="20%"><b>이름</b></td>
		      	<td width="20%"><b>이메일</b></td>
			</tr>
			<tr align="center">
		      	<td>${memberMap.id} </td>
				<td>${memberMap.pwd} </td>
				<td>${memberMap.name} </td>
				<td>${memberMap.email} </td>
			</tr>   
			<tr align="center">
		      	<td>${memberMap.memberList[0].id} </td>
				<td>${memberMap.memberList[0].pwd} </td>
				<td>${memberMap.memberList[0].name} </td>
				<td>${memberMap.memberList[0].email} </td>
			</tr>   
			<tr align="center">
				<td>${memberMap.memberList[1].id} </td>
				<td>${memberMap.memberList[1].pwd} </td>
				<td>${memberMap.memberList[1].name} </td>
				<td>${memberMap.memberList[1].email} </td>
			</tr>
		</table>
	</body>
</html>