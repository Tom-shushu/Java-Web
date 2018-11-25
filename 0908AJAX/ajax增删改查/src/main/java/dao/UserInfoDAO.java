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
	
	public void addUser(UserInfo ui){
		String sql = "insert into userinfo values(null,?,?,?,?)";
		conn = DBManager.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, ui.getUserName());
			ps.setString(2, ui.getUserSex());
			ps.setInt(3, ui.getUserAge());
			ps.setString(4, ui.getUserAddress());
			ps.executeUpdate();// JDBC 是自动提交事务
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public List<UserInfo> findByWd(String wd){
		List<UserInfo> list = new ArrayList<UserInfo>();
		String sql = "select *from userinfo where username like ? or useraddress like ? limit 0,10";
		conn = DBManager.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, "%"+wd+"%");
			ps.setString(2, "%"+wd+"%");
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
	
	public int findAllPage(int pageNum){
		int page = 0 ,count = 0;
		String sql = "select count(*) from userinfo";
		conn = DBManager.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()){
				count = rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 根据总条数(count)跟每页显示多少条(10),进行计算,得出总页数
		page = count%10==0?(count/10):(count/10+1);
		
		return page;
	}
	
	public void deleteUser(int userId){
		String sql = "delete from userinfo where userid=?";
		conn = DBManager.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, userId);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public List<UserInfo> findAll(int page){
		List<UserInfo> list = new ArrayList<UserInfo>();
		String sql = "select *from userinfo limit ?,10";
		conn = DBManager.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, (page-1)*10);
			rs= ps.executeQuery();
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
	
	public List<UserInfo> findAll(int page,String fieldName){
		List<UserInfo> list = new ArrayList<UserInfo>();
		String sql = "select *from userinfo order by "+fieldName+" limit ?,10";
		conn = DBManager.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, (page-1)*10);
			rs= ps.executeQuery();
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
	
}
