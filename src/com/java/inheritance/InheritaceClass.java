package com.java.inheritance;

public class InheritaceClass {
	public static void main(String[] args) {
		Lion obj = new Lion();
		obj.food();
	}
}

class Animal{
	
	public void food() {
		System.out.println("Animal eat food");
	}
}

class Lion extends Animal{
	
}