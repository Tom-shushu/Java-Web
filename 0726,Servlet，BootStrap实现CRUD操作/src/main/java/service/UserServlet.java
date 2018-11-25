package service;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.UserInfo;
import biz.UserBiz;

@WebServlet("/user")
public class UserServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	private UserBiz ub = new UserBiz();

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String type = request.getParameter("type");
		// 分流操作
		if(type==null||"findall".equals(type)){
			findall(request, response);
		}else if("add".equals(type)){
			add(request, response);
		}
		
	}
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		String type = request.getParameter("type");
		// 分流操作
		if(type==null||"findall".equals(type)){
			findall(request, response);
		}else if("add".equals(type)){
			add(request, response);
		}
		
	}
	
	//实现分页操作,默认情况下为第一页
	public void findall(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		int page = 1;
		if(request.getParameter("page")==null){
			page = 1;
		}else{
			page = Integer.parseInt(request.getParameter("page"));
		}
		
		// 将数据库的内容取出来
		List<UserInfo> list = ub.findPage(page);
		// 将取出来的内容存放到session
		HttpSession session = request.getSession();
		session.setAttribute("USERLIST", list);
		// 跳转到index.jsp
		response.sendRedirect("index.jsp?page="+page);
	}
	
	public void add(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String sex = request.getParameter("sex");
		int age = Integer.parseInt(request.getParameter("age"));
		String address = request.getParameter("address");
		
		UserInfo ui = new UserInfo();
		ui.setUserAddress(address);
		ui.setUserAge(age);
		ui.setUserName(name);
		ui.setUserSex(sex);
		
		ub.addUser(ui);
		
		response.sendRedirect("index.jsp?page=1");
		
		
		
	}
	
}
