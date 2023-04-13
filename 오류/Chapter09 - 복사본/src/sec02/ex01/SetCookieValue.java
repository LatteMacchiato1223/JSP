package sec02.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/set")
public class SetCookieValue extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		Date d = new Date();
		
		// Cookie 객체를 생성한 후 cookieTest 이름으로 한글 정보를 인코딩하여 쿠키에 저장 
		Cookie c = new Cookie("cookieTest", URLEncoder.encode("JSP Programming", "utf-8"));
		
		// 유효기간 24시간으로 설정 
		c.setMaxAge(24*60*60);
		
		// 생성된 쿠키를 브라우저로 전송 
		response.addCookie(c);
		out.println("Current Time : " + d);
		out.println("Save String to Cookie");
	}
}
