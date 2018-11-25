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
	/**
	 * ʵ����UserInfo�����Ӳ���,��������Ϊ����Ч��
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
	
	/**
	 * ʵ����UserInfo����޸Ĳ���,��������Ϊ����Ч��
	 * @param ui
	 */
	public void updateUser(UserInfo ui){
		String sql = "update userinfo set username=?,usersex=?,userage=?,useraddress=? where userid=?";
		conn = DBManager.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, ui.getUserName());
			ps.setString(2, ui.getUserSex());
			ps.setInt(3, ui.getUserAge());
			ps.setString(4, ui.getUserAddress());
			ps.setInt(5, ui.getUserId());
			ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	/**
	 * ͨ���û����ݹ�����userIdɾ������Ϣ
	 * @param userId
	 */
	public void deleteUser(int userId){
		String sql = "delete from userinfo where userid=?";
		conn = DBManager.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, userId);
			ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	/**
	 * ʵ���˴����ݿؽ�userInfo�����Ϣȫ����������,����һ��List����
	 * @return
	 */
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
	
	/**
	 * ͨ��ID����userinfo
	 * @return
	 */
	public UserInfo findById(int id){
		UserInfo ui = new UserInfo();
		String sql = "select * from userinfo where userid=?";
		
		conn = DBManager.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if(rs.next()){
				ui.setUserId(rs.getInt(1));
				ui.setUserName(rs.getString(2));
				ui.setUserSex(rs.getString(3));
				ui.setUserAge(rs.getInt(4));
				ui.setUserAddress(rs.getString(5));
				
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return ui;
	}
	
	/**
	 * ģ����ѯ,����wd������������ģ����ѯ,����һ��List����
	 * @return
	 */
	public List<UserInfo> find(String wd){
		List<UserInfo> list = new ArrayList<UserInfo>();
		String sql = "select * from userinfo where username like ?";
		
		conn = DBManager.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, "%"+wd+"%");
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
	
	
	/**
	 * ʵ���˴����ݿⰴ��ҳ����userInfo�����Ϣ��������,����һ��List����
	 * @return
	 */
	public List<UserInfo> findPage(int page){
		List<UserInfo> list = new ArrayList<UserInfo>();
		String sql = "select * from userinfo limit ?,?";
		
		conn = DBManager.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, (page-1)*10);
			ps.setInt(2, 10);
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
	
}
