package service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.BlocksInfo;
import bean.PostsInfo;
import bean.UsersInfo;
import biz.PostsBiz;

@WebServlet("/post")
public class PostsServlet extends HttpServlet{

	private PostsBiz pb = new PostsBiz();
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String type = request.getParameter("type");
		if("add".equals(type)){
			add(request, response);
		}
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String type = request.getParameter("type");
		if("findbyid".equals(type)){
			findbyid(request, response);
		}
	}
	
	public void findbyid(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		request.getSession().getServletContext().setAttribute("POSTSLIST", pb.findPostsByBlocksId(id));
		response.sendRedirect("index.jsp?blockid="+id);
	}
	
	public void add(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		UsersInfo ui = (UsersInfo)session.getAttribute("USERSINFO");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		int blocksId = Integer.parseInt(request.getParameter("id"));
		BlocksInfo bi = new BlocksInfo();
		bi.setBlockId(blocksId);
		
		PostsInfo pi = new PostsInfo();
		pi.setBi(bi);
		pi.setPostContent(content);
		pi.setPostTitle(title);
		pi.setUi(ui);
		
		pb.addPost(pi);
		
		response.sendRedirect("index.jsp");
		
	}
}
