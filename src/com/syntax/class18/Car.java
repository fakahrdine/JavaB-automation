package com.syntax.class18;
// Constractors
public class Car {
	String make,model,color;
	int year;
	
	public void printDetails() {
		System.out.println("I have "+year+" "+make+""+model+" in"+color+" color" );
	}

public static void main(String[] args) {
	Car car1 =new Car();// here constractor call is hapenning when object of the class created
	car1.printDetails();
	//I have 0 null null innull color
	// coonstractor intialize our objects to its default values(instance var);
	System.out.println(car1.model);
	//null here even we dont initialize the instance var the compiler is not complainnig because the constractor takes care of it 
	// constractor created invisibly
	
	
	
	
	
}
}
