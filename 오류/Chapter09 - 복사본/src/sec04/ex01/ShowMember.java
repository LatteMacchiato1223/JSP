package sec04.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/show")
public class ShowMember extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		String id = "", pwd = "";
		Boolean isLogOn = false;
		
		// 이미 세션이 존재하면 세션을 반환, 없으면 null을 반환
		HttpSession session = request.getSession(false);
		
		// 세션이 생성되었나 확인
		if (session != null) {
			// isLogOn 속성을 가져와 로그인 상태 확인
			isLogOn = (Boolean) session.getAttribute("login.id");
			// isLogOn이 true면 로그인 상태이므로 회원 정볼르 브라우저에 표시
			if (isLogOn == true) {
				id = (String) session.getAttribute("login.id");
				pwd = (String) session.getAttribute("login.pwd");
				out.print("<html><body>");
				out.print("ID: " + id + "<br>");
				out.print("PW: " + pwd + "<br>");
				out.print("</body></html>");
			} else {
				// 로그인 상태가 아니면 로그인창으로 이동 
				response.sendRedirect("login4.html");
			}
		} else {
			// 세션이 생성되지 않았으면 로그인 창으로 이동 
			response.sendRedirect("login4.html");
		}
	}
}
