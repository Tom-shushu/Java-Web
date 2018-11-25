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
		
		
		// : 键值对
		// , 分割对象,分割属性
		// { } 对象
		// []  数组集合
		/*
		 
		 
		 [{"":"","":"","":""},{"":"","":"","":""},{},{}]
		 
		 
		 */
		
		out.print(str);
		
		
		
		
	}
	
	// 模拟数据库的全检索效果,返回list集合
	private List<UserInfo> findAll(){
		List<UserInfo> list = new ArrayList<UserInfo>();
		

		UserInfo ui1 = new UserInfo("1","张三","18","西安");
		UserInfo ui2 = new UserInfo("2","李四","18","宝鸡");
		UserInfo ui3 = new UserInfo("3","王五","19","榆林");
		
		list.add(ui1);
		list.add(ui2);
		list.add(ui3);
		return list;
	}
	
	
}
