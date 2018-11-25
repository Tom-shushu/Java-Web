package biz;

import java.util.List;

import bean.UserInfo;

public interface UserBiz {

	public void add(UserInfo ui);
	public void update(UserInfo ui);
	public void delete(int userId);
	public UserInfo findById(int userId);
	public List<UserInfo> findAll();
}
