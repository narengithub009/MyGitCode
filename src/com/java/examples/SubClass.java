package com.java.examples;

public class SubClass extends MyClass{ //extends MyClass {
	
	private static int i=10;
	private int j=20;
	static {
		System.out.println("SubClass ----- Static block");
	
	}
	{
		System.out.println("Subclass ------ Non static block" +i);
		System.out.println(super.i);
	}
	
	public SubClass() {
		super();
		System.out.println("Subclass ------ Constructor");
	}
	
	public static void main(String[] args) {
		MyClass s=new SubClass();
		//System.out.println(s.i);
		
	}
}
