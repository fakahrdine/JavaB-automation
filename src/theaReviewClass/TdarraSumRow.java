package theaReviewClass;

public class TdarraSumRow {

	public static void main(String[] args) {
		int [][] pool = {
				{15,46,78,111,333,88,56,700,12},		
				{1000,45,0,23,600,222,89,700,1000},
				{400,8000,89,77,10,26,45},
				{800,200,300,19,11,},		
		          };
	   int[] total = new int[pool.length];
	   for(int x=0;x<pool.length;x++) {
		   for(int c=0;c<pool[x].length;c++) {
			int data=pool[x][c];
			total[x]+=data;
		   }
		   }
		   for(int n=0;n<total.;n++) {
			   System.out.println("The sum is"+total[n]);
		   }
		  
		
	}

	}

