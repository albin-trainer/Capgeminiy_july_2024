package com.cg;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.bean.GreetingBean;
public class Main {
	public static void main(String[] args) {
ApplicationContext ctx=
new ClassPathXmlApplicationContext("beans.xml");
System.out.println("Spring container initialized");

GreetingBean bean=(GreetingBean) ctx.getBean("g1");
System.out.println(bean.wish("Sanjay"));

GreetingBean bean2=(GreetingBean) ctx.getBean("g1");
System.out.println(bean==bean2);//comparing memory 

	}
}
