package biz;

import java.util.List;

import bean.UserInfo;
import dao.UserInfoDAO;

public class UserBiz {

	private UserInfoDAO uidao = new UserInfoDAO();

	public List<UserInfo> findAll() {
		return uidao.findAll();
	}
	
	public List<UserInfo> findPage(int page){
		return uidao.findPage(page);
	}
	
	public void addUser(UserInfo ui){
		uidao.addUser(ui);
	}
	
	public void deleteUser(int id){
		uidao.deleteUser(id);
	}
	
	public void updateUser(UserInfo ui){
		uidao.updateUser(ui);
	}

}
