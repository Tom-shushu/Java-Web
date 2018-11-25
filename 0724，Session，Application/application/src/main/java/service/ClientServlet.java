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
		//��λ�ȡ��application
		ServletContext application = request.getSession().getServletContext();
		
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("nickname");
		String image = request.getParameter("image");
		//��2�����������һ������
		ClientInfo ci = new ClientInfo(name, image);
		
		//��ci��ŵ�������
		List<ClientInfo> list = null;
		//�ж��Ƿ��ǵ�һ�δ��
		if(application.getAttribute("LIST")==null){
			list = new ArrayList<ClientInfo>();//�½�һ������
		}else{
			list = (List<ClientInfo>)application.getAttribute("LIST");//ʹ��ԭ���ļ���
		}
		
		list.add(ci);
		application.setAttribute("LIST", list);//��list��ŵ�application������
		response.sendRedirect("index.jsp");
		
	}
}
