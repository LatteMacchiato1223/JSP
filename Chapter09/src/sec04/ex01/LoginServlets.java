package sec04.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login4")
public class LoginServlets extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}
	
	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		// 로그인창에서 전송된 id와 비번을 가져옴
		String user_id = request.getParameter("user_id");
		String user_pwd = request.getParameter("user_pwd");
		
		// MemberVO 객체를 생성하고 속성에 id와 비번 설정
		MemberVO memberVO = new MemberVO();
		memberVO.setId(user_id);
		memberVO.setPwd(user_pwd);
		
		MemberDAO dao = new MemberDAO();
		
		// MemberDAO의 isExisted() 메소드를 호출하면서 memberVO 전달 
		boolean result = dao.isExisted(memberVO);
		
		if (result) {
			HttpSession session = request.getSession();
			
			// 조회한 결과가 true면 isLogOn 속성을 true로 세션에 저장
			session.setAttribute("isLogOn", true);
			// 조회한 결과가 true면 id와 비번을 세션에 저장
			session.setAttribute("login.id", user_id);
			session.setAttribute("login.pwd", user_pwd);
			
			out.print("<html><body>");
			out.print("Greetings, Sir " + user_id + "<br>");
			out.print("<a href='show'>View membership information</a>");
			out.print("</body></html>");
		} else {
			out.print("<html><body><center>Wrong member ID");
			out.print("<a href='login4.html'> Re-login</a>");
			out.print("</body></html>");
		}
	}
}
