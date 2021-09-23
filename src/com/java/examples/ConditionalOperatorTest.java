package com.java.examples;

public class ConditionalOperatorTest {
	public static void main(String[] args) {
		
		int x=2;
		int y=4;
		
		System.out.println("-------&&--------");
		
		System.out.println(x==3&&y==4);
		System.out.println(x==2&&y==4);
		System.out.println(x==2&&y==9);
		
		System.out.println("-------||---------");
		
		System.out.println(x==2||y==4);
		System.out.println(x==0||y==4);
		System.out.println(x==9||y==3);
	}
}
