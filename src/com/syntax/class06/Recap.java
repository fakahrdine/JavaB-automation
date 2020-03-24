package com.syntax.class06;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * if hour between 1 -11--->Morning if hour between 12 -25--->afternon if hour
		 * berween 16-20--->evening if hours between 21-24 ----> night
		 */
		int hour = -4;
		String Timepfday;
		if (hour >= 1 && hour <= 11) {
			Timepfday = "Morning";
		} else if (hour >= 12 && hour <= 15) {
			Timepfday = "afternoon";
		} else if (hour >= 16 && hour <= 20) {
			Timepfday = "everning";
		} else if (hour >= 21 && hour <= 24) {
			Timepfday = "night";
		} else {
			Timepfday = "Invalidtime";
		}
		if (!Timepfday.equals("Invalidtime")) {

			System.out.println("the time of the day is " + Timepfday);

		}

	}
}
