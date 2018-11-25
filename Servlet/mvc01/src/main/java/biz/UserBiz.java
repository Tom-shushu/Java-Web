package biz;

import bean.UserInfo;
import dao.UserInfoDAO;

public class UserBiz {

	private UserInfoDAO uidao = new UserInfoDAO();
	
	public void saveUser(UserInfo ui){
		uidao.saveUser(ui);
	}
}
