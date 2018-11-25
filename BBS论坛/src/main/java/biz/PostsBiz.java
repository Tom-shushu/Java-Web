package biz;

import java.util.List;

import bean.PostsInfo;
import dao.PostsInfoDAO;

public class PostsBiz {

	private PostsInfoDAO pidao = new PostsInfoDAO();

	public void addPost(PostsInfo pi) {
		pidao.addPost(pi);
	}
	public List<PostsInfo> findPostsByBlocksId(int blocksId){
		return pidao.findPostsByBlocksId(blocksId);
	}
}
