package com.syntax.class14;

public class Cars {
// define featureS/ATTRIBUTES /PROPERTIES/ of the car
String make;
String model;
int year;
String colore;
int speed;



//-------<<<<<<---------------------->>>>>>>>>>>>>>>>
// lets define the behavoir of our class in the form of methods
// lets create methods'
// our care can perform 3 actions 
// Behaviors are independent
// these methods or behavior will be available to all object 
// Methods in java can be with parameters sn without
void drive() {
	System.out.println(make +" can drive ");
}
void accelerate() {
	System.out.println(make +" can accelerate");
}
void  makeNoise() {
	System.out.println(make +" make noise ");
}
void stop() {
	System.out.println(make+" can stops");
}




// this main methode could be in new other class
public static void main(String[] args) {
// building  indevidual objects	
	 Cars car1=new Cars();
	car1.make="Toyota";
	car1.model="corolla";
	car1.colore="grey";
	car1.year=2018;
	car1.speed=400;
	// lets creater another object of Car typ
	Cars car2=new Cars();
	car2.make="Honda";
	car2.model="civic";
	car2.colore="White";
	car2.year=2016;
	car2.speed=300;
	System.out.println(car1.make+" VS "+car2.make);
	System.out.println("I drive a "+car2.colore+" "+car2.make);
	// you cannot built your object if you dont have the class
	// class is a template 
	// object -->INSTANCE OR EXAMPLE OF THE CLASS OR COPY
	// accessing methods of car class 
	car1.drive();
	car1.accelerate();
	car1.makeNoise();
	car1.stop();
	//----->>>>car2
	car2.drive();
	car2.stop();
	car2.makeNoise();
	car2.accelerate();
	
	
		
	
	
	
}
}