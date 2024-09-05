package com.cg.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class AccountServiceImpl
implements AccountService {
	@Autowired
 private AccountRep accRep;
 public AccountServiceImpl() {
	 System.out.println("Acc Service initialized");
}
 //@Autowired
/*	public void setAccRep(AccountRep accRep) {
		System.out.println("setter ...");
	this.accRep = accRep;
}*/
	public String creditService(float amt) {
		String msg=accRep.credit(amt);
		return msg;
	}

}