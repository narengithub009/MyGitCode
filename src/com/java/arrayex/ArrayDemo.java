package com.java.arrayex;

public class ArrayDemo {
	
	public void arrayDemo() {
		int[] arrayVar;
		arrayVar = new int[10];
	
		int y =9;
		for(int i=0;i<=9;i++) {
			arrayVar[i]=y;
			y-=1;
			System.out.println("Element at index "+i+" "+arrayVar[i]);
		}
	}
	public static void main(String[] args) {
		
		ArrayDemo arrayDemo=new ArrayDemo();
		arrayDemo.arrayDemo();
	}
}
