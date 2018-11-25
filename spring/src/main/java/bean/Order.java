package bean;

public class Order {

	private Integer orderId;
	private String orderContent;
	private UserInfo ui;
	public Order() {
		// TODO Auto-generated constructor stub
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getOrderContent() {
		return orderContent;
	}
	public void setOrderContent(String orderContent) {
		this.orderContent = orderContent;
	}
	public UserInfo getUi() {
		return ui;
	}
	public void setUi(UserInfo ui) {
		this.ui = ui;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderContent=" + orderContent + ", ui=" + ui + "]";
	}
}
