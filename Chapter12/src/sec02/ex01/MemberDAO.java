package sec02.ex01;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDAO {
	private Connection con;
	private PreparedStatement pstmt;
	private DataSource dataFactory;

	public MemberDAO() {
		try {
			// InitialContext를 사용하여 컨텍스트를 초기화
			Context ctx = new InitialContext();
			Context envContext = (Context) ctx.lookup("java:/comp/env");
			// 컨텍스트에서 데이터 소스를 찾아서 dataFactory 변수에 할당
			dataFactory = (DataSource) envContext.lookup("jdbc/oracle");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 회원 목록 조회 메소드 
	// MemberVO 객체를 매개변수로 받아 회원 목록을 조회
	public List listMembers(MemberVO memberVO) {
		// 회원 목록은 MemberVO 객체들의 리스트로 반환
		List<MemberVO> membersList = new ArrayList();
		// 매개변수로 받은 MemberVO 객체에서 이름을 가져옴
		String _name = memberVO.getName();
		try {
			// 데이터베이스 연결을 위해 dataFactory에서 Connection 객체를 가져옴 
			con = dataFactory.getConnection();
			
			String query = "select * from t_member";
			
			if((_name!=null && _name.length()!=0)){
				// 이름이 존재하는 경우, WHERE 절을 추가하여 이름에 해당하는 회원만 조회
				 query+=" where name=?";
				 pstmt = con.prepareStatement(query);
				 pstmt.setString(1, _name);
			}else {
				// PreparedStatement를 사용하여 동적으로 쿼리를 생성하고 매개변수를 설정
				pstmt = con.prepareStatement(query);	
			}
			
			
			System.out.println("prepareStatememt : " + query);
			// 쿼리를 실행하기 위해 PreparedStatement 객체에서 executeQuery 메서드를 호출
			// 결과는 ResultSet 객체로 받아와서 반복문을 통해 각 회원의 정보를 읽고 MemberVO 객체에 저장
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				String name = rs.getString("name");
				String email = rs.getString("email");
				Date joinDate = rs.getDate("joinDate");
				MemberVO vo = new MemberVO();
				vo.setId(id);
				vo.setPwd(pwd);
				vo.setName(name);
				vo.setEmail(email);
				vo.setJoinDate(joinDate);
				membersList.add(vo);
			}
			rs.close();
			pstmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// MemberVO 객체들은 membersList 리스트에 추가
		return membersList;
	}

}