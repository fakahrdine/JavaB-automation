package com.syntax.class06;

public class Male {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f = 75.0f;
		double d = 75.0;
		int i = 75;

		if( f == d ) {
		   if( f == i ) {
		      System.out.println("f, d and i are equal");
		    } else {
		      System.out.println("f, d are equal but i is not equal");
		    }

		} else {
		    System.out.println("f and d are not equal");
		}
		
		
		 float fl = 5.3f;
		   if (fl == 5.3) {
		      System.out.println("Both are equal");
		   } else {
		      System.out.println("Both are not equal");
		   }
		
		
		   int a = 7 * 3 + 6 / 2 - 5;
	        int b = 21 - 8 + a % 3 * 11;

	            if(a < b) {
	                 System.out.println("A is less than B");
	             }

	            if(a = b) {

	                 System.out.println("A is equal to B");
	            }

	           if(a > b) {
	                 System.out.println("A is greater than B");
	            }
	           
	           boolean a, b, c;
	           a = b = c = true;

	                if( !a || ( b && c ) ) {
	                   System.out.println("If executed");
	                   
	                } else {
	                   System.out.println("else executed");
	                }
	           
	           
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
