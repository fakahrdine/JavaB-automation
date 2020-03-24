package com.syntax.class06;

import java.util.Scanner;

public class repl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner input =new Scanner(System.in);
		  int age = 0;
		  String gender;
		  System.out.println("Please enter your gender?");
		  gender = input.nextLine();
		  //FSystem.out.println("Please enter yout gender");
		  if(gender.equals("F")){
		    System.out.println("Please enter your age");
		      age =input.nextInt();
		    if(age>25){
		      System.out.println("Woman");
		    }else{
		        System.out.println("girl");
		        
		    }
		      
		  }   
		    else if (gender.equals("M")){
		    	 System.out.println("Please enter your age");
			      age =input.nextInt();
		    if (age<25){
		            System.out.println("Boy");
		    }
		        else{
		            System.out.println("Man");
		        }
		      
		  }
		    

		    } 
		}
	

