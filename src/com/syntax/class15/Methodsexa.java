package com.syntax.class15;

public class Methodsexa {
	
	void sayWelcome() {
		
		for(int n=0;n<=10;n++ ) {
			System.out.println("Hello");
		}	
	}
	void SayHello(String word,int times) {
		for(int x=0;x<=times;x++) {
			System.out.println(word);
		}
		
		
	}
   void isRainnig(boolean isRaining) {
	   if(isRaining) {
		   System.out.println("Stay home and learn java");
	   }else {
		   System.out.println("Go for a walk");
	   }
	   
   }
   
	
	public static void main(String[] args) {
		Methodsexa obj =new Methodsexa();
		obj.sayWelcome();
		obj.SayHello("Mohamed", 5);
		obj.isRainnig(false);
	}

}
