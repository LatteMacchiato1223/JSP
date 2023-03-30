package sec02.ex02;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/view")
public class ViewServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		List membersList = (List) request.getAttribute("membersList"); 
		
		out.print("<html><body>");
		out.print("<table border=1><tr align='center' bgcolor='Lavender'>");
		out.print("<td>ID</td><td>Password</td><td>Name</td><td>E-mail</td><td>Joined on</td><td>Delete</td></tr>");
		
		for (int i = 0; i < membersList.size(); i++) {
			MemberVO memberVO = (MemberVO) membersList.get(i);
			String id = memberVO.getId();
			String pwd = memberVO.getPwd();
			String name = memberVO.getName();
			String email = memberVO.getEmail();
			Date joinDate = memberVO.getJoinDate();
			out.print("<tr><td>" + id + "</td><td>" + pwd + "</td><td>" + name 
					+ "</td><td>" + email + "</td><td>" + joinDate + "</td><td>"
					+ "<a href='/Chapter08/members?command=delMember&id=" + id + "'>Delete</a></td></tr>");
		}
		out.print("</table></body><html>");
		out.print("<a href='/Chapter08/memberForm.html'>Add new member</a>");
	}
}
