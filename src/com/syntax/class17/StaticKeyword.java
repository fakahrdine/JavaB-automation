package com.syntax.class17;

public class StaticKeyword {
	String color ;
	int memory;
	static String phoneBrand;
	static boolean touchScreen;
	
	static void phoneDisplay() {
		
		System.out.println("we are building "+phoneBrand+" with toushscreen : "+touchScreen);
	}
	void displaySpecification() {
		
		System.out.println("We build "+phoneBrand+" with "+memory+" GB memory in "+color+" color");
		
	}
	
	public static void main(String[] args) {
		StaticKeyword obj =new StaticKeyword();
		phoneBrand="iphone XR";
		touchScreen=true;
		obj.color="Black";
		obj.memory=128;
		phoneDisplay();
		// accessing static methods in static way
		obj.displaySpecification();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}

