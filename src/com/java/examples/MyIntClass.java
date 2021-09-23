package com.java.examples;

public class MyIntClass implements MyInterface{

	public static void main(String[] args) {
		MyIntClass my=new MyIntClass();
		my.method1();
		my.method2();
		
		System.out.println("by default Interface variable are constant"+my.i);
	}
	@Override
	public void method1() {
		System.out.println("Method1 implementation");
		
	}

	@Override
	public void method2() {
		System.out.println("Method2 implementation");
		
	}

}
