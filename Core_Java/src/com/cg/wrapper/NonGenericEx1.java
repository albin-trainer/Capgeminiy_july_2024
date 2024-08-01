package com.cg.wrapper;
public class NonGenericEx1 {
public static void main(String[] args) {
	Data1 data= new Data1();
	data.setObj("Hello");
	
	Data1 data2=new Data1();
	data2.setObj(99);
	
	String s=(String)data.getObj();
	System.out.println(s);
	int x=(Integer)data.getObj();
	System.out.println(x);
}
}
class Data1{
	private Object obj;

	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	
	
	
}
