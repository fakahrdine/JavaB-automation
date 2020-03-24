package com.syntax.class05;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Write a program for user to enter his/hers birth month. Based on the month
		 * define the season. Example: if user is born in June, July or August → season
		 * =“Summer”. At the end of the program we should see output as “You were born
		 * ______“. Write a program for user to enter his/hers birth month. Based on the
		 * month define the season. Example: if user is born in June, July or August →
		 * season =“Summer”. At the end of the program we should see output as “You were
		 * born ______“
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the month you born in");
		String Month = scan.nextLine();
		String season;

		if (Month.equals("Decembre") || Month.equals("Junaury") || Month.equals("Fabruary")) {

			season = "Winter";
		} else if (Month.equals("March") || Month.equals("April") || Month.equals("May")) {

			season = "spring";
		} else if (Month.equals("june") || Month.equals("july") || Month.equals("august")) {
			season = "summer";

		} else if (Month.equals("sep") || Month.equals("octobre") || Month.equals("novembre")) {
			season = "Full";

		} else {
			season = "invalid";

		}
		System.out.println("you were born in the " + season);

	}

}
