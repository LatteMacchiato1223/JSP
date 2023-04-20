package sec04.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login2")
public class LoginTest extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//request.setCharacterEncoding("utf-8");
		//response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		
		String user_id = request.getParameter("user_id");
		String user_pwd = request.getParameter("user_pwd");
		
		// 이벤트 핸들러를 생성 후 세션에 저장
		LoginImpl loginUser = new LoginImpl(user_id, user_pwd);
		if (session.isNew()) {
			// 세션에 바인딩 시 LoginImpl의 valueBound() 메소드를 호출
			session.setAttribute("loginUser", loginUser);
		}
		
		out.println("<head>");
		out.println("<script type='text/javascript'>");
		// 자바스크립트의 setTimeout() 함수를 이용해 5초마다 서블릿에 재요청하여 현재 접속자의 수를 표시
		out.println("setTimeout('history.go(0);', 5000)");
		out.println("</script>");
		out.println("</head>");
		
		out.println("<html><body>");
		// 접속자의 수를 브라우저로 출력 
		out.println("ID is " + loginUser.user_id + "<br>");
		out.println("Total number of users is " + LoginImpl.total_user + "<br>");
		out.println("</body></html>");
	}
}
