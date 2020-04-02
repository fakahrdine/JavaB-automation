package com.syntax.class19;
//Write program as a Student class   that has instance variables name and address. 
//Create a constructor that will initialize those variables.
//Print name & address of given  student using displayInfo method.


public class Students {
	String name;
	String address;
	public Students(String name, String address) {
		this.name=name;
		this.address=address;
	}
	void displainfo(){
		System.out.println("my name is "+this.name+" an my adress is "+this.address);
		
	}
	public static void main(String[] args) {
		Students obj =new Students("Mohamed", "4100 ronson dr alexandria");
		obj.displainfo();
	}

}
