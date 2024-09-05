package com.cg.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="Bank_Customer")
public class Customer {
	@Id
private int cid;
private String custName;
@Column(name = "balanceAmt")
private float bankBalance;

@ManyToOne
@JoinColumn(name="ifscCode")//optional
private Bank bank;

public int getCid() {
	return cid;
}

public void setCid(int cid) {
	this.cid = cid;
}

public String getCustName() {
	return custName;
}

public void setCustName(String custName) {
	this.custName = custName;
}

public float getBankBalance() {
	return bankBalance;
}

public void setBankBalance(float bankBalance) {
	this.bankBalance = bankBalance;
}

public Bank getBank() {
	return bank;
}

public void setBank(Bank bank) {
	this.bank = bank;
}


}
