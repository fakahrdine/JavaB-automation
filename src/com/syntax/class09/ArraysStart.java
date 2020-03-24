package com.syntax.class09;

public class ArraysStart {

	public static void main(String[] args) {
//declare an array and initialixe it and 
		int intArray[]=new int[5];
		intArray[0]=25;
		intArray[1]=14;
		intArray[2]=263;
		intArray[3]=89;
		intArray[4]=45;
		System.out.println(intArray[3]);
		System.out.println("------------------------------------------------------------");
		String [] inClassS =new String[5];
		inClassS[1]="hichen";
		inClassS[2]="mohamed";
		inClassS[3]="ahmed";
		inClassS[4]="nora";
		inClassS[5]="Noh";//java.lang.ArrayIndexOutOfBoundsException
		System.out.println(inClassS[5]);
		
		
		
	}

}
