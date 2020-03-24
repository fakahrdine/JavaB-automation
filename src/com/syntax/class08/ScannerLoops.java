package com.syntax.class08;

import java.util.Scanner;

public class ScannerLoops {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	int total;
	for(int n=1;n<=100;n++) {
		System.out.println("enter a number");
		n=scan.nextInt();
		if(n<=-1) {
			System.out.println("Stop");
		}
		
		
	}
	
	
}
}
