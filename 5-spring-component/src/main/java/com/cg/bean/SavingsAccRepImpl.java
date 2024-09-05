package com.cg.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("data.properties")
public class SavingsAccRepImpl  implements AccountRep{
	@Value("${ename}")//sPEL
	private String name;
	
	public SavingsAccRepImpl() {
		System.out.println("SavingsAcc initialized");
	}
	public String credit(float amt) {
		return "Hi "+name+" the amount of "+amt+" credited in ur salary acc";
	}
}
