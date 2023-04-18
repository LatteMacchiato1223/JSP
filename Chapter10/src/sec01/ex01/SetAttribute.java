package sec01.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/set")
public class SetAttribute extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String con = "Bind to context";
		String ses = "Bind to session";
		String req = "Bind to request";
		
		// HttpServletContext 객체, HttpSession 객체, HttpServletRequest 객체를 얻은 후 속성을 바인딩
		ServletContext c = getServletContext();
		HttpSession s = request.getSession();
		c.setAttribute("context", con);
		s.setAttribute("session", ses);
		request.setAttribute("request", req);
		
		out.print("Perform Binding");
		
	}
}
