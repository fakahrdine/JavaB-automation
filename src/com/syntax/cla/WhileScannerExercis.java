package com.syntax.cla

import java.util.Scanner;

public class WhileScannerExercis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);		
		int numx = 0;
		while(numx<=20) {
		System.out.println("please enter a number from 1 to 20");
		numx=scan.nextInt();
		if(numx==17) {
			System.out.println("congrats");
			break;
		}
		
		}
	}

}
