package com.syntax.class10;

public class practiseTask {

	public static void main(String[] args) {
		String[] animals= {"dogs","cats","elephants","lions","chekens","seagles"};
	int arraysiz =animals.length;
		System.out.println(arraysiz);
	for(int dex=0;dex<arraysiz;dex++) {
		System.out.println(animals[dex]);
	}
	for(String anima:animals) {
		System.out.println(anima);
	}
	int sum = 0;
	int[] numbers= {78,12,13,7,78,11,100,1000,99,45,56,159};
		for(int num:numbers) {
			sum=sum+num;
		}
		String capitol = null;
		System.out.println(sum);
		String[]countries= {"gana","Morocco","spain","usa","Egypt","italy",};
		for(int i=0;i<countries.length;i++) {
			//System.out.println(countries[i]);
			if(countries[i].equals("gana")) {
			capitol="Sabb??";
		}else if (countries[i].equals("Morocco")){
		capitol="Rabat";*
		}else if (countries[i].equals("spain")){
			capitol="Madrid";
			}else if (countries[i].equals("usa")){
				capitol="Washinton";
			}else if (countries[i].equals("Egypt")){
				capitol="Cairo";
			}else if (countries[i].equals("Italy")){
				capitol="Milano";
			}
			System.out.println(countries[i]+" "+capitol);
					
	}

}}
