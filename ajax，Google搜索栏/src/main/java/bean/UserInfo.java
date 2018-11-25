package bean;

public class UserInfo {

	private String userId;
	private String userName;
	private String userAge;
	private String userAddress;
	public UserInfo() {
		// TODO Auto-generated constructor stub
	}
	public UserInfo(String userId, String userName, String userAge, String userAddress) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAge = userAge;
		this.userAddress = userAddress;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAge() {
		return userAge;
	}
	public void setUserAge(String userAge) {
		this.userAge = userAge;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	@Override
	public String toString() {
		return "UserInfo [userId=" + userId + ", userName=" + userName + ", userAge=" + userAge + ", userAddress="
				+ userAddress + "]";
	}
}
