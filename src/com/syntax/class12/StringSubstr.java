package com.syntax.class12;

public class StringSubstr {

	public static void main(String[] args) {
		System.out.println("using substring funnctioonnnnn");
String str ="Hi friends did you see khalid today";
int index =str.indexOf("t");
System.out.println(index);
String Sub = str.substring(23);
		
		System.out.println(Sub);
		
		System.out.println("Tasssssssssssssssks1");
		
		String day="Sundays";
	char char1=	day.charAt(5);
	System.out.println(char1);
	int size= day.length();
		char revers;
		for(int i=size-1;i>=0;--i) {
			revers=day.charAt(i);
			System.out.print(revers+",");
		}
		System.out.println("Tasssssssssssssskkkkkkk2");
		String word ="Hello";
		if(word.isEmpty()) {
			System.out.println("The string is empty");
				
		}else if(word.length()>3 && word.length()%2==1){
			System.out.println(word.charAt(day.length()/2));
			
		}else {
			System.out.println("invalid word");
		}
		
		
	}

}
