package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import bean.UserInfo;
import biz.UserBiz;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserBiz ub;
	
	@RequestMapping("/add")
	public String add(UserInfo ui){
		ub.add(ui);
		return "index";
	}
	@RequestMapping("/update")
	public String update(UserInfo ui){
		ub.update(ui);
		return "index";
	}
	@RequestMapping("/delete")
	public String delete(int userId){
		ub.delete(userId);
		return "index";
	}
	
	@RequestMapping("/findbyid")
	public String findById(int userId,HttpServletRequest request){
		request.setAttribute("USERINFO", ub.findById(userId));
		return "update";
	}
	@RequestMapping("/find")
	public String find(HttpServletRequest request){
		request.setAttribute("USERLIAT", ub.findAll());
		return "index";
	}
}
