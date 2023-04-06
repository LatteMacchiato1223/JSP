package sec01.ex02;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

@WebServlet("/login2")
public class LoginServlet extends HttpServlet {
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init 메소드 호출");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		// hidden 태그로 전송 된 값을 가져온다.
		String user_address = request.getParameter("user_address");
		String user_email = request.getParameter("user_email");
		String user_hp = request.getParameter("user_hp");
		
		String data = "Greetings!<br>You just sign up!<br><br>";
		
		data += "<html><body>";
		data += "ID : " + user_id;
		data += "<br>";
		data += "PW : " + user_pw;
		data += "<br>";
		data += "Address : " + user_address;
		data += "<br>";
		data += "E-mail : " + user_email;
		data += "<br>";
		data += "Tel : " + user_hp;
		data += "<br>";
		out.print(data);
		
		// GET 방식으로 한글을 전송하기 위한 인코딩 
		// <a> 태그를 이용해 링크 클릭 시 서블릿 /second로 다시 로그인 정보 전송 
		user_address = URLEncoder.encode(user_address, "utf-8");
		out.print("<a href='/Chapter09/second?user_id="+user_id+"&user_pw="+user_pw+
				"&user_address="+user_address+"'><br>Send to second Servlet</a>");
		
		data = "</body></html>";
		out.print(data);
	}
	
	public void destroy() {
		System.out.println("destroy 메소드 호출");
	}
}
