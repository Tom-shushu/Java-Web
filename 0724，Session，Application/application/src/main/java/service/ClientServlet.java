package service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.ClientInfo;

@WebServlet("/client")
public class ClientServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		//如何获取到application
		ServletContext application = request.getSession().getServletContext();
		
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("nickname");
		String image = request.getParameter("image");
		//将2个参数变成了一个参数
		ClientInfo ci = new ClientInfo(name, image);
		
		//将ci存放到容器中
		List<ClientInfo> list = null;
		//判断是否是第一次存放
		if(application.getAttribute("LIST")==null){
			list = new ArrayList<ClientInfo>();//新建一个集合
		}else{
			list = (List<ClientInfo>)application.getAttribute("LIST");//使用原来的集合
		}
		
		list.add(ci);
		application.setAttribute("LIST", list);//将list存放到application容器中
		response.sendRedirect("index.jsp");
		
	}
}
