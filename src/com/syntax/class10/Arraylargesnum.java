package com.syntax.class10;

public class Arraylargesnum {
	public static void main(String[] args) {
//		int[]nums={15,7,26};//my way didnt work
//
//		System.out.println(nums.length);
//		int larges;
//		if(nums[0]>nums[1])	{
//			larges=nums[0];
//		}else {
//			larges=nums[1];
//					
//		} if(nums[1]>nums[2])  {
//			larges=nums[1];
//		}else {
//			larges=nums[2];
//		}
//			System.out.println(larges);
			
	//find largest element 	
// find the largest element fron an array
		int[]nums= {200,30,78,-22,56,9000,15,45};
		int largest =nums[0];
		for(int i=1;i<nums.length;i++) {
			if(nums[i]>largest) {
				largest=nums[i];
			}
			
		}
		System.out.println("the largest number "+largest);
		
		
		
		
		
		
		
		
		
	}

}
