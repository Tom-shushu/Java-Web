package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/one")
public class AjaxOneServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String name = request.getParameter("name");
		System.out.println(name);
		
		// 需要一个对象,这个对象负责向浏览器输出内容
		PrintWriter out = response.getWriter();
		out.println("wwwww");
		out.println("mmmmm");
		out.println("ttttt");
	}
}
