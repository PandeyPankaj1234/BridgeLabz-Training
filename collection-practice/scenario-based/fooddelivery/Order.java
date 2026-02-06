package fooddelivery;

public class Order {
	String orderId;
	String orderType;
	int orderQuantity;
	double orderPrice;
	public Order(String orderId, String orderType, int orderQuantity, double orderPrice) {
		this.orderId = orderId;
		this.orderType = orderType;
		this.orderQuantity = orderQuantity;
		this.orderPrice = orderPrice;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public int getOrderQuantity() {
		return orderQuantity;
	}
	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}
	public double getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(double orderPrice) {
		this.orderPrice = orderPrice;
	}
}
