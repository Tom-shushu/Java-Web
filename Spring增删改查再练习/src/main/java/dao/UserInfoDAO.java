package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import bean.UserInfo;

@Repository
public class UserInfoDAO {

	@Autowired
	private JdbcTemplate jt;

	public void add(UserInfo ui) {
		String sql = "insert into userinfo values(null,?,?,?,?)";
		jt.update(sql,ui.getUserName(),ui.getUserSex(),ui.getUserAge(),ui.getUserAddress());
	}

	public void delete(int userId) {
		String sql = "delete from userinfo where userid="+userId;
		jt.update(sql);
	}

	public void update(UserInfo ui) {
		String sql = "update userinfo set username=?,usersex=?,userage=?,userAddress=? where userid=?"; 
		jt.update(sql,ui.getUserName(),ui.getUserSex(),ui.getUserAge(),ui.getUserAddress(),ui.getUserId());
	}
	
	public UserInfo findById(int userId){
		String sql = "select * from userinfo where userid="+userId;
		return jt.queryForObject(sql, new RowMapperImpl());
	}
	public List<UserInfo> findAll(){
		String sql = "select * from userinfo";
		return jt.query(sql, new RowMapperImpl());
	}
}

class RowMapperImpl implements RowMapper<UserInfo> {
	public UserInfo mapRow(ResultSet rs, int index) throws SQLException {
		UserInfo ui = new UserInfo();
		ui.setUserId(rs.getInt(1));
		ui.setUserName(rs.getString(2));
		ui.setUserSex(rs.getString(3).trim());
		ui.setUserAge(rs.getInt(4));
		ui.setUserAddress(rs.getString(5));
		return ui;
	}
}

