package com.syntax.class18;

//Write a program  that will have 4 different access levels of constructors
//and create 3 objects of this class: 1 - inside same class; 2 - from outside the class; 
//3 - from different class inside different package  and observe result.

public class Task3 {

   public Task3() {
	   System.out.println(" iam public constractor");
   }
		
	
  Task3(){
	  System.out.println("iam default constractor");
  }
  
  
public static void main(String[] args) {
	Task3 obj =new Task3();
	
}





}

