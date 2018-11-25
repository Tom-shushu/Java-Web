package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ajaxtwo")
public class AjaxTwoServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String wd = request.getParameter("wd");
		int asc = 0;
		if(wd.length()>0){
			asc = wd.charAt(wd.length()-1);
		}
		PrintWriter out = response.getWriter();
		out.println(asc);
		
		
		
		
	}
}
