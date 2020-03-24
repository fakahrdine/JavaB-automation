package com.syntax.class06;

import java.util.Scanner;

public class SwichScann {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in) ;
		String  country;
		String faverotefood;
		System.out.println("please enter your contry name");
		country =input.nextLine();
		switch(country) {
		case "Morroco":
		faverotefood ="couscous";
		break;
		case "Belarus":
		faverotefood="Potato";
		break;
		case "Tajikistan":
		faverotefood ="osh";
			break;
		case "Turkey":
			faverotefood="Baklava";
			break;
		case "Afghanistan":
			faverotefood ="Mantu";
			break;
			default:
				faverotefood="unknown";
		
		}
		System.out.println("Your country favrite food is "+faverotefood);

	}

}
