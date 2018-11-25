package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/google")
public class GoogleServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// ��Ҫһ������,�����������������������
		PrintWriter out = response.getWriter();
		String wd = request.getParameter("wd");
		//�������ȥ�����ݿ�,������������ģ��һ�����ݷ�ʽ
		for (int i = 1; i < 11; i++) {
			String str = wd + getStr();
			if(i==10){
				out.print(str);
			}else{
				out.print(str+"%");
			}
		}
		
		
	}
	
	private String getStr(){
		String str = "";
		int len = (int)(Math.random()*10+1);
		for (int i = 0; i < len; i++) {
			char c = (char)((int)(Math.random()*26+97));
			str+=c;
		}
		return str;
	}
	
}
