package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginview")
public class LoginViewServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		//ÉèÖÃÏìÓ¦±àÂë¼¯
		response.setCharacterEncoding("utf-8");
		String id = request.getParameter("errorMsg");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>µÇÂ¼Ò³Ãæ</title>");
		out.println("<meta charset='UTF-8'>");
		out.println("</head>");
		out.println("<body>");
		if(id!=null){
			out.println("<label style='color:red'>ÄãµÄÕËºÅ»òÕßÃÜÂë´íÎó!</label>");
		}
		out.println("<form action='loginview' method='post'>");
		out.println("ÕËºÅ:<input type='text' name='name'/><br/>");
		out.println("ÃÜÂë:<input type='password' name='pass'/><br/>");
		out.println("<input type='submit' value='µÇÂ¼'/><br/>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		if("admin".equals(name)&&"china".equals(pass)){
			response.sendRedirect("index.jsp");
		}else{
			response.sendRedirect("loginview?errorMsg=1");
		}
	}
	
}
