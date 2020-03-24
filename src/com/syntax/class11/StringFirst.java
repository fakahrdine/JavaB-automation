package com.syntax.class11;

public class StringFirst {

	public static void main(String[] args) {
String myname =new String("fakhar");
System.out.println(myname);
System.out.println("the size is:"+myname.length());
System.out.println("tolowercase"+myname.toLowerCase());
//String upper =myname.toUpperCase();
//System.out.println(upper);
String lastn ="Fakhar";
boolean Names;

Names=  myname.equals(lastn);
System.out.println(Names);
// so when we have a equals or equalsegnorecase the programme return me boolean value 
	}
}

