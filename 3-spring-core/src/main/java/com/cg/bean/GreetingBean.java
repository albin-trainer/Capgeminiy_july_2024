package com.cg.bean;
public class GreetingBean {
private String msg;
public GreetingBean(String msg,int x) {
	System.out.println("constructor of Greeting Bean");
	this.msg=msg;
	System.out.println(x);
}
public void setMsg(String msg) {
	this.msg = msg;
	System.out.println("setter....");
}
public String wish(String name) {
	return "Hi "+name+" "+msg;
}

}
