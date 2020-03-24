package com.syntax.class11;

public class Morestring {

	public static void main(String[] args) {
		String str1="Lemon is my favorit fruit.";
		String str2="Lemon";
	boolean fru =	str1.equalsIgnoreCase(str2);

	System.out.println(fru);
		
	boolean contains =str1.contains("lets");
	System.out.println(contains);
	
	String wordstar ="";
	boolean start = wordstar.startsWith("touch");
	System.out.println(start);
	boolean ends = wordstar.endsWith("floor");
	System.out.println(ends);
	boolean empty = wordstar.isEmpty();
	System.out.println(empty);
	String home ="";
	boolean empty1 =home.isEmpty();
	System.out.println("Empty is :"+empty1);
	String R =" Hi Iam moving to new york.   ";
	R=R.concat(" TOMOROW");
	System.out.println(R);
	String T=R.trim();
	System.out.println(T);
	// char chatAt(int index);
	String people ="this is the best time ever";
		char index =people.charAt(6);
	
	System.out.println("the letter of index 6 is: "+index);
	System.out.println("____________________________indexof_________________________________________");
	String Str = new String("Welcome on Board"); 
	String SubStr1 = new String("Tutorials");
	String SubStr2 = new String("Sutorials");
	System.out.print("Found Index :" );
	System.out.println(Str.indexOf( 'o' ));
	System.out.print("Found Index :" ); 
	System.out.println( Str.indexOf( SubStr1 )); 
	System.out.print("Found Index :" );
	System.out.println(Str.indexOf( SubStr2 )); 
	
	
	
	
	}

}
