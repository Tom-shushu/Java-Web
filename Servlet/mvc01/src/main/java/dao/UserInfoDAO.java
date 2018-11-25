package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import bean.UserInfo;
import db.DBManager;

public class UserInfoDAO {

	private Connection conn = null;
	private PreparedStatement ps = null;
	/**
	 * 实现了UserInfo表的添加操作,其中主键为自增效果
	 * @param ui
	 */
	public void saveUser(UserInfo ui){
		String sql = "insert into userinfo values(null,?,?,?,?)";
		conn = DBManager.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, ui.getUserName());
			ps.setString(2, ui.getUserSex());
			ps.setInt(3, ui.getUserAge());
			ps.setString(4, ui.getUserAddress());
			ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	
}
