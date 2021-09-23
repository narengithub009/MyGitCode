package com.java.arrayex;

public class ArrayCopyDemo {
	public static void main(String[] args) {
		
		String[] namesCopyFrom = {"narender","Aswitha","neeraja","laxmareddy","rama","hyderabad","warangal"};
		
		String[] namesCopyTo=new String[7];
		
		System.arraycopy(namesCopyFrom, 0, namesCopyTo, 0, 7);
		
		for(String result:namesCopyTo) {
			System.out.println(result);
		}
		
	}
}
