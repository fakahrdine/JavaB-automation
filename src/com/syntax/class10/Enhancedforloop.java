package com.syntax.class10;

public class Enhancedforloop {
public static void main(String[] args) {
	String[] fruits= {"Banan ","orange","kiwi","apple"};
	// if fruit is apple print the is your favorie fruit
// using enhanced for loop 
for(String fru :fruits) {
	if(fru.equals("apple")) {
		System.out.println(fru+" is your favorite fruits");
	}else {
		System.out.println(fru);
	}
}
System.out.println("Doing the same opration with regular forloop");	
	for(int i=0;i<fruits.length;i++) {
		System.out.println(fruits[i]);
	}
	
}
}
