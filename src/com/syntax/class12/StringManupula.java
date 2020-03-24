package com.syntax.class12;

public class StringManupula {

	public static void main(String[] args) {
		
String pool= "Today I have to go to california to see my friends";
 

char numba =pool.charAt(11);
System.out.println(numba+".");
// now lets print how all the caracter in the string
int siz = pool.length();
System.out.println(siz);
String [] pola =pool.split("/");
for(int i=0;i<pola.length;i++) {
	System.out.print(pola[i]+" ");
}
System.out.println();
System.out.println("<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>..>>>");
String Door ="Hi body this door is not opening can you help me please";
char dex =Door.charAt(15);
System.out.println(dex);
// Now leits retrieve all the carcters using for loop
int dsiz =Door.length();
char Car;
for (int x =0;x<dsiz;x++) {
	Car=Door.charAt(x);
	System.out.print(Car+",");
}



	}
	

}
