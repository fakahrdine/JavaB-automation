package com.syntax.classReview;

public class Sumevenforloop {

	public static void main(String[] args) {
int tataladd =0, totaleven=0,grandtotal=0;
for(int count =1;count<=50;count++) {
	
	if(count%2==0) {
		totaleven+=count;
	}else {
		tataladd+=count;
	}
}
System.out.println(tataladd);
System.out.println(totaleven);
		grandtotal=tataladd+totaleven;
		System.out.println(grandtotal);
		
		
		
		
		
		
		
	}

}
