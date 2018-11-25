package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		if("add".equals(type)){
			add(request, response);
		}else if("find".equals(type)){
			find(request, response);
		}else if("search".equals(type)){
			search(request, response);
		}else if("order".equals(type)){
			find2(request, response);
		}else if("delete".equals(type)){
			delete(request, response);
		}
	}
	public void add(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String sex = request.getParameter("sex");
		String address = request.getParameter("address");
		int age = Integer.parseInt(request.getParameter("age"));
		UserInfo ui = new UserInfo(name,sex,age,address);
		
		ub.addUser(ui);
		
	}
	
	public void delete(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		
		ub.deleteUser(id);
		
	}
	
	public void find(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		int page = 1;//当前页数,如果用户没有传,默认第一页
		PrintWriter out = response.getWriter();
		if(request.getParameter("page")!=null){
			// 有用户传递过来的
			page = Integer.parseInt(request.getParameter("page"));
		}
		String str = ub.findAll(page);
		// 输出每页的10条数据
		out.print(str+".");
		// 输出foot中显示的总页数
		out.println(ub.findAllPage(10));
	}
	
	public void find2(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		String fieldName = request.getParameter("fieldName");
		
		if("姓名".equals(fieldName.trim())){
			fieldName = "username";
		}else if("年龄".equals(fieldName.trim())){
			fieldName = "userage";
		}else if("性别".equals(fieldName.trim())){
			fieldName = "usersex";
		}else if("住址".equals(fieldName.trim())){
			fieldName = "useraddress";
		}
		
		
		int page = 1;//当前页数,如果用户没有传,默认第一页
		PrintWriter out = response.getWriter();
		if(request.getParameter("page")!=null){
			// 有用户传递过来的
			page = Integer.parseInt(request.getParameter("page"));
		}
		String str = ub.findAll(page,fieldName);
		// 输出每页的10条数据
		out.print(str+".");
		// 输出foot中显示的总页数
		out.println(ub.findAllPage(10));
	}
	
	public void search(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		String wd = request.getParameter("wd");
		PrintWriter out = response.getWriter();
		String str = ub.findByWd(wd);
		out.print(str+".");
		// 输出foot中显示的总页数
		out.println(ub.findAllPage(10));
	}
	
}
