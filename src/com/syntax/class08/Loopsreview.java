package com.syntax.class08;

import java.util.Scanner;

public class Loopsreview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * ask a user to pay for a candy
 * as long as the entered price is not 2
 * we need keep ask for paying 
 * One amount is correct ___"enjoy your candy"
 */
		Scanner input;
		double price = 0 ;
//		
	input=new Scanner(System.in);
//		do {
//			System.out.println("Please pay for a candy");
//			price =input.nextDouble();
//		}while(price !=2);
//		System.out.println("Enjoy your candy");
//		
		while(price !=2) {
			System.out.println("please pay for the candy");
			price=input.nextDouble();
		}System.out.println("Enjoy your candy");
		
	}

}
