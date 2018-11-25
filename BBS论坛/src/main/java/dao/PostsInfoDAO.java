package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.PostsInfo;
import db.DBManager;
import util.DateUtil;

public class PostsInfoDAO {

	private Connection conn = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	
	public void addPost(PostsInfo pi){
		String sql = "insert into posts values(null,?,?,?,?,?,default,default)";
		conn = DBManager.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, pi.getPostTitle());
			ps.setString(2, pi.getPostContent());
			ps.setString(3, DateUtil.getNowDate());
			ps.setInt(4, pi.getUi().getUserid());
			ps.setInt(5, pi.getBi().getBlockId());
			ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public List<PostsInfo> findPostsByBlocksId(int blocksId){
		List<PostsInfo> list = new ArrayList<PostsInfo>();
		
		String sql = "select * from posts where blockid=?";
		conn = DBManager.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, blocksId);
			rs = ps.executeQuery();
			while(rs.next()){
				PostsInfo pi = new PostsInfo();
				pi.setPostId(rs.getInt(1));
				pi.setPostTitle(rs.getString(2));
				pi.setPostContent(rs.getString(3));
				pi.setPostDate(rs.getString(4));
				//还需要加入用户和版块
				list.add(pi);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return list;
	}
	
}
