package bean;

public class PostsInfo {
	private Integer postId;
	private String postTitle;
	private String postContent;
	private String postDate;
	// 多对一关系
	private UsersInfo ui;
	private BlocksInfo bi;
	private Integer postlv;
	private Integer postState;

	public PostsInfo() {
	}

	public Integer getPostId() {
		return postId;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
	}

	public String getPostTitle() {
		return postTitle;
	}

	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}

	public String getPostContent() {
		return postContent;
	}

	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}

	public String getPostDate() {
		return postDate;
	}

	public void setPostDate(String postDate) {
		this.postDate = postDate;
	}

	public UsersInfo getUi() {
		return ui;
	}

	public void setUi(UsersInfo ui) {
		this.ui = ui;
	}

	public BlocksInfo getBi() {
		return bi;
	}

	public void setBi(BlocksInfo bi) {
		this.bi = bi;
	}

	public Integer getPostlv() {
		return postlv;
	}

	public void setPostlv(Integer postlv) {
		this.postlv = postlv;
	}

	public Integer getPostState() {
		return postState;
	}

	public void setPostState(Integer postState) {
		this.postState = postState;
	}

}
