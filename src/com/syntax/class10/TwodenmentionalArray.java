package com.syntax.class10;

public class TwodenmentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][]numbers=new int [3][4];
// first row
numbers[0][0]=10;
numbers[0][1]=20;
numbers[0][2]=30;
numbers[0][3]=40;
// second row
numbers[1][0]=5;
numbers[1][1]=10;
numbers[1][2]=15;
numbers[1][3]=20;
//third row
numbers[2][0]=1;
numbers[2][1]=2;
numbers[2][2]=3;
numbers[2][3]=4;
System.out.println(numbers[1][2]);
System.out.println("_________________Another way to create 2 dimantional array__________________________");

int[][] numbers1= {
		{15,26,78,78},
		{78,45,12,12},
		{15,78,20,30},
		{100,25,36,45},
};

System.out.println(numbers1[3][3]);






		
		
		
		
	}

}
