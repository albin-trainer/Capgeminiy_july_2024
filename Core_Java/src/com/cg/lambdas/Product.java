package com.cg.lambdas;
public class Product implements Comparable<Product> {
private int prodId;
private String prodName;
private float price;
private float ratings;
public Product() {
	// TODO Auto-generated constructor stub
}
public Product(int prodId, String prodName, float price, float ratings) {
	super();
	this.prodId = prodId;
	this.prodName = prodName;
	this.price = price;
	this.ratings = ratings;
}
public String toString() {
	return "Product [prodId=" + prodId + ", prodName=" + prodName + ", price=" + price + ", ratings=" + ratings + "]";
}
public int compareTo(Product p) {
	if(this.price<p.price)
		return -1;
	return 1;
}
public int getProdId() {
	return prodId;
}
public void setProdId(int prodId) {
	this.prodId = prodId;
}
public String getProdName() {
	return prodName;
}
public void setProdName(String prodName) {
	this.prodName = prodName;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public float getRatings() {
	return ratings;
}
public void setRatings(float ratings) {
	this.ratings = ratings;
}


}
