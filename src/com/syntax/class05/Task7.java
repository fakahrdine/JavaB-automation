package com.syntax.class05;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("Please provide the three numbres");
int num1=input.nextInt();
int num2=input.nextInt();
int num3=input.nextInt();
int largest;
if(num1>num2) {
	if(num1>num3) {
		largest = num1;	
	}else {
		largest=num3;
	}
}else {
	if(num2>num3) {
		largest =num2;
	}else {
		largest=num3;
	}
}
	System.out.println("the largeest number is "+largest);	
		
		
	}

}
