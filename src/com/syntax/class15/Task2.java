package com.syntax.class15;

public class Task2 {
	
	void addeven(int num) {
		if(num%2==0) {
			System.out.println(num+" is even");
		}else {
			System.out.println(num+" is add");
		}
		
	}
	public static void main(String[] args) {
		Task2 numk =new Task2();
		numk.addeven(20);
	}

}
