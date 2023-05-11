<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- 사용자가 이름을 입력하여 회원을 검색할 수 있는 HTML 폼을 제공 -->
<!DOCTYPE html>
<html>
	<head>
	  <meta charset="UTF-8">
	  <title>회원 검색창</title>
	  
	  <!-- 태그 내부에서 입력 필드의 스타일을 지정 -->
	  <style type="text/css">
	  	input {
			padding: 6px 12px;
			border-radius: 6px;
			color: #495057;
			border: 2px solid #ced4da;
			font-family: inherit;
			font-size: inherit;
			line-height: inherit;
		}
	  </style>
	</head>
	<body>
		<!-- 태그를 사용하여 회원 검색을 위한 폼을 생성 -->
	   <form method="post" action="member.jsp">
		   이름 : <input type="text" name="name">
		   <input type ="submit" value="조회하기">
	   </form>
	</body>
</html>