package service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/cookie")
public class CookieServlet extends HttpServlet{

	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		
		//登录成功之后,将内容保存到cookie中
		Cookie cookie1 = new Cookie("NAME", name);//产生了一个cookie对象
		cookie1.setMaxAge(60*60*24);//设置cookie1的保存时间
		response.addCookie(cookie1);//保存cookie1
		
		Cookie cookie2 = new Cookie("PASS", pass);//产生了一个cookie对象
		cookie2.setMaxAge(60*60*24);//设置cookie2的保存时间
		response.addCookie(cookie2);//保存cookie2
		
		response.sendRedirect("index.jsp");
	}
	
}
