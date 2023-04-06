package sec01.ex02;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/second")
public class SecondServlet extends HttpServlet {
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init 메소드 호출");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		// 첫번째 서블릿에서 전송한 로그인 정보를 가져 옴  
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		String user_address = request.getParameter("user_address");
		
		out.print("<html><body>");
		
		if (user_id!=null && user_id.length()!=0) {
			// 첫번째 서블릿의 ID 정보를 이용해 로그인 상태 유지 
			out.println("You're already here!<br><br>");
			out.println("Recieved ID : " + user_id + "<br>");
			out.println("Recieved PW : " + user_pw + "<br>");
			out.println("Recieved Address : " + user_address + "<br>");
		} else {
			// 로그인 창을 거치지 않고 바로 요청한 경우 로그인 창으로 다시 이동을 요구 
			out.println("You didn't sign up!<br>");
			out.println("Try again please!<br><br>");
			out.println("<a href='/Chapter09/login2.html'>Wanna sign up?</>");
		}
	}
	
	public void destroy() {
		System.out.println("destroy 메소드 호출");
	}
}
