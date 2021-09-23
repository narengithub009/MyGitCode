package com.java.examples;

public class MyClass {
	
	protected static int i=78;
	static {
		System.out.println("MyClass ------- Static block");
	}
	{
		System.out.println("MyClass --------- Non static block");
	}
	public MyClass(int i) {
		this();
		System.out.println("MyClass --------  Constructor");
		
	}
	
	
	  public MyClass() {
		// TODO Auto-generated constructor stub
	}


	public static void main(String[] args) { // System.out.println(new
	  MyClass my = new MyClass(12); 
	  System.out.println(my.getClass());
	  }
	}
