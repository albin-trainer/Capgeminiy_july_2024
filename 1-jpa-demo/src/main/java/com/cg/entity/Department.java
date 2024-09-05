package com.cg.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Department {
	@Id
private int deptId;
private String departmentName;
public int getDeptId() {
	return deptId;
}
public void setDeptId(int deptId) {
	this.deptId = deptId;
}
public String getDepartmentName() {
	return departmentName;
}
public void setDepartmentName(String departmentName) {
	this.departmentName = departmentName;
}

}
