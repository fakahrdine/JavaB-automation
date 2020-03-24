package com.syntax.classReview;

public class SumevnWhile {

	public static void main(String[] args) {
		int count = 1;
//int totaleven=0, totaladd=0;
//while(count<=100) {
//	count++;
//	if(count%2==0) {
//		totaladd+=count;
//	}else {
//		totaleven+=count;
//	}
//	
//	//count++;
//}System.out.println(totaladd);
//System.out.println(totaleven);
System.out.println("Using do while ++++++++++++++");
count=1;
int addtotal=0;
do {
	addtotal+=count;
	count+=2;
}while(count<5);
System.out.println(addtotal);






	}

}
