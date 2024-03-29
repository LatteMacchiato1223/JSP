package sec04.ex02;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "loadConfig", urlPatterns = { "/loadConfig" }, loadOnStartup = 1) // +loadOnStartup, 우선순위 1로 설정
public class LoadAppConfig extends HttpServlet {
	private ServletContext context;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("LoadAppConfig의 init 메소드 호출");
		
		// init() 메소드에서 ServletContext 객체를 얻음
		context = config.getServletContext();
		
		// getInitParameter() 메소드로 web.xml의 메뉴 정보를 읽어 옴 
		String menu_member = context.getInitParameter("menu_member");
		String menu_order = context.getInitParameter("menu_order");
		String menu_goods = context.getInitParameter("menu_goods");
		
		// 메뉴 정보를 ServletContext 객체에 바인딩 함
		context.setAttribute("menu_member", menu_member);
		context.setAttribute("menu_order", menu_order);
		context.setAttribute("menu_goods", menu_goods);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		// doGet() 메소드 호출 시 ServletContext 객체 가져오는 부분 주석 처리
		//ServletContext context = getServletContext();
		
		String menu_member = (String) context.getAttribute("menu_member");
		String menu_order = (String) context.getAttribute("menu_order");
		String menu_goods = (String) context.getAttribute("menu_goods");
		
		out.print("<html><body>");
		out.print("<table border=1 cellspacing=0><tr>Menu</tr>");
		out.print("<tr><td>" + menu_member + "</td></tr>");
		out.print("<tr><td>" + menu_order + "</td></tr>");
		out.print("<tr><td>" + menu_goods + "</td></tr>");
		out.print("</table></body></html>");
	}
}
