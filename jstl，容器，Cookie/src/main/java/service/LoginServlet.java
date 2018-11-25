package service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	// 负责登陆
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		HttpSession session = request.getSession();

		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		if ("admin".equalsIgnoreCase(name) && "china".equals(pass)) {
			session.setAttribute("NAME", name);
			response.sendRedirect("index.jsp");
		} else {
			response.sendRedirect("login.jsp?error=1");
		}
	}

	// 负责登陆
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.removeAttribute("NAME");
		response.sendRedirect("index.jsp");
	}
}
