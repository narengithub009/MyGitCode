package com.java.examples;

public class OverLoading {
	
	public void sum(int x, double y) {
		System.out.println("The sum is "+(x+y));
	}
	public int sum(int x, int y) {
		System.out.println("The sum is "+(x+y));
		return (x+y);
	}
	static void method(int x)
	{
		System.out.println("int");
	}
	static void method(double x) {
		System.out.println("double");
	}
	public static void main(String[] args) {
		OverLoading ol=null;
		System.out.println(ol);
		ol=new OverLoading();
		ol.sum(20, 30);
		new OverLoading().sum(20, 30);
		new OverLoading().method(4);
	}
}
