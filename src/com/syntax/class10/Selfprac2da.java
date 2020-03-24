package com.syntax.class10;

public class Selfprac2da {
public static void main(String[] args) {
	int[][] tablnam= {{15,78,12,77,96,100,200,231,45},
	                 {100,88,17,45,200,78,12,8000},
                	{45,12,45,89,300,700,1000,65,74},
	                {78,33,30000,900,50,80,90},
	};
	
	int siz=tablnam.length;
	System.out.println(siz);		
	System.out.println(tablnam[0][0]);
	int siz0=tablnam[0].length;
	System.out.println(siz0);
	//System.out.println(tablnam[0]);
	for(int i=0;i<siz;i++) {
		for(int b=0 ;b<tablnam[i].length;b++) {
			System.out.print(tablnam[i][b]+" ");
			
		}
	}			
		for(int[] table :tablnam) {
			System.out.println(table);
			
		}
}
}

