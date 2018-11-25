package biz;

import java.util.List;

import bean.UserInfo;
import dao.UserInfoDAO;

public class UserBiz {

	private UserInfoDAO uidao = new UserInfoDAO();
	
	public void saveUser(UserInfo ui){
		uidao.saveUser(ui);
	}
	public List<UserInfo> findAll(){
		return uidao.findAll();
	}
	
	public void deleteUser(int userId){
		uidao.deleteUser(userId);
	}
	
	public List<UserInfo> findPage(int page){
		return uidao.findPage(page);
	}
	
	public List<UserInfo> find(String wd){
		List<UserInfo> list = uidao.find(wd);
		for (UserInfo ui : list) {
			String name = ui.getUserName();
			name = name.replace(wd, "<label style='color:red'>"+wd+"</label>");
			ui.setUserName(name);
		}
		
		return list;
	}


	public void updateUser(UserInfo ui){
		uidao.updateUser(ui);
	}
	public UserInfo findById(int id){
		return uidao.findById(id);
	}
}
