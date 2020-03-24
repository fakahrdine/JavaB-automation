package com.syntax.class10;

public class Arraylenght {

	public static void main(String[] args) {
System.out.println("------------creating arrays of cities---------------------");
String[]cities= {"Washington dc ","new york","paris","Miami","Los anglos","dalls","Chantilly"};
System.out.println("I live in cities "+cities[2]);
// I live in paris
int x=1;
System.out.println(cities[x]);
x+=3;
System.out.println(cities[x]);
// how many element stored in our arrays
int arraySize =cities.length;
System.out.println("we have "+arraySize+" cities");
// how we can access to the last elemen
System.out.println(cities[arraySize-1]);
// how we can get all element from an array

	}

}
