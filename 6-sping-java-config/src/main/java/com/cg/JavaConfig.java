package com.cg;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.cg.bean.AccountServiceImpl;
import com.cg.bean.SavingsAccRepImpl;
//replacement of beans.xml
@Configuration
@ComponentScan(basePackages = "com.cg")
public class JavaConfig {
	@Bean("service")
	public AccountServiceImpl getAccService() {
		return new AccountServiceImpl();
	}
	
}
