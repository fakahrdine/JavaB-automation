package com.syntax.class08;

public class TAsk2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a programme to calculate sum of odds and the sum of even numbers 
		// 1-----99
		int totalev = 0;
		int totaladd = 0;
		for (int x=1; x<=99; x++) {
			if(x%2==0) {
				totalev=totalev+x;
			}else {
				totaladd=totaladd+x;
			}
				//System.out.println(x);
			}
		System.out.println("the final  total of even N is "+totalev);
		System.out.println("the final  total of even N is "+totaladd);
		
		}

	}


