package com.syntax.class06;

import java.util.Scanner;

public class AnoSwichSca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan ;
		char gender;
		String genderTypes;
		
		scan=new Scanner(System.in);
		System.out.println("please enter your gender");
		gender =scan.next().charAt(0);
		switch (gender) {
		case 'M':
			genderTypes="Male";
			break;
		case 'F':
			genderTypes="Female";
			break;
			default:
				genderTypes="unknownE";
		}
		System.out.println("your gender is "+genderTypes);
		
		
		
		
		
		
		

	}

}
