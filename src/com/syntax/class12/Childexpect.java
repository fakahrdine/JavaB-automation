package com.syntax.class12;

import java.util.Scanner;

public class Childexpect {

	public static void main(String[] args) {
//		Write a program that reads two people’s first names and if they expecting boy or girl?
//				Based on the input suggests a name for a baby:
//				Example Output:
//				Mom’s first name? Mary
//				Dad’s first name? Daniel
//				Boy or Girl? boy
//				Suggested baby name: DANRY
//
//				Example Output:
//				Mom’s first name? Mary
//				Dad’s first name? Daniel
//				Boy or Girl? girl
//				Suggested baby name: MAIEL
Scanner input =new Scanner(System.in);
System.out.println("Please enteer parents nmae");
String Mamname = input.nextLine();
String Dasnamr =input.nextLine();
System.out.println("What are you expecting Boy or girl?");

String baby =input.nextLine();
// MString babyname;
int half1 =Mamname.length()/2;
int half2 =Dasnamr.length()/2;


if(baby.equalsIgnoreCase("Boy")) {
	System.out.println(Dasnamr.subSequence(0,half1)+""+Mamname.substring(half2));
	//System.out.println(Mamname.subSequence(half1, 0)+""+Dasnamr.subSequence(0, half2));
}else if(baby.equalsIgnoreCase("Girl")) {
	//babyname=Dasnamr.concat(Mamname);
	//System.out.println(Dasnamr.subSequence(half1, 0)+" "+Mamname.subSequence(0, half2));
	System.out.println(Mamname.subSequence(0,half1)+""+Dasnamr.substring(half2));
}













		
		
		
		
		
		
		
		
	}

}
