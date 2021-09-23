package com.java.examples;

public class InstanceOfTest {

	final int j=20;
	
	public void sum() {
		System.out.println(j);
	}
	public static void main(String[] args) {
		
		SuperCls sup = new SuperCls();
		SubCls sub= new SubCls();
		
		System.out.println(sup instanceof SubCls);
		System.out.println(sub instanceof SuperCls);
		System.out.println(sub instanceof java.lang.Object);
		new InstanceOfTest().sum();
	}
}

class SuperCls{
	
}
class SubCls extends SuperCls{
	
}