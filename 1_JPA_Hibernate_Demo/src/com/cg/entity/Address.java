package com.cg.entity;
import javax.persistence.Embeddable;
@Embeddable
public class Address {
private String doorNo;
private String placeName;
public String getDoorNo() {
	return doorNo;
}
public void setDoorNo(String doorNo) {
	this.doorNo = doorNo;
}
public String getPlaceName() {
	return placeName;
}
public void setPlaceName(String placeName) {
	this.placeName = placeName;
}

}
