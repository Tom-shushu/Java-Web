package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.UserInfo;
import db.DBManager;

public class UserInfoDAO {

	private Connection conn = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	
	public List<UserInfo> findAll(){
		List<UserInfo> list = new ArrayList<UserInfo>();
		String sql = "select * from userinfo";
		conn = DBManager.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				UserInfo ui = new UserInfo();
				ui.setUserId(rs.getInt(1));
				ui.setUserName(rs.getString(2));
				ui.setUserSex(rs.getString(3));
				ui.setUserAge(rs.getInt(4));
				ui.setUserAddress(rs.getString(5));
				list.add(ui);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return list;
	}
	
	public List<UserInfo> findPage(int page){
		List<UserInfo> list = new ArrayList<UserInfo>();
		String sql = "select * from userinfo limit ?,10";
		conn = DBManager.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, (page-1)*10);
			rs = ps.executeQuery();
			while(rs.next()){
				UserInfo ui = new UserInfo();
				ui.setUserId(rs.getInt(1));
				ui.setUserName(rs.getString(2));
				ui.setUserSex(rs.getString(3));
				ui.setUserAge(rs.getInt(4));
				ui.setUserAddress(rs.getString(5));
				list.add(ui);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return list;
	}
	
	public void addUser(UserInfo ui){
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
