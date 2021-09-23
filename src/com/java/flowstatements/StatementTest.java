package com.java.flowstatements;

public class StatementTest {
	
	public static void main(String[] args) {
		int i=30;
		
		if(i>=80) {
			System.out.println("PASS ---- A GRADE");
		}else if(i>=60){
			System.out.println("PASS --- B GRADE");
		}else if(i>=40) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
	}
}
