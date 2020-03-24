package com.syntax.class11;

public class DDarrayss {

	public static void main(String[] args) {
//		Create an array of cars : american, german, korean, italian.
//		Then retrieve all values from that array using 2 different loops
String[][] cars ={{"Chevy","Ford","Dodge"},
	             {"Mercides","Volzvagen","BMW"},
	            {"toyota","honda","Hienday"},
	             {"Ferrari","Bogaty","bently"}
	
};
	for(int row =0;row<cars.length;row++) {
		for(int col=0;col<cars[row].length;col++) {
			System.out.print(cars[row][col]+" ");
		}
		System.out.println();
}
	System.out.println("____________________________________________________________--");
for(String[] veh:cars) {
	for(String Noc:veh) {
	System.out.print(Noc+" ");
}
System.out.println();
}
//Create an array of countries: 
//	north america countries, south america countries, europe countries, asian countries, african countries. 
//	Then print all values from that array using 2 different loops and calculate how many total countries been stored.
//		
String [][] Countries= {{"Canada","Usa","Maxico"},
		{"peru","brazil","Argantina","murugway"},
		{"France","italy","Spain"},
		{"China","japan","Korea"},
		{"Morroca ","Sudan","Egypt"}};

System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
for(String coun[]:Countries) {
	
	for(String nations:coun) {
		System.out.print(nations+" ");
		
	}
	System.out.println();
}





		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
