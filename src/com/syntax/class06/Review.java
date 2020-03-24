package com.syntax.class06;

import java.util.Scanner;

public class Review {
	    public static void main(String []args){
	        Scanner scan = new Scanner(System.in);
	        int mark=0;
       String grade=null;
	    System.out.println("Please enter your mark");
	    mark=scan.nextInt();
	    if(mark>=1 && mark<=25){
	    grade="F";
	    }else if(mark>=25 && mark>=45){
	        grade="E";    
	    }else if(mark>=45 && mark<=50){
	        grade="D";
	    }else if(mark>=50 && mark<=60){
	        grade="C";
	    }else if(mark>=60 && mark<=80){
	        grade="B";
	    }else if(mark>=81){
	        grade="A";
	    }else{
	        grade="please enter valid mark";
	        System.out.println(grade);
	    }
	    if (!grade.equals("please enter valid mark")){
	      System.out.println("Your grade is "+grade);
	    }
	    
	    }
	    
	    }
	
	
	


