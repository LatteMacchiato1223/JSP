package sec01.ex01;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/get")
public class GetAttribute extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		ServletContext c = getServletContext();
		HttpSession s = request.getSession();
		
		// 각 서블릿 API에서 바인딩 된 속성의 값을 가져옴 
		String con = (String) c.getAttribute("context");
		String ses = (String) s.getAttribute("session");
		String req = (String) request.getAttribute("request");
		
		out.print("context value : " + con + "<br>");
		out.print("session value : " + ses + "<br>");
		out.print("request value : " + req + "<br>");
	}
}
