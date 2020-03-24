package com.syntax.class09;

public class Recap {
	public static void main(String[] args) {
		for (int H = 0; H <= 23; H++) {

			for (int M = 0; M <= 59; M++) {
				if (M < 10) {
					System.out.println(H + ":0" + M);
				} else {
					System.out.println(H + ":" + M);

				}
			}

		}

	}

}
