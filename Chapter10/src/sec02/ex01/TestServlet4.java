package sec02.ex01;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

// 디렉터리 이름만 일치하는 URL 패턴 
//@WebServlet("/*")
public class TestServlet4 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		// 컨텍스트 이름만 가져옴 
		String context = request.getContextPath();
		// 전체 URL을 가져옴
		String url = request.getRequestURL().toString();
		// 서블릿 매핑 이름만 가져옴
		String mapping = request.getServletPath();
		// URI를 가져옴
		String uri = request.getRequestURI();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Test Servlet4</title>");
		out.println("</head>");
		out.println("<body bgcolor='pink'>");
		out.println("<b></b><br>");
		out.println("<b>This is TestServlet4 : " + context + "</b><br>");
		out.println("<b>URL : " + url + "</b><br>");
		out.println("<b>Mapping name : " + mapping + "</b><br>");
		out.println("<b>URI : " + uri + "</b><br>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
}
