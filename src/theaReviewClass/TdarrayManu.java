package theaReviewClass;

public class TdarrayManu {

	public static void main(String[] args) {
int [][] Data= {
		{-11,23,59,77,100,1000,32,},
		{78,22,000000,78,800,90,5},
		{700,45545,56,21,12,0,23},
		{8,4,99,22,337,0,45}
		
};		
int datSize=Data.length;
System.out.println(datSize);
// lets print the lenght of each row
int row1=Data[0].length;
int row2=Data[1].length;
int row3=Data[2].length;
int row4=Data[3].length;
System.out.println(row1);
System.out.println(row2);
System.out.println(row3);
System.out.println(row4);
int sum = 0;
int minu=Data[0][0];
int max=Data[0][0];
for(int Row=0;Row<datSize;Row++) {
	for(int col  =0;col<Data[Row].length;col++) {
		int  numbers=Data[Row][col];
	if(numbers< minu) {
		minu=numbers;	
	}
	if(numbers>max) {
		max=numbers;
	}
	}
	
}		
	System.out.println("++"+minu);
	System.out.println("++"+max);
	
	
	
	}
}

