package com.syntax.class08;

import java.util.Scanner;

public class Taskdoself {

	public static void main(String[] args) {
//		Write a program that reads a range of integers (start and end point), 
//		provided by a user and then from that range prints the sum of the even and odd integers.
		Scanner scan=new Scanner(System.in);
		int addtotal = 0;
		int eventotal = 0;
		System.out.println("Please enter arange of numbers");
		int min =scan.nextInt();
		int max =scan.nextInt();
		
		for(long i=min;i<=max;i++) {
			
			if(i%2==0) {
		eventotal=eventotal+i;
			}else {
				addtotal=addtotal+i;
			}
			System.out.println(i);
		}

System.out.println(addtotal+" "+eventotal);
	}

}
