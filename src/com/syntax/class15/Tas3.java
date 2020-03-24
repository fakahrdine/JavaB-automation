package com.syntax.class15;

public class Tas3 {
	
	void palindrom(String word) {
		String revers = "";
		String[] order =word.split("");
		
		for(int i=order.length-1;i>=0;--i) {
			System.out.println(order[i]);
			revers =order[i];
		}
		if(revers.equalsIgnoreCase(word)) {
			System.out.println(word +" is a palindrom");
		}else {
			System.out.println(word+" not a plindro word");
		
		}
		
	}
	public static void main(String[] args) {
		Tas3 pal =new Tas3();
		pal.palindrom("madam");
	}
	
	
	
	
}