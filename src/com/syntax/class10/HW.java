package com.syntax.class10;

public class HW {

	public static void main(String[] args) {
////Create an array of chars and store grades into it:
//		A,B,C,D,E,F. 
//		Then print a grade B (use 2 different ways of creating an array).
		
		char[] grades=new char[6];
		grades[0]='A';
		grades[1]='B';
		grades[2]='C';
		grades[3]='D';
		grades[4]='E';
		grades[5]='F';
		System.out.println(grades[4]);
		char[]gradess= {'a','b','c','d','e','f'};
		System.out.println(gradess[3]);
		System.out.println("_____________________HW2_______________________________________________");
		
		String []groupnames= {"Mohamed","Husham ","Mark","kerim","Samoel","Antony","Raihan","Ozkan"};
		System.out.println(groupnames[1]);
		System.out.println("_____________________HW3_______________________________________________");
//		Create an array of words: Java, Saturday, day, coding, is. 
	//	Print the following sentence using elements of array: “Saturday is Java coding Day”.
		String []words= {"Java","Saturday","day","coding","is"};
		System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);

System.out.println(words.length);

	}

}
