package com.cg.lambdas;
public class LambaExpEx1 {
public static void main(String[] args) {
	Greeting w1=new BirthdayWishes();
	w1.wish("Arun");
	Greeting myGreeting= (String name)-> {
		return "Hi "+name+" hello.... hv good lunch";
	};
	myGreeting.wish("All");
	
	publishWish(w1, "Dileep");
	Greeting w2=(String n)->{return "Hi "+n+" Happy adv Bday wishes";};
	publishWish(w2, "Badri");
	Greeting w3=n->"Hello "+n+" Good morning";
	publishWish(w3, "All ");
	publishWish(n->"Hello "+n+" Good morning", "Java EE batch");
}
//assume this method publish in social media
static void publishWish(Greeting g,String name) {
	System.out.println(g.wish(name));
}
}
class BirthdayWishes implements Greeting{
	public String wish(String name) {
		return "Hi "+name+" Happy adv Bday wishes";
	}
}
interface Greeting {
String wish(String name);
}
