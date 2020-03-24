package com.syntax.classReview;

public class More2darrays {

	public static void main(String[] args) {
  String [][] professions= {
{"qa","Devolopers","product owener","Scrum Master"}  ,
{"math teachers","Science Teshers","Esl teachers"},
{"dentist","Surgeon"}
  };
 int jobnum =0;
      for(String [] ocuupation:professions ) {
    	for(String jobs :ocuupation)  {
    		System.out.print(jobs+" ");
    		jobnum++;
    	}
    	System.out.println();  
      }
      //lets print how mANY JOBS WE HAVE to do the we use increment operation inside our loop
      System.out.println("totale= "+jobnum);
	}

}
