package service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		//获取到session对象
		HttpSession session = request.getSession();
		
		
		
		//1.获取到用户账号和密码
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		//2.判断用户账号和密码是否正确
		if("admin".equalsIgnoreCase(name)&&"china".equals(pass)){
			//代表正确
			//3.将用户信息保存到session中
			session.setAttribute("NAME", name);
			session.setAttribute("PASS", pass);
			response.sendRedirect("index.jsp");
		}else{
			//代表错误
			//3.返回登录页面,并且告知用户错误
			session.setAttribute("ERROR", "你的账号或者密码错误!");
			response.sendRedirect("login.jsp");
		}
	}
	
}
