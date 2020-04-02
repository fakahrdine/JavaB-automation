package com.syntax.class18;

public class ConstractorDemo {
	static String str="Virginia";
	public ConstractorDemo() {//no par//
		System.out.println("I am non argument Constructors");
		System.out.println(" I am your constractor");
	}
	public ConstractorDemo(String str) {
		
		System.out.println("Today i will travel to california"+str);
		
	}
	ConstractorDemo(int age){
		System.out.println("My age is "+age);	
	}
	ConstractorDemo(String name, int grade){
		
		System.out.println("My name is "+name+" I got "+grade);
	}

	
	
public static void main(String[] args) {
	// the object is created it needs someone to refer to it
	ConstractorDemo obj= new ConstractorDemo();
	ConstractorDemo obj1= new ConstractorDemo(" and hi gys my name is parametrize constracto");
	ConstractorDemo obj3= new ConstractorDemo(26);
	ConstractorDemo obj4= new ConstractorDemo("Mohamed",94);

}
}
