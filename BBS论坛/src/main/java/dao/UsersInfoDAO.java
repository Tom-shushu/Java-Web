package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.UsersInfo;
import db.DBManager;
import util.DateUtil;

public class UsersInfoDAO {

	private Connection conn = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;

	/**
	 * 实现了用户登录操作,用户传递近来账号和密码,使用userInfo进行了封装操作 当用户账号密码正确时,返回用户信息;否则,返回null
	 * 
	 * @param ui
	 * @return
	 */
	public UsersInfo checkLogin(UsersInfo ui) {
		String sql = "select * from users where username=? and userpass=?";
		conn = DBManager.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, ui.getUsername());
			ps.setString(2, ui.getUserpass());
			rs = ps.executeQuery();
			if (rs.next()) {
				ui.setUserid(rs.getInt(1));
				ui.setUsernickname(rs.getString(4));
				ui.setUserimg(rs.getString(5));
				ui.setUserlev(rs.getInt(6));
				ui.setUsercity(rs.getString(7));
				ui.setUserdate(rs.getString(8));
				ui.setUserstate(rs.getInt(9));
			} else {
				ui = null;
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return ui;
	}
	/**
	 * 实现了用户注册效果,表中有默认的值的列,在Java都传递的是null
	 * 
	 * @param ui
	 */
	public void addUser(UsersInfo ui) {
		String sql = "insert into users values(null,?,?,?,default,default,?,?,default)";
		conn = DBManager.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, ui.getUsername());
			ps.setString(2, ui.getUserpass());
			ps.setString(3, ui.getUsernickname());
			ps.setString(4, ui.getUsercity());
			ps.setString(5, DateUtil.getNowDate());

			ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
