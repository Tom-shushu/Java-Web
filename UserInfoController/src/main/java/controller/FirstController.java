package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import bean.UserBean;

@Controller
@RequestMapping("/first")
public class FirstController {

	@RequestMapping("/a")
	public String methodA(){
		System.out.println("*********88");
		return "index";
	}
	
	@RequestMapping("/b")
	public String methodB(String name){
		System.out.println("接收到用户传递的参数:"+name);
		return "index";
	}
	@RequestMapping("/c")
	public String methodC(int numa,int numb){
		System.out.println(numa+numb);
		return "index";
	}
	
	@RequestMapping("/d")
	public String methodD(UserBean ub){
		System.out.println(ub);
		return "index";
	}
	
	@RequestMapping("/e")
	public String methodE(){
		System.out.println("进入了E");
		//redirect:url
		return "redirect:/abcd.jsp";
	}
	
	@RequestMapping("/f")
	// 如何获取Servlet API
	public String methodF(HttpServletRequest request){
		request.setAttribute("A", "Request");
		request.getSession().setAttribute("B", "Session");
		return "index";
	}
	
}
