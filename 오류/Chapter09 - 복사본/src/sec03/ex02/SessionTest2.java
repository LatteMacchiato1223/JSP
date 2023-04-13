package sec03.ex02;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/sess2")
public class SessionTest2 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		
		out.println("Session ID : " + session.getId() + "<br>");
		out.println("First session creation time : " + new Date(session.getCreationTime()) + "<br>");
		out.println("Latest session access time : " + new Date(session.getLastAccessedTime()) + "<br>");
													// 톰캣의 기본 세션 유효 시간을 출력  
		out.println("Default session valid time : " + session.getMaxInactiveInterval() + "<br>");
		session.setMaxInactiveInterval(5);
													// 유효 시간을 재설정한 후 세션 유효 시간을 출력 
		out.println("Session expiration time : " + session.getMaxInactiveInterval() + "<br>");
		
		// 최초 생성된 세션인지 판별
		if (session.isNew()) {
			out.print("New session has been created");
		}
		
	}
}
