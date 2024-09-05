package com.cg.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.JavaConfig;
public class Client {
	public static void main(String[] args) {
   ApplicationContext ctx=
	 new AnnotationConfigApplicationContext(JavaConfig.class);
   System.out.println("Spring ioc container initialized");
	AccountService service=(AccountService) ctx.getBean("service");
	String resp=service.creditService(100000);
	System.out.println(resp);
	}
}
