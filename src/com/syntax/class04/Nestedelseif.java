/**
 * 
 */
package com.syntax.class04;


public class Nestedelseif {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*if student completed the quiz we will check for score
		 * if scor .90>>greate job
		 * if score >80>>well done
		 * if score >70 -->you could have done better
		 * 
		 * if student did not completed the quiz ---.> not good
		 * please do your hommework ontime
		 */
		boolean quizcomplet=false ;
		int score=20;
		if(quizcomplet) {
			System.out.println("lets check your your scooor");
			if(score>90) {
				System.out.println("greate job you studied a lot");
			}else if(score>70){
				System.out.println("well done");
			}else if (score>70) {
				System.out.println("you could have done better");
			}else {
				System.out.println("you failed");
			}
			
			
			
			
		}else {
			System.out.println("please do your homework on time");
		}
		
	}

}
