package biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bean.UserInfo;
import biz.UserBiz;
import dao.UserInfoDAO;

@Service
public class UserBizImpl implements UserBiz {

	@Autowired
	private UserInfoDAO uidao;
	@Override
	public void add(UserInfo ui) {
		uidao.add(ui);
	}

	@Override
	public void update(UserInfo ui) {
		uidao.update(ui);
	}

	@Override
	public void delete(int userId) {
		uidao.delete(userId);
	}

	@Override
	public UserInfo findById(int userId) {
		return uidao.findById(userId);
	}

	@Override
	public List<UserInfo> findAll() {
		return uidao.findAll();
	}

}
