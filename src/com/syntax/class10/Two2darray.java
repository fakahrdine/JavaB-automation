package com.syntax.class10;

public class Two2darray {
	public static void main(String[] args) {
		// retreiving values from two arrays
		String[][] month= {
				{"january","lfabruary","december","Hi","Hello"},
				{"March","April","May"},
				{"june","july","August","Monkey"},
				{"September","October"},
		};
		int row =month.length;// how many arrays)(4)
		int farray =month[2].length;
		System.out.println(farray);
		// to retrive all values from the 2darray we use nestedforloop
		for(int i =0;i<month.length;i++) {// iterate over rows
		for (int j=0; j<month[i].length;j++) {// iterate over column
			System.out.print(month[i][j]+" ");
		}
			
			
			
		}
		
	}

}
