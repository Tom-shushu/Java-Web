package service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		//��ȡ��session����
		HttpSession session = request.getSession();
		
		
		
		//1.��ȡ���û��˺ź�����
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		//2.�ж��û��˺ź������Ƿ���ȷ
		if("admin".equalsIgnoreCase(name)&&"china".equals(pass)){
			//������ȷ
			//3.���û���Ϣ���浽session��
			session.setAttribute("NAME", name);
			session.setAttribute("PASS", pass);
			response.sendRedirect("index.jsp");
		}else{
			//�������
			//3.���ص�¼ҳ��,���Ҹ�֪�û�����
			session.setAttribute("ERROR", "����˺Ż����������!");
			response.sendRedirect("login.jsp");
		}
	}
	
}
