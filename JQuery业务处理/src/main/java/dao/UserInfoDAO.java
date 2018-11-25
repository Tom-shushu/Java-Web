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
	
	/**
	 * 实现了UserInfo表的修改操作,其中主键为自增效果
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
	 * 通过用户传递过来的userId删除表信息
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
	 * 实现了从数据控将userInfo表的信息全部检索出来,生产一个List集合
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
	 * 通过ID检索userinfo
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
	 * 模糊查询,根据wd来进行姓名的模糊查询,生产一个List集合
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
	 * 实现了从数据库按照页数将userInfo表的信息检索出来,生产一个List集合
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
