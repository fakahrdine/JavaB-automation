package com.syntax.class14;

public class Methodsexam {
	void greete(String name) {
		
		System.out.println("hello "+name);	
	}
	public static void main(String[] args) {
		// how we can execute ^^emthod greete/
		// to exucute this method first I need to create an instance or object of classType the  Template classe
		//then througth that object I can call my methods  which live inside class 
    Methodsexam	ins =new Methodsexam();
		
		ins.greete("Hamid");
		ins.greete("Ramoi");
		ins.greete("Samar");
		ins.greete("Ali");
		// q:When we pass a value to a variable in mthods para
		// does that variable hold deffrent values in the same time
		
		
		
		
		
		
		
	}

	

}
