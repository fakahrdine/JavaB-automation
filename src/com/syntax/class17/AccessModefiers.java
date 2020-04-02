package com.syntax.class17;

public class AccessModefiers {
	public static String title;// accessibel everywhere
	protected String LastNmae;//accessble whithin same packa
	double salary;// accessble whithin same packa
	private long ssn;//Accessable only within the same class

	public void method1() {
		System.out.println("I am public method");
	}

	protected void method2() {
		System.out.println("I am protected method");
	}

	void method3() {
		System.out.println("I am a default method");
	}

	private void method4() {
		System.out.println("I am a private method");

	}

	public static void main(String[] args) {
    AccessModefiers  Access=new AccessModefiers();
    Access.LastNmae="Fakhardine";
    Access.salary=20000;
    Access.ssn=445235412;
    title="Qa tester";
    Access.method1();
    Access.method2();
    Access.method3();
    Access.method4();
    
    
    
    
    
	}

}
