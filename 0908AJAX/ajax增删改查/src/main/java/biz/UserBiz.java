package biz;

import java.util.List;

import bean.UserInfo;
import dao.UserInfoDAO;

public class UserBiz {

	private UserInfoDAO uidao = new UserInfoDAO();
	public void addUser(UserInfo ui){
		uidao.addUser(ui);
	}
	public String findAll(int page){
		String str = "";
		List<UserInfo> list = uidao.findAll(page);
		for (UserInfo ui : list) {
			str+= ui.getUserName()+","+ui.getUserSex()+","+ui.getUserAge()+","+ui.getUserAddress()+","+ui.getUserId()+"%";
		}
		str = str.substring(0, str.length()-1);
		return str;
	}
	public void deleteUser(int userId){
		uidao.deleteUser(userId);
	}
	public String findAll(int page,String fieldName){
		String str = "";
		List<UserInfo> list = uidao.findAll(page,fieldName);
		for (UserInfo ui : list) {
			str+= ui.getUserName()+","+ui.getUserSex()+","+ui.getUserAge()+","+ui.getUserAddress()+","+ui.getUserId()+"%";
		}
		str = str.substring(0, str.length()-1);
		return str;
	}
	
	public String findByWd(String wd){
		String str = "";
		List<UserInfo> list = uidao.findByWd(wd);
		int index = 1;
		for (UserInfo ui : list) {
			str+="<tr>";
			str+="<td>"+index+"</td>";
			str+="<td>"+ui.getUserName()+"</td>";
			str+="<td>"+ui.getUserSex()+"</td>";
			str+="<td>"+ui.getUserAge()+"</td>";
			str+="<td>"+ui.getUserAddress()+"</td>";
			str+="<td>É¾³ýÐÞ¸Ä</td>";
			str+="</tr>";
			index++;
		}
		return str;
	}
	
	
	public String findAllPage(int pageNum){
		String str = "";
		int page = uidao.findAllPage(pageNum);
		for (int i = 1; i <= page; i++) {
			str+="<a href='javascript:selectPage("+i+")'>"+i+"</a>&nbsp;";
		}
		return str;
	}
}
