package com.java.examples;

public class Test {
	static int i=10, j=19;
	class InnerClass{
		
		public void innerMethod() {
			System.out.println("InnerClass ----- Method"+i);
			sum();
		}
		
	}
	static {
		System.out.println("Outerclass ------ static method");
	}
	
	public int sum() {
		int q=i+j;
		System.out.println("The sum is :"+q);
		return q;
	}
	public static void main(String[] args) {
		System.out.println("Hello World");
		new Test().new InnerClass().innerMethod();
		
	}
}
