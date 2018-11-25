package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.UserInfo;

@WebServlet("/json2")
public class JSONListServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		
		PrintWriter out = response.getWriter();
		
		
		List<UserInfo> list = findAll();
		String str = "";
		str+="[";
		for (UserInfo ui : list) {
			str+="{";
			str+="\"id\":\""+ui.getUserId()+"\",";
			str+="\"name\":\""+ui.getUserName()+"\",";
			str+="\"age\":\""+ui.getUserAge()+"\",";
			str+="\"address\":\""+ui.getUserAddress()+"\"";
			str+="},";
		}
		str = str.substring(0, str.length()-1);
		str+="]";
		
		
		// : ��ֵ��
		// , �ָ����,�ָ�����
		// { } ����
		// []  ���鼯��
		/*
		 
		 
		 [{"":"","":"","":""},{"":"","":"","":""},{},{}]
		 
		 
		 */
		
		out.print(str);
		
		
		
		
	}
	
	// ģ�����ݿ��ȫ����Ч��,����list����
	private List<UserInfo> findAll(){
		List<UserInfo> list = new ArrayList<UserInfo>();
		

		UserInfo ui1 = new UserInfo("1","����","18","����");
		UserInfo ui2 = new UserInfo("2","����","18","����");
		UserInfo ui3 = new UserInfo("3","����","19","����");
		
		list.add(ui1);
		list.add(ui2);
		list.add(ui3);
		return list;
	}
	
	
}
