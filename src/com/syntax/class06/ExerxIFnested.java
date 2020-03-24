package com.syntax.class06;

import java.util.Scanner;

public class ExerxIFnested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan =new Scanner(System.in);
	String sale;
	double price  ;
	double descount = 0 ;
	double finalprice = 0 ;
	
	System.out.println("Do you have a sale this weekend");
	sale =scan.nextLine();
	
	if(sale.equals("Yes")){
		System.out.println("What is the price of the item");
		price =scan.nextDouble();
		if(price<20) {
		finalprice= price*0.1;
		}else if(price<20 && price>100 ) {
		finalprice = price*0.2;
		}else if(price>100 && price <500){
			finalprice =price *0.3;
		}else if (price>500) {
			finalprice=price *0.5;
		}
		System.out.println("After " +descount+ " "
				+ "descount the price of the item reduced frome "+price+ " To "+finalprice);
		
	}else {
		System.out.println("Iam not goig to shopping today");
	}
	
	
	
		
		
	}

}
