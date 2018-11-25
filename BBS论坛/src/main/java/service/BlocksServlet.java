package service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import biz.BlocksBiz;

@WebServlet("/blocks")
public class BlocksServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	private BlocksBiz bb = new BlocksBiz();
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String type = request.getParameter("type");
		if(null==type||"findall".equals(type)){
			findall(request, response);
		}
	}
	
	public void findall(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.setAttribute("ALLBLOCKS", bb.findAllBlocks());
		response.sendRedirect("index.jsp");
	}
}
