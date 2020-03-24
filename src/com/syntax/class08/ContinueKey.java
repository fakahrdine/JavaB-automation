package com.syntax.class08;

public class ContinueKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<21;i++) {
			if(i==5 || i==7 || i==8) {
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("_____________________________________________>>>>>>>>-");
		for(int i = 1;i<=100;i++) {
			if(i>=35 && i<=55) {
				continue;
			}
			System.out.println(i);
			
			
		}

	}

}
