package service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.UsersInfo;
import biz.UsersBiz;

@WebServlet("/user")
public class UserServlet extends HttpServlet{

	private UsersBiz ub = new UsersBiz();
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String type = request.getParameter("type");
		if("add".equals(type)){
			addUser(request, response);
		}else if("login".equals(type)){
			loginUser(request, response);
		}
	}
	
	public void addUser(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		UsersInfo ui = new UsersInfo();
		
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		String nickname = request.getParameter("nickname");
		String city = request.getParameter("city");
		
		ui.setUsercity(city);
		ui.setUsername(name);
		ui.setUsernickname(nickname);
		ui.setUserpass(pass);
		
		ub.addUser(ui);
		
		response.sendRedirect("index.jsp");
	}
	
	public void loginUser(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
		UsersInfo ui = new UsersInfo();
		
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		
		ui.setUsername(name);
		ui.setUserpass(pass);
		
		ui = ub.checkLogin(ui);
		if(ui==null){
			session.setAttribute("ERROR", "ƒ„µƒ’À∫≈ªÚ’ﬂ√‹¬Î¥ÌŒÛ!");
			response.sendRedirect("index.jsp");
		}else{
			session.setAttribute("USERSINFO", ui);
			response.sendRedirect("index.jsp");
		}
		
	}
}
