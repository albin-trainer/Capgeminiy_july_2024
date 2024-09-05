package com.cg.dto.request;

public class ReviewDto {
private String comments;
private String userName;
private float ratings;
private int  productId;

public String getComments() {
	return comments;
}
public void setComments(String comments) {
	this.comments = comments;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public float getRatings() {
	return ratings;
}
public void setRatings(float ratings) {
	this.ratings = ratings;
}
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}

}
