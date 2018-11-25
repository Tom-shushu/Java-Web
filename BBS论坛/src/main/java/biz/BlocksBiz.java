package biz;

import java.util.List;

import bean.BlocksInfo;
import dao.BlocksInfoDAO;

public class BlocksBiz {

	private BlocksInfoDAO bidao = new BlocksInfoDAO();
	
	public List<BlocksInfo> findAllBlocks(){
		return bidao.findAllBlocks();
	}
}
