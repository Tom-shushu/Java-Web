package biz;

import bean.UsersInfo;
import dao.UsersInfoDAO;

public class UsersBiz {

	private UsersInfoDAO uidao = new UsersInfoDAO();
	public UsersInfo checkLogin(UsersInfo ui) {
		return uidao.checkLogin(ui);
	}
	
	public void addUser(UsersInfo ui) {
		uidao.addUser(ui);
	}
	
}
