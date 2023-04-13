package sec03.ex03;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/sess3")
public class SessionTest3 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		
		out.println("Session ID : " + session.getId() + "<br>");
		out.println("First session creation time : " + new Date(session.getCreationTime()) + "<br>");
		out.println("Latest session access time : " + new Date(session.getLastAccessedTime()) + "<br>");
		out.println("Session valid time : " + session.getMaxInactiveInterval() + "<br>");
		
		if (session.isNew()) {
			out.print("New session has been created");
		}
		// invalidate()를 호출하여 생성된 세션 객체를 강제로 삭제 
		session.invalidate();
	}
}
