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
		
		//��¼�ɹ�֮��,�����ݱ��浽cookie��
		Cookie cookie1 = new Cookie("NAME", name);//������һ��cookie����
		cookie1.setMaxAge(60*60*24);//����cookie1�ı���ʱ��
		response.addCookie(cookie1);//����cookie1
		
		Cookie cookie2 = new Cookie("PASS", pass);//������һ��cookie����
		cookie2.setMaxAge(60*60*24);//����cookie2�ı���ʱ��
		response.addCookie(cookie2);//����cookie2
		
		response.sendRedirect("index.jsp");
	}
	
}
