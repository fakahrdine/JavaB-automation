package com.syntax.class08;

public class Task5 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a program that reads a range of integers (start and end point), 
//		provided by a user and then from that range prints the sum of the even and odd integers.
		int Sumadd = 0;
		int sumeven = 0;
		 
		for(int num = 1; num<=50;num++) {
			if(num%2==0) {
				Sumadd=Sumadd+num;
			}else {
				sumeven=sumeven+num;
			}
		}
			System.out.println(Sumadd+" Total even");
			System.out.println(sumeven+" total Add");
		
		
		
			}
	
}
