package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


import bean.BlocksInfo;
import db.DBManager;

public class BlocksInfoDAO {

	private Connection conn = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	
	public List<BlocksInfo> findAllBlocks(){
		List<BlocksInfo> list = new ArrayList<BlocksInfo>();
		
		String sql = "select * from blocks";
		conn =DBManager.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				BlocksInfo bi = new BlocksInfo();
				bi.setBlockId(rs.getInt(1));
				bi.setBlockName(rs.getString(2));
				bi.setBlockState(rs.getInt(3));
				list.add(bi);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
		return list;
	}
	
}
