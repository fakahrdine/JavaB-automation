package com.syntax.class06;

import java.util.Scanner;

public class ComparetreeN {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the following numbers");
		int num1 = input.nextInt();// 10
		int num2 = input.nextInt();// 20
		int num3 = input.nextInt();// 30
		int biggist;
		if (num1 > num2) {// if it true
			if (num1 > num3) {
				biggist = num1;
			} else {
				biggist = num3;
			}
		} else {
			if (num2 > num3) {
				biggist = num2;
			} else {
				biggist = num3;
			}

		}
		System.out.println("the biggist num is "+biggist);

	}

}
