package com.syntax.class05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Prompt the user to enter person heights in inches. Person should be
		 * classified as one of the following: short (under 60 inch) medium(between 60-
		 *   72inch) tall (over 72 inch
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("please enter your heights");
		int heights =input.nextInt();
		if(heights>1 && heights<60) {
			System.out.println("your short");
		}else if(heights>60 && heights<72) {
			System.out.println("you are medium");}
			else if (heights>72) {
				System.out.println("you are tall");
			}else {
				System.out.println("invalid");
			}
			
		}

	}


