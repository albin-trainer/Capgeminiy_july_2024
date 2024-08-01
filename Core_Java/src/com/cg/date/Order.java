package com.cg.date;
import java.time.LocalDate;
public class Order {
private int orderId;
private String prodName;
private LocalDate orderDate;
public Order() {
	// TODO Auto-generated constructor stub
}
public Order(int orderId, String prodName, LocalDate orderDate) {
	super();
	this.orderId = orderId;
	this.prodName = prodName;
	this.orderDate = orderDate;
}

public int getOrderId() {
	return orderId;
}
public void setOrderId(int orderId) {
	this.orderId = orderId;
}
public String getProdName() {
	return prodName;
}
public void setProdName(String prodName) {
	this.prodName = prodName;
}
public LocalDate getOrderDate() {
	return orderDate;
}
public void setOrderDate(LocalDate orderDate) {
	this.orderDate = orderDate;
}

}
