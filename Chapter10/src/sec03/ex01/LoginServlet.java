package sec03.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 한글 전송 시 인코딩 작업 생략 - Filter로 처리 
		//request.setCharacterEncoding("utf-8");
		//response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		// getParameter() 메소드를 이용해 전송된 회원정보를 가져옴 
		String user_name = request.getParameter("user_name");
		String user_pwd = request.getParameter("user_pwd");
		
		// 브라우저로 결과 출력
		String data = "Greetings! " + user_name + "<br>";
		data += "<html><body>";
		data += "Name : " + user_name;
		data += "<br>";
		data += "PW : " + user_pwd;
		data += "</body></html>";
		out.print(data);
	}
}
