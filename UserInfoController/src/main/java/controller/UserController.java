package controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/login")
	public String login(String name,String pass){
		String result = "";
		if("admin".equals(name)&&"123".equals(pass)){
			result = "index";
		}else{
			result = "login";
		}
		
		return result;
	}
}
