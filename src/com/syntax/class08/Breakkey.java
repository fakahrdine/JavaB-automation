package com.syntax.class08;

public class Breakkey {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			if(i==4) {
				System.out.println("I am stopping loop");
				break;
			}
			System.out.println(i);
			System.out.println("I am iside the loop");
		}
System.out.println("I am outside your loop");

System.out.println("____________Continuekey+___________________________");
for(int y=1; y<=10 ;y++) {
if(y==4) {
	System.out.println("I am skipping iteration");
	continue;//it will skip the current iteration//
}
System.out.println("I am inside kthe loop");
System.out.println(y);
	
}
for(int h=1;h>=21;h++) {
	if(h==11 || h==15 ||h==20) {
		continue;
	}
	System.out.println(h);
} 


	}

}
