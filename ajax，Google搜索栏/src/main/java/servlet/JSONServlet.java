package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.UserInfo;

@WebServlet("/json")
public class JSONServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		System.out.println("接收的值为:" + id);
		
		response.setCharacterEncoding("utf-8");
		
		PrintWriter out = response.getWriter();
		/*
		 * 第一种 写法:直接拼接字符串
		 * String str = "{\"name\":\"admin\",\"age\":\"19\"}";
		out.print(str);
		 */
		
		UserInfo ui = new UserInfo("1", "张三", "19", "西安");
		String str = "";
		str+="{";
		str+="\"id\":\""+ui.getUserId()+"\",";
		str+="\"name\":\""+ui.getUserName()+"\",";
		str+="\"age\":\""+ui.getUserAge()+"\",";
		str+="\"address\":\""+ui.getUserAddress()+"\"";
		str+="}";
		
		out.print(str);
		
		
	}
}
