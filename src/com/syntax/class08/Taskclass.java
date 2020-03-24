package com.syntax.class08;

import java.util.Scanner;

public class Taskclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Print numbers from 1 to 50 except those that are divisible by 3
//		Create a program that will be asking user to apply for a credit card 10 times. 
//		As soon you get an “yes” from a user program should stop asking.
//		
//for(int n=1;n<=50;n++) {
//	if(n%3==0) {
//		continue;
//	}
//	System.out.println(n);
//}
Scanner input =new Scanner(System.in);
String apply;
	System.out.println("__________________________________________________________");
	for(int h=1; h<=10;h++) {
		System.out.println("Please apply for credit card");
		apply =input.nextLine();
		if(apply.equals("Yes")) {
			break;
		}
	}
	System.out.println("thank you");

	}		
	

}
