package com.cg.threads;
public class MultithreadsDemo1 {
public static void main(String[] args) {
	System.out.println("Main thread started .....");
	MyTask task=new MyTask();
	Thread t=new Thread(task);//NEW Thread
	t.start();//Runnable state
	//Cant predict.....
	for(int i=1;i<=1000;i++) {
		System.out.println("Main :"+i);
	}
	System.out.println("Main threads finishes the task");
}
}
class MyTask implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=1000;i++) {
			System.out.println("Child :"+i);
		}
		System.out.println("Child Thread started....");
	}
	
}
