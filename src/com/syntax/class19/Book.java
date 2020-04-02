package com.syntax.class19;
//Write program as a Book class   that will have 2 Constructors. While creating an object make sure:
//Instance variables are being initialized
//Both Constructors are being executed

public class Book {
	String booksub;
	int numbersPage;
	
	Book(){
		
		System.out.println("I am a book");
	}
	Book(String booksub, int numbersPage){
		this.booksub=booksub;
		this.numbersPage=numbersPage;
	
	}
	
	
	

}
