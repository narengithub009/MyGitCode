package com.java.examples;

public class EncapsulationTest {
	public static void main(String[] args) {
		Employee1 e1=new Employee1();
		e1.setId(10);
		e1.setName("Aswitha");
		System.out.println(e1.getId()+"  "+e1.getName());
	}
}	

class Employee1 {

	private String name;
	private int id;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
}