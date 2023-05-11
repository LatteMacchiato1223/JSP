package sec01.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/sess")
public class SessionTest extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		// Session 객체를 가져옴
		HttpSession session = request.getSession();
		// session 객체에 name을 바인딩
		session.setAttribute("name", "Latte");
		
		out.println("<html><body>");
		out.println("<h1>Bind name to session</h1>");
		out.println("<a href='/Chapter12/SessionT/session.jsp'>Go to the first page</a>");
		out.println("</body></html>");
	}
}
