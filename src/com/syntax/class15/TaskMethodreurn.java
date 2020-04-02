 package com.syntax.class15;

public class TaskMethodreurn {
	char youMark;
 char marksis(int mark) {
	 if(mark>90) {
		 youMark='A';
	 }else if (mark<90 && mark>70) {
		 youMark='b';
	 }else {
		 youMark='c';
		 
	 }
	 
	 return youMark;
 }
 
	public static void main(String[] args) {
		
		TaskMethodreurn marc =new TaskMethodreurn();
char youMar =marc.marksis(89);
	System.out.println(youMar);
	
	}

}
