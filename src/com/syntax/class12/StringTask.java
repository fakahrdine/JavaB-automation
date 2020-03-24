package com.syntax.class12;

public class StringTask {

	public static void main(String[] args) {
		String san=" hi my name is mohamed i am from california";
		
		 String[]  spaces=san.split(" ");
	for(String word:spaces ) {
		System.out.print(word);
	}
	System.out.println();
	String Combi="hjshh%#@(122sjnnjs78snjsnsnsksss";
String letters=	Combi.replaceAll("[^a-z]", " ");
	//System.out.println(Combi.length());
	
int leternum=letters.length();
System.out.println(leternum);
	}

}
