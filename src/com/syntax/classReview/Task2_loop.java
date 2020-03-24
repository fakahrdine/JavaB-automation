package com.syntax.classReview;

public class Task2_loop {
	public static void main(String[] args) {
		// print number from 15 to 35
		// but don't print numbers that are divisible by both 2 and 3, at the same time
		for (int i = 15; i <= 35; i++) {
// first way we can check all numbers devisible by 6 	
			if (i % 6 == 0) {
				continue;
			}
			System.out.println(i);
		}
		for (int i = 15; i <= 35; i++) {
		//2nd way ufsing &&
		if(i%2==0 && i%3==0) {
			continue;
		}
		System.out.println(i);
	}
		//Thirdway usingb ||
		for (int i = 15; i <= 35; i++) {
			if(i%2!=0 || i%3!=2) {
				System.out.println(i);
			}
		}
}
}
rd