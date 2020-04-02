package com.syntax.class18;
//Write a program that will have a constructor:
//one with parameters and second without any parameters. 
//Create a separate Test class where you will execute both of the constructors.
//Write a java program of Class Students that takes students name and 3 subject grades.
//Inside your class also have a method to Calculate Average Grade.
//Test Student class for 5 different students with different marks. 
//Your program should print an average mark of each students name.
public class Students {
public	String Studentn;
	int subj1g;
	int subj2g;
	int subj3g;
	Students(String studname,int grade01,int grade2,int grade3){
		Studentn=studname;
		subj1g=grade01;
		subj2g=grade2;
		subj3g=grade3;
		
		
	}
	
	int average() {
		int aver = 0;
		aver=subj1g+subj2g+subj3g/3;
		return aver;
			
	}
	
	public static void main(String[] args) {
		Students stu1 =new Students("Mohamed", 12, 45, 3);
	int aver=	stu1.average();
		System.out.println("the average of is "+aver);
		Students stu2 =new Students("yossef", 13, 4, 100);
		aver=	stu2.average();
		System.out.println("the average of is "+aver);
	}
	
	

}
