package sec04.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/test")
public class LogTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
		System.out.println("init 메소드 호출");
	}

	public void destroy() {
		System.out.println("destroy 메소드 호출");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		
		System.out.println("ID : " + user_id);
		System.out.println("PW : " + user_pw);
		
		if (user_id!=null && (user_id.length()!=0)) {
			out.print("<html>");
			out.print("<body>");
			out.print("User " + user_id + " has logged in");
			out.print("</body>");
			out.print("</html>");	
		} else {	
			out.print("<html>");
			out.print("<body>");
			out.print("Enter your ID");
			out.print("<br>");
			out.print("<a href='http://localhost:8070/Chapter06/test01/test.html'>"
					+ "Go to the login screen </a>");
			
			out.print("</body>");
			out.print("</html>");
		}
	}
}
