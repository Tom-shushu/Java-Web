package com.biz;

import java.util.List;

import com.bean.UserInfo;
import com.dao.UserInfoDAO;

public class UserBiz {

	private UserInfoDAO uidao = new UserInfoDAO();
	public List<UserInfo> findAll(){
		return uidao.findAll();
	}
}
