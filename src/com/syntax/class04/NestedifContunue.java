package com.syntax.class04;

public class NestedifContunue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//check if patient jhas anyb allergies 
		// if not lallergies .. you are healthy
		//otherwise chfeck if oatiente
		// orange allergy >> do not eate orange
		//apple allergy>>do not eate apples
		//kiwi allery>> do not eate kiwis
		boolean allergy=false;
		boolean appleallergy=false;
		boolean orangeallergy=true;
		boolean kiwiallergy=false;
		if (allergy) {
			System.out.println("please answer bellow");
			if(orangeallergy) {
				System.out.println("do not eat orange");
				if (appleallergy) {
					System.out.println("do not eate apples");
				}
				if(kiwiallergy) {
					System.out.println("do not eate kiwi please");
				}
			}
		}else {
			System.out.println("you are healthy person");
		}

	}

}
