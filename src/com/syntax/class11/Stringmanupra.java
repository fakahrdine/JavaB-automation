package com.syntax.class11;

public class Stringmanupra {

	public static void main(String[] args) {
		String str ="Dmv trainning center";
		System.out.print("Lets print the the index N of letter c ");
		System.out.println(str.indexOf('c'));
		
		
		
	
		String hap = new String ("Welcome to Moroccoguys");
		System.out.println("Now we gonna print the substring of");
		String subsrtr = hap.substring(4,10);
		System.out.println(subsrtr);
		
		// rlplace a old carcter with a new one 
		String old ="Hi body I send you the old mattress";
		String New =old.replace('H', 'C');
		System.out.println(New);
		
		// replace all methodes
		String mix="12345&&5$#?lkjDFLK+@1!";
		System.out.println(mix.replaceAll("[A-Za-z0-9]","/"));
		
		// lets printout how many words are inthe String and print it out
		String nice ="hi body nice to meet you today were you been";
		String [] words=nice.split(" ");
		System.out.println(words.length);
		for(int x=0;x<words.length;x++) {
			System.out.print(words[x]);
			
		}
		
		
		
		
		
		
	}
	
	

}
