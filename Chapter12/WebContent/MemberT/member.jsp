<%@ page language="java" contentType="text/html; charset=UTF-8"
    import="java.util.*"
    import="sec02.ex01.*"
    pageEncoding="UTF-8"
%>

<!-- 사용자가 입력한 이름을 기반으로 회원을 검색하고, 검색 결과를 테이블 형태로 출력하는 기능을 제공 -->
<%
	// 요청의 문자 인코딩을 설정	
	request.setCharacterEncoding("utf-8");
	// 사용자가 입력한 이름을 가져옴 
	String _name = request.getParameter("name");
	// MemberVO 객체를 생성하고, 사용자가 입력한 이름을 MemberVO 객체에 설정
	MemberVO memberVO = new MemberVO();
	memberVO.setName(_name);
	// MemberDAO 객체를 생성하고, listMembers 메서드를 호출하여 회원을 검색
	MemberDAO dao=new MemberDAO();
	// 검색 결과는 membersList에 저장
	List membersList=dao.listMembers(memberVO);
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원 정보 출력창</title>
		
		<style>
			h1 {
				text-align: center;
			}
			table {
				width: 80%;
				border:1px solid black;
				border-collapse:collapse;
				margin-left: auto;
				margin-right: auto;
				border-spacing: 0px;
			}
			td, th {
				border:1px solid gray;
				padding:10px;
				vertical-align: top;
				text-align: center;
			}
			thead, th {
				background:#eee;
			}
		</style>
	</head>
	
	<body>
		<h1>회원 정보 출력</h1>	
		<!-- 태그를 사용하여 회원 정보를 출력할 테이블을 생성 -->	
		 <table border='1' width='800' align='center'>
		 <!-- 태그 내부에서 테이블의 헤더 부분을 정의 -->
		 <thead>
		 	<tr> 
			     <th>아이디</th>
			     <th>비밀번호</th>
			     <th>이름</th>
			     <th>이메일</th>
			     <th>가입일자</th>
			</tr>
		</thead>
		<!-- 태그 내부에서 for 루프를 사용하여 membersList에 저장된 회원 정보를 순회 -->
		<%	
			for (int i = 0; i < membersList.size(); i++) {
				MemberVO vo = (MemberVO)membersList.get(i);
				String id = vo.getId();
				String pwd = vo.getPwd();
				String name = vo.getName();
				String email = vo.getEmail();
				Date joinDate = vo.getJoinDate();
		%>
				<tr>
					<!-- 각 회원 정보를 변수에 저장하고, 해당 정보를 테이블의 각 열에 출력 -->
					<td><%= id %></td>
					<td><%= pwd %></td>
					<td><%= name %></td>
					<td><%= email %></td>
					<td><%= joinDate %></td>
				</tr>		   
		<%		
			}
		%>	
		</table>
	</body>
</html>