package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.UserInfo;

@WebServlet("/two")
public class TwoServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String address = request.getParameter("address");
		
		UserInfo ui = new UserInfo(id, name, age, address);
		System.out.println(ui);
		// 这里通过使用application容器模拟一个用户信息集合
		ServletContext application = request.getSession().getServletContext();
		
		List<UserInfo> list ;
		if(application.getAttribute("LIST")==null){
			list = new ArrayList<UserInfo>();
		}else{
			list = (List<UserInfo>)application.getAttribute("LIST");
		}
		list.add(ui);
		application.setAttribute("LIST", list);
		out.println(1);
		
	}
}
