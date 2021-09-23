package com.java.examples;

public class MultipleInheritance implements MyInterface1,MyInterface2{
	
	public static void main(String[] args) {
		
		MultipleInheritance mi = new MultipleInheritance();
		mi.method1();
		mi.method2();
	}

	@Override
	public void method2() {
		System.out.println("Add imlementation for method2 of MyInterface2");
		
	}

	@Override
	public void method1() {
		System.out.println("Add imlementation for method1 of MyInterface1");
		
	}

	@Override
	public void methos3() {
		// TODO Auto-generated method stub
		
	}
}
