package com.syntax.class17_1;

import com.syntax.class17.AccessModefiers;

public class Accessingmembersfromdefpack {

	public static void main(String[] args) {
		AccessModefiers obj1 =new AccessModefiers();
		AccessModefiers.title="Scrum Master"; // only public member can access
		obj1.method1();
		System.out.println(AccessModefiers.title);// accees static members in static way
	
		
	}

}
