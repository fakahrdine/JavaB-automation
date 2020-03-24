package com.syntax.class05;

import java.util.Scanner;

public class Task4 {

	
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				/*
				 * Write a program that will read three inputs of scores 
				 * (quiz, mid term, and final scores) and determine the grade based on the following rules: 
		          if the average score >=90 → grade=A
		        if the average score >= 70 and <90 → grade=B
		        if the average score>=50 and <70 → grade=C
		            if the average score<50 → grade=F
				 */
					int quizscore;
					int midtermS;
					int Fscore;
				Scanner input =new Scanner(System.in);
				System.out.println("Please wnter your quiz score");
				quizscore =input.nextInt();
				System.out.println("please enter your midterms score");
				midtermS =input.nextInt();
				System.out.println("please enter your final score");
			    Fscore =input.nextInt();
			    
			    
			    int average =(quizscore+midtermS+Fscore)/3;
			    
				if(average>=90) {
			    	average =(quizscore+midtermS+Fscore)/3;
			    	System.out.println("you got "+average+"so your grade is A");
				} 
			    else if(average >=70 && average <90 ) {
			    	average =(quizscore+midtermS+Fscore)/3;
			    	System.out.println("you got "+average+"so your grade is B");
			    }else if(average>=50 && average <70 ){
			    	average =(quizscore+midtermS+Fscore)/3;
			    	System.out.println("you got "+average+"so your grade is C"); 	
			    }else if(average <50){
			    	average =(quizscore+midtermS+Fscore)/3;
			    	System.out.println("you got "+average+"so your grade is ");

			    }
			    }
				
			    	
			    }
			    
		
		
		
	


