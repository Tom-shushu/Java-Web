package service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.UserInfo;
import biz.UserBiz;
@WebServlet("/saveuser")
public class UserServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	private UserBiz ub = new UserBiz();
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		String sex = request.getParameter("sex");
		int age = Integer.parseInt(request.getParameter("age"));
		String address = request.getParameter("address");
		
		UserInfo ui = new UserInfo();
		ui.setUserAddress(address);
		ui.setUserAge(age);
		ui.setUserName(name);
		ui.setUserSex(sex);
		
		ub.saveUser(ui);
		
		response.sendRedirect("index.jsp");
		
	}
	
}
