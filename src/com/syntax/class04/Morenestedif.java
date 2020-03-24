package com.syntax.class04;

public class Morenestedif {

	public static void main(String[] args) {
		//declare date and day
		//if day is friday>>if date is 13 we gonna watch scary movie
		//if dat is not 13 we gonna wach a comedy movie
boolean isfriday=true;
int date =13;
if(isfriday) {
System.out.println("today is friday iam going to watch a movie");
if (date==13) {
	System.out.println("I will wach a scary movie");
}else {
	System.out.println("I will wach a comedy movie");
}

}else {
	System.out.println("i am stying home");
}
		
		
	}

}