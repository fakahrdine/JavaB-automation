package com.syntax.class04;

import java.util.Scanner;

public class JavaReview {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your age");
		int age = input.nextInt();
		// FSystem.out.println("Please enter yout gender");
		// String gender =input.nextLine();

		if (age > 25) {

			System.out.println("Please enter your gender");
			String gender = input.next();
			if (gender == "F") {

				System.out.println("Woman");
			} else {
				System.out.println("Man");
			}
		} else if (age < 25) {
			System.out.println("Please enter your gender");
			String gender = input.next();
			if (gender == "F") {
				System.out.println("Girl");
			} else {
				System.out.println("Boy");
			}
		}
	}
}