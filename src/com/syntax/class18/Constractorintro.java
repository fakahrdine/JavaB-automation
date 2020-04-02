package com.syntax.class18;

public class Constractorintro {
	
	
	
public Constractorintro() {
	// Constractor accept only name of tha class
	System.out.println("I am a constractor");
}
void hello() {
	System.out.println("Hello class");
}
	
	 
	
	
	public static void main(String[] args) {
		Constractorintro con =new Constractorintro();
// calls of your constracto happen when a object of class created
		
		System.out.println("Code after Constarctor");
		con.hello();
		
	} 
}

