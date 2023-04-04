package sec03.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/cset")
public class SetServletContext extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		// getServletContext 객체 가져오기 
		ServletContext context = getServletContext();
		
		List member = new ArrayList();
		member.add("Latte"); // 이름 
		member.add(123); // 나이 
		
		// 객체에 데이터 바인딩
		context.setAttribute("member", member);
		
		out.print("<html><body>");
		out.print("Setting Latte and 123");
		out.print("</body></html>");
	}
}
